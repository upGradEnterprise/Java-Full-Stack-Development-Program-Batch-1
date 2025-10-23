package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsWithEmployeesSortUsingComparable {
    public static void main(String[] args) {
        List<Employee> listOfEmp = new ArrayList<>();
        listOfEmp.add(new Employee(2,"Ajay",42000));
        listOfEmp.add(new Employee(1,"Mahesh",38000));
        listOfEmp.add(new Employee(3,"Vikash",40000));
        System.out.println("Before Sort");
        for(Employee emp:listOfEmp){
            System.out.println(emp);  // it call toString method
        }
        Collections.sort(listOfEmp);// T type in collection must be implements comparable
        System.out.println("");
        System.out.println("After Sort");
        for(Employee emp:listOfEmp){
            System.out.println(emp);  // it call toString method
        }
    }
}
