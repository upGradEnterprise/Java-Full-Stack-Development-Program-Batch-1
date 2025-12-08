function EmployeeComponent() {
let id:number = 100;
let fname:string = "Raj Deep";
let isActive:boolean = false;        // local variable. 
let skillSet:Array<string>=["Java","Python","ReactJS","HTML","CSS"]
    return(
        <>
            <h3>Employee Component</h3>
            <p>Employee id is {id} name is {fname} and status {isActive?"Active ":"InActive"}</p>
            <p>SkillSet {skillSet.join(" ")}</p>
            <ul>
                {skillSet.map(s=><li>{s}</li>)}
            </ul>
        </>
    )
}

export default EmployeeComponent