import React from 'react';
import { connect } from 'react-redux';
import PropTypes from 'prop-types';
import { dataListSendRequest } from './actions';

/**
 * Filtering component DataList
 * @memberof module:DataList
 */
class DataListFilter extends React.Component {
  constructor(props) {
    super(props);

    this.dataList = {
      params: {}
    };
  }

  /**
   * Replaces old filters by new.
   * If need to remove a parameter set empty string as value of parameter
   * @param {Object} filters Paramets list for filtering
   * @param {string|number} filters.nameOfParameter Parameter to filter with
   */
  addFilters = (filters) => {
    const { dataListSendRequest: dataListSendReq, listID } = this.props;

    Object.keys(filters).forEach((filterID) => {
      const filterValue = filters[filterID];
      if (filterValue === '') {
        delete this.dataList.params[filterID];
      } else {
        this.dataList.params[filterID] = filterValue;
      }
    });
    dataListSendReq(
      listID,
      this.dataList
    );
  }

  render() {
    const
      {
        allDataLists,
        Component, listID,
        componentProps
      } = this.props;

    if (allDataLists[listID]) {
      this.dataList = {
        ...allDataLists[listID],
        params: {
          ...allDataLists[listID].params,
          _start: 0
        }
      };
    }
    const allParams = (this.dataList && this.dataList.params) ? this.dataList.params : {};
    return (
      <Component
        onChange={this.addFilters}
        {...componentProps}
        allParams={allParams}
      />
    );
  }
}

DataListFilter.propTypes = {
  Component: PropTypes.func.isRequired,
  listID: PropTypes.string.isRequired,
  componentProps: PropTypes.instanceOf(Object)
};

DataListFilter.defaultProps = {
  componentProps: {}
};

const mapStateToProps = (state) => ({
  allDataLists: state.dataList
});
export default connect(mapStateToProps, {
  dataListSendRequest
})(DataListFilter);
