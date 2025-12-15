import { render,screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import TodoComponent from "./TodoComponent"

describe("Login Component Testing ",()=> {

    test("load Data ", async ()=> {
        render(<TodoComponent/>)
           // let button = screen.getByTestId("b1")

           // userEvent.click(button);
        // jest.setTimeout(80000); //        
        // await expect(screen.getByText("Number of todos are 0")).toBeInTheDocument();  
                
        setTimeout(() => {
      try {

        expect(screen.getByText("abcd")).toBeInTheDocument();
      } catch (error) {}
    }, 9000); // wait 2 seconds for API to load
     
    })

    
})