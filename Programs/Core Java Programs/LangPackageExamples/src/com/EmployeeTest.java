package com;

import java.util.HashSet;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100,"Ravi",34000);
        Employee emp2 = new Employee(100,"Ravi",34000);
        Employee emp3 = emp1;       // one memory 2 reference.
        Employee emp4 = new Employee(101,"Raj",36000);
        Employee emp5 = new Employee(101,"Raj",36000);
//        if(emp1==emp3){
//            System.out.println("equal");
//        }else {
//            System.out.println("no equal");
//        }
//        System.out.println("-------------");
//        if(emp1.equals(null)){
//            System.out.println("equal");
//        }else {
//            System.out.println("no equal");
//        }
        System.out.println(emp1.equals(emp2));
        System.out.println(emp4.equals(emp5));
        System.out.println(emp1.hashCode()+" "+emp2.hashCode() );
        System.out.println(emp4.hashCode()+" "+emp5.hashCode());
        HashSet<Employee> hs = new HashSet<>();
        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp4);
        hs.add(emp5);
        System.out.println(hs.size());
    }
}
