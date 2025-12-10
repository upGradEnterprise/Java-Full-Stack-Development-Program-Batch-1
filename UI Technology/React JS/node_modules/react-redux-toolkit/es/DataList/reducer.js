import * as actionTypes from './constants';

const initialState = {

};
/**
 * [ listID,  ] : {
  listURL: string,
  total: nubmer,
  loading: bool,
  data: array,
  errorMessage: string,
  transformResponse: function,
  params: Object
}
 * */
export default (state = initialState, action = {}) => {
  switch (action.type) {
    case actionTypes.DATA_LIST_SEND_REQUEST:
      return {
        ...state,
        [action.payload.listID]: {
          ...state[action.payload.listID],
          listURL: action.payload.dataList.listURL,
          loading: true,
          params: action.payload.dataList.params,
          transformResponse: action.payload.dataList.transformResponse,
          errorMessage: undefined
        }
      };
    case actionTypes.DATA_LIST_RECEIVED:
      return {
        ...state,
        [action.payload.listID]: {
          ...state[action.payload.listID],
          listURL: action.payload.listURL,
          data: action.payload.data,
          total: action.payload.total,
          errorMessage: undefined,
          loading: undefined
        }
      };
    case actionTypes.DATA_LIST_GOT_ERROR:
      return {
        ...state,
        [action.payload.listID]: {
          ...state[action.payload.listID],
          data: [],
          total: 0,
          listURL: action.payload.listURL,
          errorMessage: action.payload.errorMessage,
          loading: undefined
        }
      };
    case actionTypes.DATA_LIST_CLEAN:
      return {
        ...state,
        [action.payload.listID]: undefined
      };
    default:
      return state;
  }
};
