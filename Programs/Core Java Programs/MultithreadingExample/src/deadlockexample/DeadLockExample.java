package deadlockexample;
class Account {
    private String name;
    Account(){

    }
    Account(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public synchronized  void transfer(Account toAccount){
        String tname = Thread.currentThread().getName();
        System.out.println(tname+" locked "+this.name);

        try{
            Thread.sleep(1000);
        }catch (Exception e){}

        System.out.println(tname+" trying to lock "+toAccount.getName());

        synchronized (toAccount){
            System.out.println(tname+" locked "+this.getName());
            System.out.println(tname+" transfering the money....");
        }

    }
}
class TransferThread1 implements  Runnable {
    private Account from;
    private Account to;
    TransferThread1(Account from, Account to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void run() {
        from.transfer(to);
    }
}
class TransferThread2 implements  Runnable {
    private Account from;
    private Account to;
    TransferThread2(Account from, Account to){
        this.from = from;
        this.to = to;
    }
    @Override
    public void run() {
        to.transfer(from);
    }
}

public class DeadLockExample {
    public static void main(String[] args) {
    Account acc1 = new Account("Account A ");
    Account acc2 = new Account("Account B ");
    TransferThread1 tt1 = new TransferThread1(acc1,acc2);
    TransferThread2 tt2 = new TransferThread2(acc1,acc2);
    Thread t1 = new Thread(tt1);
    Thread t2 = new Thread(tt2);
    t1.start();
    t2.start();

    }
}
