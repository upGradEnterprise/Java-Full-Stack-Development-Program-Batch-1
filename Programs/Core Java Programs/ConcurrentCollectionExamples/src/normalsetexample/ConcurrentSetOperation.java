package normalsetexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

class AddData implements  Runnable {
    Set<Integer> ss;

    AddData(Set<Integer> ss){
        this.ss = ss;
    }
    @Override
    public void run() {
        for(int i=100;i>0;i--){
            this.ss.add(i);
            System.out.println("Element added "+i);
        }
        System.out.println("Added element is "+this.ss.size());
        System.out.println(ss);
    }
}
class RetrieveData implements  Runnable {
    Set<Integer> ss;
    RetrieveData(Set<Integer> ss){
        this.ss = ss;

    }
    @Override
    public void run() {
        Iterator<Integer> li = this.ss.iterator();
        while(li.hasNext()){
            int n = li.next();
            System.out.println("Value is "+n);
        }
    }
}
public class ConcurrentSetOperation {
    public static void main(String[] args) {
    //Set<Integer> ss  = new HashSet<>();
    //Set<Integer> ss = new ConcurrentSkipListSet<>();  // sorted
        Set<Integer> ss = new CopyOnWriteArraySet<>();  // unorder
        AddData ad = new AddData(ss);
        RetrieveData rd = new RetrieveData(ss);

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(rd);
        t1.start();
        t2.start();
    }
}
