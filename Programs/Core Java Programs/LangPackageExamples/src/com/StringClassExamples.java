package com;

public class StringClassExamples {
    public static void main(String[] args) {
        String str1 = "Welcome to Java";
        String str2 = new String("Welcome to Java");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,10));
        System.out.println("--------------");
        String name1 = "Raj";       // new memory created
        String name2 = "Raj";       // same memory 2 reference. string pooling
        String name3 = new String("Raj");   // new memory
        String name4 = new String("Raj");   // new memory
        if(name1.equals(name3)){
            System.out.println("Equal");
        }else {
            System.out.println("No Equal");
        }
        System.out.println("------------");
        System.out.println(str1);
            System.out.println(str1.toLowerCase());
        System.out.println(str1);
        str1 = str1.toLowerCase();  // old memory lost it link to new memory
        System.out.println(str1);
        String s1 = "Raj";
        StringBuffer sb = new StringBuffer(s1);  // converting string to string buffer
        System.out.println(sb);
        System.out.println(sb.append(" Deep"));
        String s2 = sb.toString();   // converting string buffer to string
        System.out.println(sb);     // Raj Deep
        System.out.println(s2);
    }
}
