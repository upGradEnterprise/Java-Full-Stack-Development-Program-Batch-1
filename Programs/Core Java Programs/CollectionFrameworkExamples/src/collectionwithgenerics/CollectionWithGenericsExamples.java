package collectionwithgenerics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenericsExamples {
    public static void main(String[] args) {
        // List of data
        List ll = new ArrayList();
        ll.add(10);         // auto-boxing : converting primitive to Object.
        ll.add(10.10);
        ll.add("Ravi");
        ll.add(20);

        Object obj = ll.get(2);
        if(obj instanceof  Integer){
            Integer i = (Integer)obj;
            int n = i.intValue();
            System.out.println("value is "+n);
        }
        if(obj instanceof  Double){
            Double d = (Double) obj;
            double n = d.doubleValue();
            System.out.println("value is "+n);
        }
        if(obj instanceof  String){
            String s = (String) obj;
            System.out.println("value is "+s);
        }

        // Collection Framework with Generics
        List<Integer> ll1 = new ArrayList<Integer>();
        List<Float> ll2 = new ArrayList<Float>();
        List<String> ll3 = new ArrayList<String>();
        List<Object> ll4 = new ArrayList<Object>();

        ll1.add(10);        // auto-boxing : converting primitive to object
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        //ll1.add(10.10);

        int intValue = ll1.get(0);  // unboxing : converting object to primitive
        System.out.println(intValue);

        ll4.add(10);        // auto-boxing : converting primitive to object
        ll4.add(20.20);
        ll4.add("Ravi");
        ll4.add(true);

        Object oo = ll4.get(0);
        System.out.println(oo);
    }
}
