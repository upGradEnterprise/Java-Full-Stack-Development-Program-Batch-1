import { render,screen } from "@testing-library/react"
import Hello from "./Hello"

describe("Hello Component Testing ",()=> {

    xtest("Content present in Hello Component",()=> {
        render(<Hello/>)
        let content = screen.getByRole("heading")
        let value  = content.innerHTML;
        expect(value).toBe("Hi Component");
    })
})