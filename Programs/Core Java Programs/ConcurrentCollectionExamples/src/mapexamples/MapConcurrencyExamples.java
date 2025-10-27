package mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class AddData implements Runnable {
    Map<Integer,String> mm;
    AddData(Map<Integer,String> mm){
        this.mm = mm;
    }

    @Override
    public void run() {
        for(int i=200;i>0;i--){
            mm.put(i,"Value is "+i);
            System.out.println("Data Added in Map "+i);
        }
    }
}
class RetrieveData implements  Runnable {
    Map<Integer,String> mm;
    RetrieveData(Map<Integer,String> mm){
        this.mm = mm;
    }

    @Override
    public void run() {
        Set<Integer> ss = mm.keySet();
        Iterator<Integer> li = ss.iterator();
        while(li.hasNext()){
            int key = li.next();
            System.out.println("Key is "+key+" Value is "+mm.get(key));
        }
    }
}
public class MapConcurrencyExamples {
    public static void main(String[] args) throws  Exception{
    //Map<Integer,String> mm = new HashMap<>();
        Map<Integer,String> mm = new ConcurrentHashMap<>();
    AddData ad = new AddData(mm);
        RetrieveData rd = new RetrieveData(mm);
    Thread t1 = new Thread(ad);
    Thread t2 = new Thread(rd);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(mm);
    }
}
