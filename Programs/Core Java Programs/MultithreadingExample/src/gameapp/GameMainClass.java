package gameapp;
class Car implements  Runnable{
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(name + " moving with speed as " + (i + 50) + " km/hr");
            }catch (Exception e){}
        }
    }
}
public class GameMainClass {
    public static void main(String[] args) throws  Exception{

        Car car = new Car();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car,"2nd Car");
        Thread t3 = new Thread(car);
        Thread t4 = new Thread(car,"4th Car");
        t1.setName("1st Car");
        t3.setName("3rd Car");
        System.out.println("Game Start");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("3...");
        //System.out.println("1st Car "+t1.isAlive());
        t1.start();
        //System.out.println("1st Car "+t1.isAlive());
        t2.start();
        t3.start();
        t4.start();
        t1.join();      // t1 thread join to current thread main method
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Game Finished");
    }
}
