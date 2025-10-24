package bookingapp;
class TicketBook implements  Runnable{
    int avl=2;
    @Override
    public void run() {
        String name  = Thread.currentThread().getName();
        System.out.println(name+" Ready to book the ticket");
        synchronized (this) {
            if (avl > 0) {
                System.out.println(name + " got the ticket");
                avl = avl - 1;
            } else {
                System.out.println(name + " Sorry no ticket");
            }
        }
        System.out.println("Booking done successfully or failure "+name);
    }
}
public class BookingTestApp {
    public static void main(String[] args) {
    TicketBook tb1 = new TicketBook();      // heap avl = 2;
    //TicketBook tb2 = new TicketBook();      // heap avl=2
    //TicketBook tb3 = new TicketBook();      // heap avl = 2
    //TicketBook tb4 = new TicketBook();         // heap avl=2;
    Thread t1 = new Thread(tb1,"Raj");
    Thread t2 = new Thread(tb1,"Ravi");
    Thread t3 = new Thread(tb1,"Ramesh");
    Thread t4 = new Thread(tb1,"Raju");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }
}
