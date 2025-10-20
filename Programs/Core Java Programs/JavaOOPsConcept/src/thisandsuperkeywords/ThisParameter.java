package thisandsuperkeywords;
class Employee {
    private int id;
    private String name;
    private float salary;
    Employee(){
        id=1;
        name="Unknown";
        salary=8000;
    }
    Employee(int id){
        this();         // calling empty constructor
        this.id = id;
        name="Unknown";
        salary=8000;
    }
    Employee(int id,String name){
        //this.id = id;
        this(id);           // constructor chaining calling 1 parameter constructor
        this.name=name;
        salary=8000;
    }
    Employee(int id,String name,float salary){
        //this.id = id;
        //this.name=name;
        this(id,name);              // constructor chaining calling 2 parameter constructor
        this.salary=salary;
    }
}
public class ThisParameter {
    public static void main(String[] args) {
        //Employee emp1 = new Employee();
        //Employee emp2 = new Employee(100);
        //Employee emp3 = new Employee(100,"Ravi");
        Employee emp4 = new Employee(100,"Raj",34000);
    }
}
