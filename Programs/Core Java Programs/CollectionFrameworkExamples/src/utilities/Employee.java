package utilities;

public class Employee implements  Comparable<Employee>{
    private int id;
    private String name;
    private float salary;

    @Override
    public int compareTo(Employee o) {
        System.out.println("I Came Here");
        // +ve
        // zero
        // -ve
        //return 0;
        //return this.id-o.id;        // sort id wise asc order
        //return o.id-this.id;        // sort id wise desc order
        //return (int)(this.salary-o.salary); // sort salary wise asc order
        //return (int)(o.salary-this.salary); // sort salary wise desc order
//        return this.name.compareTo(o.name);        // sort name wise asc order
        return o.name.compareTo(this.name);        // sort name wise desc order
    }

    Employee(){

    }

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
