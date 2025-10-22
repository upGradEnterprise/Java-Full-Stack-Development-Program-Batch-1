package com;

import java.util.Scanner;

public class ThrowKeywordExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try {
            if (age >= 21) {
                System.out.println("You Can Vote!");
            } else {
                //throw new Exception();      // generic exception
                //throw new Exception("Age must be >=21 to vote!");
                //throw new VoteExeption();     // custom exception without message
                throw new VoteExeption("Age must >=21 to Vote!");
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Done!");
    }
}
