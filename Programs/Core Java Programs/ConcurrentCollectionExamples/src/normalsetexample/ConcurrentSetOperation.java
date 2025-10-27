package normalsetexample;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

class AddData implements  Runnable {
    Set<Integer> ss;
    int value;
    AddData(Set<Integer> ss, int value){
        this.ss = ss;
        this.value = value;
    }
    @Override
    public void run() {
            System.out.println("Added Status "+ss.add(value));
            //System.out.println("Added data "+value);
            //System.out.println(ss);
            //System.out.println("After Added Size is "+ss.size());
            //System.out.println(ss);
    }
}
class RemoveData implements  Runnable {
    Set<Integer> ss;
    int value;
    RemoveData(Set<Integer> ss, int value){
        this.ss = ss;
        this.value = value;
    }
    @Override
    public void run() {
        System.out.println("Removed Status "+ss.remove(value));
        //System.out.println("Removed data "+value);
        //System.out.println(ss);
        //System.out.println("After Removed Size is "+ss.size());
        //System.out.println(ss);
    }
}
public class ConcurrentSetOperation {
    public static void main(String[] args) {
    //Set<Integer> ss  = new HashSet<Integer>();
    Set<Integer> ss = new ConcurrentSkipListSet<>();
    for(int i=0;i<5;i++) {
        AddData ad = new AddData(ss,i);
        RemoveData rd = new RemoveData(ss,i);
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(rd);
        t1.start();
        t2.start();
    }
    }
}
