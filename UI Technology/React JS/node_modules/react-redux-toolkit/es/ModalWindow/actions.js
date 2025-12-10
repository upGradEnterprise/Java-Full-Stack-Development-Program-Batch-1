import * as actionTypes from './constants';

export function openModal(modalID, props, onCloseCallback) {
  return {
    type: actionTypes.MODAL_OPEN,
    payload: {
      modalID,
      props,
      onCloseCallback
    }
  };
}

export function closeModal(modalID) {
  return {
    type: actionTypes.MODAL_CLOSE,
    payload: {
      modalID
    }
  };
}

export function modalHasClosed(modalID, replaceProps) {
  return {
    type: actionTypes.MODAL_HAS_CLOSED,
    payload: {
      modalID,
      replaceProps
    }
  };
}

export function modalSend(modalID, requestConfig, cb) {
  return {
    type: actionTypes.MODAL_SEND,
    payload: {
      modalID,
      requestConfig,
      cb
    }
  };
}

export function modalGoToChild(modalID, childID) {
  return {
    type: actionTypes.MODAL_GO_TO_CHILD,
    payload: {
      modalID,
      childID
    }
  };
}

export function modalGoToParent(modalID) {
  return {
    type: actionTypes.MODAL_GO_TO_PARENT,
    payload: {
      modalID
    }
  };
}

export function initModal(modalID, multiWindows, allWindows) {
  return {
    type: actionTypes.MODAL_INIT,
    payload: {
      modalID,
      multiWindows,
      allWindows
    }
  };
}
