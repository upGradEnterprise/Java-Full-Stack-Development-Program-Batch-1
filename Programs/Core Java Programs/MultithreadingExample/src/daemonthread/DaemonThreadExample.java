package daemonthread;
class MyDaemonThread implements  Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(name+"= "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
class MyUserDefinedThread implements  Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<5;i++){
            System.out.println(name+"= "+i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
public class DaemonThreadExample {
    public static void main(String[] args) {
        MyDaemonThread obj1 = new MyDaemonThread();
        MyUserDefinedThread obj2 = new MyUserDefinedThread();
        Thread t1  = new Thread(obj1,"Daemon Thread");
        Thread t2 = new Thread(obj2,"User Defined Thread");
        t1.setDaemon(true); // task will perform in background.
        t1.start();
        t2.start();
        System.out.println("main Thread finished");
    }
}
