package normalsetexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Task implements  Runnable {
    private Set<String> set;
    private String value;

    Task(Set<String> set, String value){
        this.set = set;
        this.value=value;
    }
    @Override
    public void run() {
            set.add(value);
            String name = Thread.currentThread().getName();
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println(name + " added the value as " + value);
            set.remove(value);
    }
}
public class SetDemoExamples {
    public static void main(String[] args) throws  Exception{
    Set<String> ss = new HashSet<>();
        //Set<String> ss = new LinkedHashSet<>();
        //Set<String> ss = new TreeSet<>();
    Thread t1 = new Thread(new Task(ss,"A"));
    Thread t2 = new Thread(new Task(ss,"B"));
    Thread t3 = new Thread(new Task(ss,"C"));
    Thread t4 = new Thread(new Task(ss,"D"));
    t1.start();
    t2.start();
    t3.start();
    t4.start();

    t1.join();t2.join();t3.join();t4.join();
    System.out.println("Size is "+ss.size());
    System.out.println(ss);
    }
}
