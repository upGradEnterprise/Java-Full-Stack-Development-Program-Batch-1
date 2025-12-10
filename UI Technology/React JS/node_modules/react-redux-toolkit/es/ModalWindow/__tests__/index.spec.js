import React from 'react';
import { shallow } from 'enzyme';
import configureStore from 'redux-mock-store';
import ModalWindow from '../index';

const modalID = 'testModal';
const initialState = {
  modals: {
    [modalID]: {
      opened: false,
      data: undefined
    }
  }
};
const mockStore = configureStore();
const store = mockStore(initialState);

describe('ModalWindow component', () => {
  it('Shallow render of ModalWindow', () => {
    const props = {
      closeModalWindow: () => {},
      children: () => (<div>Test content of modal window.</div>),
      modalID
    };
    const wrapper = shallow(<ModalWindow store={store} {...props} />);
    expect(wrapper).toMatchSnapshot();
  });
});
