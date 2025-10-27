package threadcommunication;
class Task implements  Runnable{
    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<10;i++) {
            try {
                System.out.println(name+" "+i);
                Thread.sleep(500);
                if(i==4 && name.equals("Raj")){
                    wait();
                }
                if(i==6 && name.equals("Vijay")){
                    notify();
                }
            } catch (Exception e) {

            }
        }
    }
}
public class WaitAndNotifyExample {
    public static void main(String[] args) {
        Task tt = new Task();       // heap memory
        Thread t1 = new Thread(tt,"Raj");
        Thread t2 = new Thread(tt,"Ajay");
        Thread t3 = new Thread(tt,"Vijay");
        t1.start();
        t2.start();
        t3.start();
    }
}
