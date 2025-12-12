import { render,screen } from "@testing-library/react"
import Login from "./Login"
import userEvent from "@testing-library/user-event"

describe("Login Component Testing ",()=> {

    xtest("Render All Login Page content",()=> {
        render(<Login/>)
        // check all UI Element or Tags on screen 
        expect(screen.getByText("Login Page")).toBeInTheDocument();
        expect(screen.getByPlaceholderText("Enter emailId")).toBeInTheDocument();
        expect(screen.getByPlaceholderText("Enter password")).toBeInTheDocument();
        expect(screen.getByRole("button",{name:"SignIn"})).toBeInTheDocument();
        expect(screen.getByRole("button",{name:"Reset"})).toBeInTheDocument();
    })

    xtest("test success functionality ", async ()=> {
        render(<Login/>)
        // check all UI Element or Tags on screen 
        let emailId = screen.getByPlaceholderText("Enter emailId")
        let password = screen.getByPlaceholderText("Enter password")

        await userEvent.type(emailId,"admin@gmail.com");
        await userEvent.type(password,"123");

        expect(screen.getByPlaceholderText("Enter emailId")).toHaveValue("admin@gmail.com")
        expect(screen.getByPlaceholderText("Enter password")).toHaveValue("123")

        let submitButton = screen.getByRole("button",{name:"SignIn"})

        await userEvent.click(submitButton);

        expect(screen.getByText("success")).toBeInTheDocument();      
    })

    xtest("test failure functionality ", async ()=> {
        render(<Login/>)
        // check all UI Element or Tags on screen 
        let emailId = screen.getByPlaceholderText("Enter emailId")
        let password = screen.getByPlaceholderText("Enter password")

        await userEvent.type(emailId,"admin@gmail.com");
        await userEvent.type(password,"1234");

        let submitButton = screen.getByRole("button",{name:"SignIn"})

        await userEvent.click(submitButton);

        expect(screen.getByText("failure")).toBeInTheDocument();      
    })
})