package listexamples;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println(al.size());
        al.add(10);
        al.add("Ravi");
        al.add(10.20);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println("Get value using index position "+al.get(1));
        //System.out.println("Get value using index position "+al.get(4));
             al.add(1,"Ramesh");
        System.out.println(al);
        //al.remove(0);       // remvoe using index
        Integer value = 10;
        al.remove(value);       // remove using value ie integer
        al.remove("Ravi");   // remove using value
        System.out.println(al);
        al.set(0,"Ajay");
        System.out.println(al);
        System.out.println(al.size());
    }
}
