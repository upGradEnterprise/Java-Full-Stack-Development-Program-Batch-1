import { render,screen } from "@testing-library/react"
import userEvent from "@testing-library/user-event"
import { MemoryRouter, Route, Routes } from "react-router-dom"
import Home from "./Home"
import LoginRouting from "./LoginRouting"

describe("Login Component Testing ",()=> {
    test("test success functionality ", async ()=> {
        render(
            <MemoryRouter initialEntries={["/"]}>
                <Routes>
                    <Route path="/" element={<LoginRouting/>}/>
                    <Route path="/home" element={<Home/>}/>
                </Routes>
            </MemoryRouter>
        )
        let emailId = screen.getByTestId("emailId")
        let password = screen.getByTestId("password");
        let submitButton = screen.getByTestId("submit");

        await userEvent.type(emailId,"admin@gmail.com");
        await userEvent.type(password,"123");


        await userEvent.click(submitButton);

       expect(screen.getByText("Welcome to Home Page")).toBeInTheDocument();     
    })

})