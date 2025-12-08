import EmployeeComponent from "./EmployeeComponent";

function HeaderComponent() {
  return <header>This is My Header Component</header>
}

function FooterComponent() {
  return <footer>This is my footer component</footer>
}

function App() {
  // coding 

  //return <div>Welcome to React Js Application</div>
  return(
  <div>
      <HeaderComponent>sss</HeaderComponent>
      <h1>This is Main component</h1>
      <p>This main component contents</p>
      <EmployeeComponent></EmployeeComponent>
      <FooterComponent></FooterComponent>
  </div>)
}

export default App;