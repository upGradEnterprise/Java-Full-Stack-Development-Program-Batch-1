package com;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a=10;
        int b=0;
            try {
                int sum = a / b;
                System.out.println("Result is " + sum);
            }catch (Exception e){
                //System.out.println("I Take care!");
                //System.out.println(e.getMessage());
                //System.out.println(e.toString());
                e.printStackTrace();
            }
        System.out.println("bye...");
        System.out.println("bye...");
        System.out.println("bye...");
    }
}
