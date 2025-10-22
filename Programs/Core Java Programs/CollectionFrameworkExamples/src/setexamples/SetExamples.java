package setexamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        //HashSet hs  = new HashSet();            // unorder
       // LinkedHashSet hs = new LinkedHashSet();     // order
        TreeSet hs = new TreeSet(); // by sorted in asc order we need to store same data types values.
        System.out.println("Size "+hs.size());
        System.out.println("Empty or Not  "+hs.isEmpty());
        hs.add(10);
        hs.add(60);
        hs.add(50);
        hs.add(90);
        hs.add(40);
        hs.add(30);
        //hs.add("A");
        System.out.println(hs);
        System.out.println("Size "+hs.size());
        System.out.println("Empty or Not  "+hs.isEmpty());
        System.out.println("Search "+hs.contains(10));
        System.out.println("Search "+hs.contains(100));
        System.out.println("Remove "+hs.remove(10));
        System.out.println("Remove "+hs.remove(100));
        hs.clear();
        System.out.println(hs);
        System.out.println("Size "+hs.size());
        System.out.println("Empty or Not  "+hs.isEmpty());
    }
}
