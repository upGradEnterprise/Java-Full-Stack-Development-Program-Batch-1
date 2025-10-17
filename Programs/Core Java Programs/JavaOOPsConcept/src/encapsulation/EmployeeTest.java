package encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {
        //id=100;
       // displayEmployee();
        Employee emp1 = new Employee();
        //emp1.id=100;
        //emp1.name="Raj";
        //emp1.salary=-45000;
        emp1.setEmployeeDetails(100,"Raj",45000);
        emp1.displayEmployee();
    }
}
