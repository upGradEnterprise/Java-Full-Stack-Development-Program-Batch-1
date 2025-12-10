import React from 'react';
import { connect } from 'react-redux';
import PropTypes from 'prop-types';
import { dataListSendRequest, dataListClean } from './actions';
import DataListPagination from './DataListPagination';
import DataListFilter from './DataListFilter';
import handleSorting from './handleSorting';

export * from './actions';

export { DataListPagination, DataListFilter, handleSorting };
/**
 * Component brings in high level abstraction for loaded data.
 * It does fetching data (filtering, sorting, pagination) and keeping it in the redux store.
 * @module DataList
 */
/**
 * Renders DataList
 * @memberof module:DataList
 */
class DataList extends React.Component {
  constructor(props) {
    super(props);

    this.dataList = {
      params: {},
      loading: true
    };
  }

  componentDidMount() {
    const { forceUpdateOnMount } = this.props;
    this.sendInitRequest(forceUpdateOnMount);
  }

  componentWillReceiveProps(nextProps) {
    const { listURL } = this.props;
    if (nextProps.listURL !== listURL) {
      this.sendInitRequest();
    }
  }

  componentWillUnmount() {
    const { forceKeepData, listID, dataListClean: dataListCleanFromProps } = this.props;
    if (!forceKeepData) dataListCleanFromProps(listID);
  }

  /**
   * Sends initial request after component mounted
   * @param {boolean} forceUpdate Forces to send request (even if this DataList is already loaded)
   */
  sendInitRequest(forceUpdate) {
    const {
      dataListSendRequest: dataListSendRequestFromProps, allDataLists,
      listID, listURL, params, transformResponse
    } = this.props;

    if (forceUpdate || (!allDataLists[listID] || allDataLists[listID].listURL !== listURL || allDataLists[listID].errorMessage || allDataLists[listID].params !== params)) {
      dataListSendRequestFromProps(listID, { listURL, params, transformResponse });
    }
  }

  render() {
    const
      {
        allDataLists, dataListSendRequest: dataListSendRequestFromProps,
        Component, componentProps, listID
      } = this.props;
    const
      sorted = [];
    if (Component) {
      if (allDataLists[listID]) {
        this.dataList = { ...allDataLists[listID] };
      }
      if (this.dataList.params && this.dataList.params._sort) {
        const actualSorting = this.dataList.params._sort.split(':');
        sorted.push({
          id: actualSorting[0],
          desc: actualSorting[1] === 'desc' ? true : false
        });
      }
    }

    if (Component) {
      return (
        <Component
          // {...componentProps}
          onSortedChange={handleSorting.bind(null, dataListSendRequestFromProps, listID, this.dataList)}
          data={this.dataList.data}
          sorted={sorted}
          loading={this.dataList.loading}
          {...componentProps}
        />
      );
    }
    return null;
  }
}

DataList.propTypes = {
  listID: PropTypes.string.isRequired,
  forceKeepData: PropTypes.bool,
  Component: PropTypes.func,
  componentProps: PropTypes.instanceOf(Object)
};
DataList.defaultProps = {
  forceKeepData: false,
  componentProps: {},
  Component: undefined
};

const mapStateToProps = (state) => (
  {
    allDataLists: state.dataList
  }
);

export default connect(mapStateToProps, {
  dataListSendRequest, dataListClean
})(DataList);
