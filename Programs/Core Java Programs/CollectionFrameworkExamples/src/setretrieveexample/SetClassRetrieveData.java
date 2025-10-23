package setretrieveexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClassRetrieveData {
    public static void main(String[] args) {
        Set ss = new HashSet();
        ss.add(10);
        ss.add(20);
        ss.add(30);
        ss.add(40);
        System.out.println(ss);
        System.out.println("Retrieve records from set usng ehnached loop");
        for(Object n:ss){
            System.out.println(n);
        }
        System.out.println("Using Iterator");
        Iterator li= ss.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
            //li.remove();
        }
    }

}
