import * as actionTypes from './constants';

/**
 * @description Every modal window has this object saved in store.
 * @typedef modalObjectInStore
 * @memberof module:ModalWindow
 * @property {boolean} opened
 * @property {boolean} multiWindows If true, modalWindows will support changing steps (windows) inside modal
 * @property {Object} currentWindow Object of current window
 * @property {Object|undefined} currentWindow.parent Parent window
 * @property {ReactComponent} currentWindow.component Component to render
 * @property {Object|undefined} currentWindow.childs Childs window
 * @property {Object|undefined} currentWindow.props Props to give for component
 * @property {Object} allWindows Object of all windows
 * @property {Function} onCloseCallback Is declared by modalOpen action, executed and removed by modalClose action. It can be used to clear data. *Can be cleared only data of top-parent window.
 */


export default (state = {}, action = {}) => {
  switch (action.type) {
    case actionTypes.MODAL_INIT: {
      return {
        ...state,
        [action.payload.modalID]: {
          opened: false,
          multiWindows: action.payload.multiWindows,
          currentWindow: action.payload.allWindows,
          allWindows: action.payload.allWindows
        }
      };
    }
    case actionTypes.MODAL_OPEN: {
      state[action.payload.modalID].currentWindow.props = {
        ...state[action.payload.modalID].currentWindow.props,
        ...action.payload.props
      };


      return {
        ...state,
        [action.payload.modalID]: {
          ...state[action.payload.modalID],
          onCloseCallback: action.payload.onCloseCallback,
          opened: true
        }
      };
    }
    case actionTypes.MODAL_CLOSE: {
      return {
        ...state,
        [action.payload.modalID]: {
          ...state[action.payload.modalID],
          opened: false,
          currentWindow: state[action.payload.modalID].multiWindows
            ? state[action.payload.modalID].allWindows
            : state[action.payload.modalID].currentWindow
        }
      };
    }
    case actionTypes.MODAL_HAS_CLOSED: {
      return {
        ...state,
        [action.payload.modalID]: {
          ...state[action.payload.modalID],
          currentWindow: {
            ...state[action.payload.modalID].currentWindow,
            props: action.payload.replaceProps
          },
          onCloseCallback: undefined
        }
      };
    }
    case actionTypes.MODAL_GO_TO_CHILD: {
      return {
        ...state,
        [action.payload.modalID]: {
          ...state[action.payload.modalID],
          currentWindow: state[action.payload.modalID].currentWindow.childs[action.payload.childID]
        }
      };
    }
    case actionTypes.MODAL_GO_TO_PARENT: {
      return {
        ...state,
        [action.payload.modalID]: {
          ...state[action.payload.modalID],
          currentWindow: state[action.payload.modalID].currentWindow.parent
        }
      };
    }
    default:
      return state;
  }
};
