package listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

class AddData implements  Runnable {
    List<Integer> ll;

    AddData(List<Integer> ll){
        this.ll=ll;
    }
    @Override
    public void run() {
        for(int i=200;i>0;i--){
            this.ll.add(i);

            System.out.println("Element added "+i);
        }
        System.out.println("Added element is "+this.ll.size());
        System.out.println(ll);
    }
}
class RemoveData implements  Runnable {
    List<Integer> ll;
    RemoveData(List<Integer> ll){
        this.ll = ll;

    }
    @Override
    public void run() {
        Iterator<Integer> li = this.ll.iterator();
        while(li.hasNext()){
            Integer n = li.next();
            //li.remove();
            ll.remove(n);       // remove with list reference
            System.out.println("Removed the value "+n);
        }
    }
}
public class ConcurrentListExamples {
    public static void main(String[] args) {
        //List<Integer> ll = new ArrayList<>();
        List<Integer> ll = new CopyOnWriteArrayList<>();
        AddData ad = new AddData(ll);
        RemoveData rm = new RemoveData(ll);
        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(rm);
        t1.start();
        t2.start();
    }
}
