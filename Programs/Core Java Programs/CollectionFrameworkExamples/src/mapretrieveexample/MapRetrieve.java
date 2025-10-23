package mapretrieveexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieve {
    public static void main(String[] args) {
        Map mm = new HashMap();
        mm.put(1,"Ravi");
        mm.put(2,"Raj");
        mm.put(3,"Ram");
        System.out.println(mm);
        Set ss = mm.keySet(); // store all keys in set
        Iterator li = ss.iterator();
        while(li.hasNext()){
            Object key = li.next();
            System.out.println("key "+key+" Value is "+mm.get(key));
        }
        System.out.println("using entrySet");
        Set ss1 = mm.entrySet();        // store key-value as value
        Iterator li1 = ss1.iterator();
        while(li1.hasNext()){
            Map.Entry me = (Map.Entry)li1.next();
            System.out.println("key "+me.getKey()+" Value "+me.getValue());
        }
    }
}
