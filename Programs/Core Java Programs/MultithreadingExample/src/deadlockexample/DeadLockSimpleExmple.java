package deadlockexample;
class A implements  Runnable {
    String s1,s2;
    A(String s1, String s2){
        this.s1=s1;
        this.s2 = s2;
    }
    @Override
    public void run() {
        synchronized (s1){
            System.out.println("Thread1 lock s1 object");
            try {
                Thread.sleep(2000);
            }catch (Exception e){}

            synchronized (s2){
                System.out.println("Thread1 lock s2 object");
            }
        }
    }
}
class B implements  Runnable {
    String s1,s2;
    B(String s1, String s2){
        this.s1=s1;
        this.s2 = s2;
    }
    @Override
    public void run() {
        synchronized (s2){
            System.out.println("Thread2 lock s2 object");

            try {
                Thread.sleep(2000);
            }catch (Exception e){}

            synchronized (s1){
                System.out.println("Thread2 lock s1 object");
            }
        }
    }
}
public class DeadLockSimpleExmple {
    public static void main(String[] args) {
    String s1 = "Raj";
    String s2 = "Deep";
    A obj1 = new A(s1,s2);
    B obj2 = new B(s1,s2);
    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);
    t1.start();
    t2.start();
    }
}
