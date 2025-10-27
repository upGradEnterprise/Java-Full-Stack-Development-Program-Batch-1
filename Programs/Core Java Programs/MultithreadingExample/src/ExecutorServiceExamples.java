import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Thread>{
    @Override
    public Thread call() throws Exception {
        Thread t= Thread.currentThread();

        return t;
    }
}
public class ExecutorServiceExamples {
    public static void main(String[] args) throws  Exception{
        Task cc1 = new Task();
            // only 1 thread created.
        // it will create only one thread to do all task.
        //ExecutorService es = Executors.newSingleThreadExecutor();
        // 3 thred pool divided the task 10
        //ExecutorService es = Executors.newFixedThreadPool(3);
// create the thread pool the create new threads as needed
        // as well as reusable idle thread
       ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++) {
            Future<Thread> ff = es.submit(cc1);
            System.out.println(ff.get());
        }
        es.shutdown();
    }
}
