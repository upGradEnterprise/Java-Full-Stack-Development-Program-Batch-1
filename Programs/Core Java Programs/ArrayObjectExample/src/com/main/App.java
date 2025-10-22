package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String con="";
        int id;
        String name;
        float salary;
        String result;
        EmployeeService es = new EmployeeService();
        do {
            System.out.println("1:Add Employee 2 :View Employee");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:System.out.println("Add Employee ");
                    System.out.println("Enter the id");
                    id  = sc.nextInt();
                    System.out.println("Enter the name");
                    name  = sc.next();
                    System.out.println("Enter the salary");
                    salary  = sc.nextFloat();
                    Employee emp1 = new Employee(id,name,salary);
                    result = es.addEmployee(emp1);
                    System.out.println(result);
                    break;
                case 2: Employee employees[]=  es.getAllEmployee();
                       for(int i=0;i<EmployeeService.index;i++){
                           System.out.println("id is "+employees[i].getId()+" Name is "+employees[i].getName()+" Salary is "+employees[i].getSalary());
                       }
                    break;
                default:System.out.println("Wrong choice");
                    break;
            }

            System.out.println("Do you want to continue(y/n)");
            con = sc.next();
        }while(con.equals("y"));
        System.out.println("Thank you!");
    }
}
