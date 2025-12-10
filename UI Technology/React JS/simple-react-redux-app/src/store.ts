import { legacy_createStore as createStore} from 'redux'
import reducer from './reducer'

// while creating store we pass the reference of 
// reducer. 
let storeRef = createStore(reducer)

console.log(storeRef.getState())
export default storeRef;