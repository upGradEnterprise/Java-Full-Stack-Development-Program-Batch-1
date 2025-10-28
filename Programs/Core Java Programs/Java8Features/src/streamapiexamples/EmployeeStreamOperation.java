package streamapiexamples;

import java.util.Arrays;
import java.util.List;

public class EmployeeStreamOperation {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(
                new Employee(1,"Ravi",45000,"IT"),
                new Employee(2,"Ajay",42000,"Non-IT"),
                new Employee(3,"Vijay",48000,"IT"),
                new Employee(4,"Mahesh",49000,"Non-IT"),
                new Employee(5,"Rajesh",46000,"Marketing"),
                new Employee(6,"Lokesh",45000,"Marketing"),
                new Employee(7,"Reeta",55000,"HR")
        );
        // Retrieve all Employee information using forEach java 8 method
        //listOfEmployees.forEach(e->System.out.println(e));
        // Display only those employee details whose salary is > 45000
        //listOfEmployees.stream().filter(e->e.getSalary()>45000).forEach(e->System.out.println(e));
        // Display only those employee details they are belong to IT deparmtment
        //listOfEmployees.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT")).forEach(e->System.out.println(e));
        // update the salary with 10% getting only updated salary
        //listOfEmployees.stream().map(e->e.getSalary()+e.getSalary()*0.10f).forEach(v->System.out.println(v));

        // update the salary with 10% with employee all details
        listOfEmployees.stream().map(e->
                        new Employee(e.getId(),e.getName(),e.getSalary()+e.getSalary()*0.10f,e.getDepartment())).
                forEach(v->System.out.println(v));
    }
}
