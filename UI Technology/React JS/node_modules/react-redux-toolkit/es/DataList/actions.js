import * as actionTypes from './constants';


export function dataListSendRequest(listID, dataList) { // epic , reducer
  return {
    type: actionTypes.DATA_LIST_SEND_REQUEST,
    payload: {
      listID,
      dataList
    }
  };
}

export function dataListReloadData(listID) {
  return {
    type: actionTypes.DATA_LIST_RELOAD_DATA,
    payload: {
      listID
    }
  };
}

export function dataListReceived(listID, listURL, { data, total }) { // reducer
  return {
    type: actionTypes.DATA_LIST_RECEIVED,
    payload: {
      listID,
      listURL,
      data,
      total
    }
  };
}
export function dataListGotError(listID, listURL, errorMessage) { // reducer
  return {
    type: actionTypes.DATA_LIST_GOT_ERROR,
    payload: {
      listID,
      listURL,
      errorMessage
    }
  };
}
export function dataListClean(listID) { // reducer
  return {
    type: actionTypes.DATA_LIST_CLEAN,
    payload: {
      listID
    }
  };
}

// export function dataChangeFilters(listID) {
//   return {
//     type: actionTypes.DATA_LIST_CHANGE_FILTERS,
//     payload: {
//       listID
//     }
//   };
// }
// export function dataChangePagination(listID) {
//   return {
//     type: actionTypes.DATA_LIST_CHANGE_PAGINATION,
//     payload: {
//       listID
//     }
//   };
// }
// export function dataListSorting(listID) {
//   return {
//     type: actionTypes.DATA_LIST_CHANGE_SORTING,
//     payload: {
//       listID
//     }
//   };
// }
