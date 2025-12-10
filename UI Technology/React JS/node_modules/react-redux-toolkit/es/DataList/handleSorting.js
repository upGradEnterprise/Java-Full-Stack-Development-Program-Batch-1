/**
 * This function sorts DataList
 * @memberof module:DataList
 * @param {function} dataListSendRequest Action creator for sending request
 * @param {string|number} listID ID of list
 * @param {Object} dataList DataList settings and data
 * @param {Object} sorting
 * @param {Object} sorting.id Sorting by field with this ID
 * @param {Object} sorting.desc Sorting order
 */
const handleSorting = (dataListSendRequest, listID, dataList, sorting) => {
  const { id, desc } = sorting[0];
  const newDataList = {
    ...dataList,
    params: {
      ...dataList.params,
      _sort: desc ? `${id}:desc` : `${id}:asc`
    }
  };

  dataListSendRequest(
    listID,
    newDataList
  );
};

export default handleSorting;
