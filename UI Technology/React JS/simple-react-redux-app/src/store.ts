import { legacy_createStore as createStore} from 'redux'
import reducer from './reducer'

// while creating store we pass the reference of 
// reducer. 
let storeRef = createStore(reducer)


export default storeRef;