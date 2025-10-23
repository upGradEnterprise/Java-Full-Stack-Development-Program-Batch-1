package mapexamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
       // HashMap hm = new HashMap(); // unorder
        //LinkedHashMap hm = new LinkedHashMap(); // maintain the order
       // TreeMap hm = new TreeMap();
        Hashtable hm = new Hashtable(); // method are synchronized
        hm.put(2,"Ravi");
        hm.put(1,"Ramesh");
        hm.put(5,"Rajesh");
        hm.put(9,"Raj");
        hm.put(4,"Ram");
        hm.put(3,"Ravi");
       hm.put("a","b");
        System.out.println(hm);
        hm.put(1,"Ajay");// new value for same key
        System.out.println(hm);
        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue("Akash"));
    }
}
