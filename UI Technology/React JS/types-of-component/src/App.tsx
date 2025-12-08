import {AnotherArrowComponent, ArrowComponent} from "./ArrowComponent";
import ClassComponent from "./ClassComponent";
import FunctionComponent,{id,name,Hello} from "./FunctionComponent";

function App() {


  return(
    <div>
      <h3>Types of Component</h3>
      <p>Id is {id} name is {name} call function is {Hello()}</p>
      <FunctionComponent></FunctionComponent>
      <ArrowComponent></ArrowComponent>
      <AnotherArrowComponent></AnotherArrowComponent>
      <ClassComponent></ClassComponent>
    </div>
  )
}

export default App;