package threadcommunication;
class PingPong  {
    private boolean pingTurn = true;
    public synchronized void ping() {
        while(!pingTurn){
            try{
                wait();
            }catch (Exception e){}
        }
        System.out.println("Ping.....");
        pingTurn = false;
        notify();
    }
    public synchronized void pong() {
        while(pingTurn){
            try{
                wait();
            }catch (Exception e){}
        }
        System.out.println("Pong.....");
        pingTurn = true;
        notify();
    }
}
class PingThread implements  Runnable {
    PingPong pp;
    PingThread(PingPong pp){
        this.pp = pp;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            pp.ping();
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
class PongThread implements  Runnable {
    PingPong pp;
    PongThread(PingPong pp){
        this.pp = pp;
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            pp.pong();
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
public class PingPongExample {
    public static void main(String[] args) {
         PingPong pp = new PingPong();
    PingThread pt1 = new PingThread(pp);
    PongThread pt2 = new PongThread(pp);
    Thread t1 = new Thread(pt1);
    Thread t2 = new Thread(pt2);
    t1.start();
    t2.start();
    }
}
