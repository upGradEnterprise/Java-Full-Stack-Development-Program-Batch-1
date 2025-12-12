//import add from './operation'
let ref = require("./operation")    // load the module 

describe("Operation testing ",()=> {

    test("Addition testing ",()=> {
        expect(ref.add(10,20)).toBe(30);        
    })

    test("Sub testing ",()=> {
        expect(ref.sub(100,50)).toBe(50);        
    })

})
