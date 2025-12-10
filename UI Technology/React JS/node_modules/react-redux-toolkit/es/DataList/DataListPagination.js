import React from 'react';
import { connect } from 'react-redux';
import PropTypes from 'prop-types';
import { dataListSendRequest } from './actions';

/**
 * Pagination component for DataList
 * @memberof module:DataList
 */
class DataListPagination extends React.Component {
  constructor(props) {
    super(props);

    this.dataList = {
      params: {},
      total: 0
    };
  }

  /**
   * Sends request after pagination
   * @param {function} dataListSendRequest Action creator for sending request
   * @param {string|number} listID ID of list
   */
  sendRequest() {
    const
      { dataListSendRequest: dataListSendReq, listID } = this.props;
    dataListSendReq(
      listID,
      this.dataList
    );
  }

  /**
   * Moves to page by num
   * @param {number} pageNum Number of page where to move
   */
  goToPageNum(pageNum) {
    this.countParams({ pageNum });
    this.sendRequest();
  }

  /**
   * Changes how many item to show in page
   * @param {number} pageSize Itemps per page
   */
  changePageSize(pageSize) {
    this.countParams({ pageSize });
    this.sendRequest();
  }

  /**
   * Recounts DataList params for changing pagination
   * @param {Object} options
   * @param {number=} options.pageSize Items per page
   * @param {number=} options.pageNum Number of page
   */
  countParams({ pageSize, pageNum }) {
    const
      actualParams = this.dataList.params || {};

    const {
      defaultPageSize, defaultStart
    } = this.props;

    this._start = typeof actualParams._start !== 'undefined' ? actualParams._start : defaultStart;
    this.total = this.dataList.total;

    if (typeof pageSize !== 'undefined') {
      this._limit = pageSize > 0 ? pageSize : 0;
      this._start = this._start - (this._start % this._limit);
    } else {
      this._limit = typeof actualParams._limit !== 'undefined' ? actualParams._limit : defaultPageSize;
    }

    this.pagesAmount = Math.ceil(this.total / this._limit);

    if (typeof pageNum !== 'undefined') {
      this.currentPage = (pageNum > 0 && pageNum <= this.pagesAmount) ? pageNum : 0;
      this._start = (this.currentPage - 1) * this._limit;
    } else {
      this.currentPage = Math.round(this._start / this._limit) + 1;
      this.currentPage = this.currentPage ? this.currentPage : 0;
    }
    if (this.currentPage > this.pagesAmount && this.pagesAmount !== 0) {
      this.goToPageNum(this.pagesAmount);
    }

    this.dataList.params = {
      ...actualParams,
      _limit: this._limit,
      _start: this._start
    };
  }

  render() {
    const
      {
        allDataLists,
        Component, listID
      } = this.props;

    if (allDataLists[listID]) {
      this.dataList = { ...allDataLists[listID] };
    }

    this.countParams({});

    return (
      <Component
        total={this.total}
        pageSize={this._limit}
        pagesAmount={this.pagesAmount}
        currentPage={this.currentPage}
        goToPageNum={this.goToPageNum.bind(this)}
        changePageSize={this.changePageSize.bind(this)}
      />
    );
  }
}

DataListPagination.propTypes = {
  Component: PropTypes.func.isRequired,
  listID: PropTypes.string.isRequired,
  defaultPageSize: PropTypes.number,
  defaultStart: PropTypes.number,
  dataListSendRequest: PropTypes.func.isRequired,
  allDataLists: PropTypes.instanceOf(Object).isRequired
};

DataListPagination.defaultProps = {
  defaultPageSize: 0,
  defaultStart: 0
};

const mapStateToProps = (state) => ({
  allDataLists: state.dataList
});
export default connect(mapStateToProps, {
  dataListSendRequest
})(DataListPagination);
