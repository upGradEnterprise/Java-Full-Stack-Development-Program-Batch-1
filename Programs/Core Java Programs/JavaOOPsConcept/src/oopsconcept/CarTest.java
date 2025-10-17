package oopsconcept;

public class CarTest {
    public static void main(String[] args) {
//        Car innova = new Car();
//        innova.start();
//        innova.stop();
//
//        Car ertiga = new Car();
//        ertiga.start();
//        ertiga.stop();

//        Car innova = new Car();
//        innova.wheel=4;
//        innova.price=3800000;
//        innova.color="White";
//        innova.printDetails("Innova");
//
//        System.out.println("----------------");
//        Car ertiga = new Car();
//        ertiga.wheel=4;
//        ertiga.price=1500000;
//        ertiga.color="Gray";
//        ertiga.printDetails("Ertiga");

        Car innova = new Car();
        innova.price=3800000;
        innova.color="White";
       // innova.init();
       // innova.init();
       // innova.init();
        innova.printDetails("Innova");
        System.out.println("----------------");
        Car ertiga = new Car();
        ertiga.price=1500000;
        ertiga.color="Gray";
        ertiga.printDetails("Ertiga");

        System.out.println("----------------");
        Car kia = new Car(4,2200000,"Black");
        kia.printDetails("Kia");

    }
}
