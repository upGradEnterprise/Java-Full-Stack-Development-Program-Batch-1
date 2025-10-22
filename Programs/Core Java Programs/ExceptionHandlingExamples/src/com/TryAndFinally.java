package com;

public class TryAndFinally {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            int result = 100/0;
            System.out.println("No Exception");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("normal statement");
    }
}
