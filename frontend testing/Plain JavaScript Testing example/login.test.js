let ref = require("./login")
describe("Login Testing ",()=> {

        test("SignIn Testing ",()=> {
            expect(ref.signIn("admin@gmail.com","123")).toBe("success");
            expect(ref.signIn("admin@gmail.com","1234")).toBe("failure");      
        })
})