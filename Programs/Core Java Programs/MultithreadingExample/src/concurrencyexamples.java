import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread1 extends  Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread1 running "+name);
    }
}
class MyThread2 implements  Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Thread1 running "+name);
    }
}
class MyThread3 implements Callable<String>{
    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println("Thread1 running "+name);
        return "name of thred is "+name;
    }
}
public class concurrencyexamples {
    public static void main(String[] args) throws  Exception{
    //1st Thread
        MyThread1 t1 = new MyThread1();
        t1.start();
        //2nd without ExecutorService
        MyThread2 t2 = new MyThread2();
        Thread tt = new Thread(t2);
        tt.start();

        // 3rd with ExecutorService with Runnable
        MyThread2 t3 = new MyThread2();
       ExecutorService es = Executors.newSingleThreadExecutor();
       es.submit(t3);       // passing runnable reference.
        es.shutdown();

        // 4th with ExecutorServie with Callback
        MyThread3 t4 = new MyThread3();
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        Future<String> ff=  es1.submit(t4);       // passing runnable reference.
        System.out.println(ff.get());
        es1.shutdown();
    }
}
