import React from 'react';
import PropTypes from 'prop-types';
import { connect } from 'react-redux';
import { closeModal, openModal, initModal, modalGoToChild, modalGoToParent, modalSend } from './actions';
import transformAllWindows from './utils/transformAllWindows';
import store from '../../store';

export const open = (...params) => store.dispatch(openModal(...params));
export const close = (modalID) => store.dispatch(closeModal(modalID));
export const send = (...params) => store.dispatch(modalSend(...params));


/**
 * @module ModalWindow
 */
/**
 * Renders modal window
 * @memberof module:ModalWindow
 */
class ModalWindow extends React.Component {
  constructor(props) {
    super(props);
    let { classes } = props;
    if (typeof classes !== 'object') classes = {};

    this.classes = {
      modalParent: 'myModalWindow',
      modalParentOpened: 'opened',
      modalContainer: 'modalContainer',
      modalDialog: 'modalDialog',
      ...classes
    };
  }

  componentDidMount() {
    const {
      modals, modalID,
      initModal: initModalWindow,
      multiWindows, allWindows
    } = this.props;

    // const modal = modals[modalID];
    initModalWindow(
      modalID,
      multiWindows,
      transformAllWindows(allWindows)
    );
  }

  render() {
    const {
      modals, modalID,
      closeModal: closeModalWindow,
      modalGoToChild: modalWindowGoToChild,
      modalGoToParent: modalWindowGoToParent,
      multiWindows
    } = this.props;

    const { classes } = this;

    const modal = modals[modalID];
    const ModalBody = (modal && modal.currentWindow) ? modal.currentWindow.component : false;

    let otherProps = {};
    if (ModalBody) {
      if (typeof modal.currentWindow.serializeProps === 'function') {
        otherProps = modal.currentWindow.serializeProps(modal.currentWindow.props);
      } else {
        otherProps = { modalProps: modal.currentWindow.props };
      }
    }
    return (
      <div
        className={modal && modal.opened ? `${classes.modalParent} ${classes.modalParentOpened}` : classes.modalParent}
        onClick={
          (event) => {
            if (
              event.target.className === `${classes.modalParent} ${classes.modalParentOpened}`
              || event.target.className === classes.modalContainer
            ) {
              closeModalWindow(modalID);
            }
          }
        }
        tabIndex={-1}
      >
        <div className={classes.modalContainer}>
          <div className={classes.modalDialog}>
            { ModalBody
              ? (
                <ModalBody
                  {...otherProps}
                  modalOpened={modal.opened}
                  modalGoToChild={multiWindows ? modalWindowGoToChild.bind(null, modalID) : undefined}
                  modalGoToParent={multiWindows ? modalWindowGoToParent.bind(null, modalID) : undefined}
                  closeModal={closeModalWindow.bind(null, modalID)}
                  modalParentProps={modal.currentWindow.parent && modal.currentWindow.parent.props}
                />
              )
              : null
            }
          </div>
        </div>
      </div>
    );
  }
}

ModalWindow.propTypes = {
  modalID: PropTypes.string.isRequired,
  multiWindows: PropTypes.bool,
  allWindows: PropTypes.instanceOf(Object),
  modals: PropTypes.instanceOf(Object).isRequired,
  closeModal: PropTypes.func.isRequired,
  initModal: PropTypes.func.isRequired,
  modalGoToChild: PropTypes.func,
  modalGoToParent: PropTypes.func,
  classes: PropTypes.instanceOf(Object)
};
ModalWindow.defaultProps = {
  multiWindows: false,
  allWindows: undefined,
  modalGoToChild: undefined,
  modalGoToParent: undefined,
  classes: {}
};

function mapStateToProps(store_) {
  return {
    modals: store_.modals
  };
}

export default connect(mapStateToProps, {
  closeModal, initModal, modalGoToChild, modalGoToParent
})(ModalWindow);
