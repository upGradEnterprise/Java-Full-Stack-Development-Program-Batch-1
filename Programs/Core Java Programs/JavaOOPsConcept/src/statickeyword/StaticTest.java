package statickeyword;
class Employee {
    int id;     // instance variable
    String name;    // instance variable
    static int mgrId;   // static variable             static memory mgrId=0


    static void display1() {
        System.out.println("Employee class static method");
        System.out.println("MgrId is "+Employee.mgrId);
    }
    void display2() {
        System.out.println("Employee details are");
        System.out.println("id is "+this.id);
        System.out.println("name is "+this.name);
        System.out.println("mgrid is "+this.mgrId);
    }
}
public class StaticTest {
                    // static memory of main class
    public static void main(String[] args) {
        System.out.println("Static concept");
        Employee.display1();                // static memory of Employee only one copy
        Employee emp1 = new Employee();     // heap memory created
        Employee emp2 = new Employee();     // another heap memory created
        emp1.id=100;
        emp1.name="Ravi";       //in emp1 memory id=100,name=Ravi
        emp1.mgrId=1000;
        Employee.mgrId=1001;            // static memory mgrId=1001

        emp2.id=200;
        emp2.name="Raj";            // in emp2 memory id=101,name=Raj
        emp2.mgrId=1002;
        Employee.mgrId=1003;        // in same static memory last update mgrId=1003
        emp1.display2();    // id = 100,name=Ravi,mgrId=1003
        emp2.display2();    // id = 101, name = Raj, mgrId = 1003

    }
}
