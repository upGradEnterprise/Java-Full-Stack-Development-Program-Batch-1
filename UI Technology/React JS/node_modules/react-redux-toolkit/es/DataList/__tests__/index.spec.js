import React from 'react';
import { shallow } from 'enzyme';
import configureStore from 'redux-mock-store';
import DataList from '../index';

const initialState = {
  dataList: {
    listID_1: {
      listURL: 'list1url',
      total: 10,
      loading: false,
      data: []
    }
  }
};
const mockStore = configureStore();
const store = mockStore(initialState);

describe('DataList component', () => {
  const props = {
    dataListSendRequest: () => {},
    Component: () => <div />,
    componentProps: {
      className: 'dataListParent'
    },
    listID: 'listID_1'
  };
  it('Shallow render of DataList', () => {
    const wrapper = shallow(<DataList store={store} {...props} />);
    expect(wrapper).toMatchSnapshot();
  });
});
