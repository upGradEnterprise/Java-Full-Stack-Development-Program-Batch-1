import { Observable } from 'rxjs';
import { combineEpics } from 'redux-observable';
import { handleErrorDetailed } from '../../api_helper';
import * as actionTypes from './constants';
import axiosInstance from '../../axios';
import { addNotification } from '../NotificationGenerator/actions';
import { dataListReceived, dataListGotError } from './actions';

function dataListSendRequestEpic(action$) {
  return action$.ofType(actionTypes.DATA_LIST_SEND_REQUEST)
    .map((action) => action.payload)
    .mergeMap(
      ({ listID, dataList: { listURL, params, transformResponse } }) => (
        Observable.fromPromise(axiosInstance.get(listURL, { params }))
          .catch(handleErrorDetailed)
          .mergeMap(
            (result) => {
              if (!result.error) {
                const parsedResult = transformResponse ? transformResponse(result) : { data: result };
                return Observable.of(
                  dataListReceived(listID, listURL, parsedResult)
                );
              }

              return Observable.of(
                dataListGotError(listID, listURL, result.message),
                addNotification({
                  type: 'error',
                  text: result.message
                })
              );
            }
          )
      ));
}

function dataListReloadDataEpic(action$, state$) {
  return action$.ofType(actionTypes.DATA_LIST_RELOAD_DATA)
    .map((action) => action.payload.listID)
    .mergeMap((listID) => {
      const { dataList } = state$.getState();
      const { listURL, params, transformResponse } = dataList[listID];
      return Observable.fromPromise(axiosInstance.get(listURL, { params }))
        .catch(handleErrorDetailed)
        .mergeMap(
          (result) => {
            if (!result.error) {
              const parsedResult = transformResponse ? transformResponse(result) : { data: result };
              return Observable.of(
                dataListReceived(listID, listURL, parsedResult)
              );
            }
            return Observable.of(
              dataListGotError(listID, listURL, result.message),
              addNotification({
                type: 'error',
                text: result.message
              })
            );
          }
        );
    });
}

export default combineEpics(
  dataListSendRequestEpic, dataListReloadDataEpic
);
