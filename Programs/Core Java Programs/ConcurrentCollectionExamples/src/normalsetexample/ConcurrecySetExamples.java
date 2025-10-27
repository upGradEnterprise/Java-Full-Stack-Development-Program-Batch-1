package normalsetexample;
import java.util.concurrent.CopyOnWriteArraySet;

class Task1 implements  Runnable {
    private CopyOnWriteArraySet<String> set;
    private String value;

    Task1(CopyOnWriteArraySet<String> set, String value){
        this.set = set;
        this.value=value;
    }
    @Override
    public void run() {
            set.add(value);
            String name = Thread.currentThread().getName();
            System.out.println(name + " added the value as " + value);
    }
}
public class ConcurrecySetExamples {
    public static void main(String[] args) throws  Exception{
        CopyOnWriteArraySet<String> ss = new CopyOnWriteArraySet<>();
        Thread t1 = new Thread(new Task1(ss,"A"));
        Thread t2 = new Thread(new Task1(ss,"B"));
        Thread t3 = new Thread(new Task1(ss,"C"));
        Thread t4 = new Thread(new Task1(ss,"D"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();t2.join();t3.join();t4.join();
        System.out.println("Size is "+ss.size());
        System.out.println(ss);
    }
}
