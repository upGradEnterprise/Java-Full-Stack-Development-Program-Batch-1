import { Observable } from 'rxjs';
import { combineEpics } from 'redux-observable';
import { handleErrorDetailed } from '../../api_helper';
import * as actionTypes from './constants';
import { closeModal, modalHasClosed } from './actions';
import strapi from '../../strapi';
/**
 * It is called when form from modal window is submitet
 * @memberof module:ModalWindow
 * @async
 */

const addNotification = () => ({
// here should be notification action creator
});

function modalSendEpic(action$) {
  return action$.ofType(actionTypes.MODAL_SEND)
    .map((action) => action.payload)
    .switchMap(
      ({
        modalID,
        requestConfig: {
          method,
          url,
          ...requestConfig
        },
        cb
      }) => (
        Observable.fromPromise(strapi.request(method, url, requestConfig))
          .catch(handleErrorDetailed)
          .mergeMap(
            (result) => {
              if (!result.error) {
              // TODO: fix hack
                return cb ? Observable.of(
                  closeModal(modalID),
                  cb(result),
                  addNotification({
                    type: 'success',
                    text: 'success'
                  })
                ) : Observable.of(
                  closeModal(modalID),
                  addNotification({
                    type: 'success',
                    text: 'success'
                  })
                );
              }
              return Observable.of(
                closeModal(modalID),
                addNotification({
                  type: 'error',
                  text: result.message
                })
              );
            }
          )
      ));
}

const scrollBlocker = (e) => { e.preventDefault(); };
const switchBodyScroll = (disable) => {
  const body = document.getElementsByTagName('body')[0];
  const html = document.getElementsByTagName('html')[0];
  if (disable) {
    body.style.overflow = 'hidden';
    body.style.position = 'fixed';
    body.addEventListener('scroll', scrollBlocker);
    // html.style.overflow = 'hidden';
    // html.addEventListener('touchmove', scrollBlocker);
  } else {
    body.style.overflow = '';
    body.style.position = '';
    body.removeEventListener('scroll', scrollBlocker);
    // html.style.overflow = '';
    // html.removeEventListener('touchmove', scrollBlocker);
  }
};

function modalOpenEpic(action$) {
  return action$.ofType(actionTypes.MODAL_OPEN)
    .map((action) => action.payload)
    .switchMap(() => {
      switchBodyScroll(true);
      return Observable.empty();
    });
}

function modalCloseEpic(action$, state$) {
  return action$.ofType(actionTypes.MODAL_CLOSE)
    .map((action) => action.payload)
    .switchMap(({ modalID }) => {
      switchBodyScroll();
      const { modals } = state$.getState();
      if (modals && modals[modalID] && typeof modals[modalID].onCloseCallback === 'function') {
        let replaceProps = modals[modalID].onCloseCallback(modals[modalID].currentWindow.props);
        if (typeof replaceProps !== 'object') {
          console.error('Wrong type of props returned by onCloseCallback function. Expected object.');
          replaceProps = {};
        }
        return Observable.of(
          modalHasClosed(modalID, replaceProps)
        );
      }
      return Observable.empty();
    });
}

export default combineEpics(
  modalSendEpic, modalOpenEpic, modalCloseEpic
);
