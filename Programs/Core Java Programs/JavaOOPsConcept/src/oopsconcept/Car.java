package oopsconcept;

public class Car {
    int wheel;
    double price;
    String color;
    // Empty constructor
    Car() {
        System.out.println("Car class object created with empty");
        wheel=4;
        price=800000;
        color="Unkonwn";
    }
    // parameterized constructor
//    Car(int wheel1,float price1,String color1) {
//        System.out.println("Car class object created with parameter");
//        wheel=wheel1;
//        price=price1;
//        color=color1;
//    }
    // parameter constructor with this keyword
    Car(int wheel,float price,String color) {
        System.out.println("Car class object created with parameter");
        this.wheel=wheel;
        this.price=price;
        this.color=color;
    }

    void init() {
        System.out.println("Car instance variable initialization");
        wheel=4;
        price=800000;
        color="Unkonwn";
    }
    void start() {
        System.out.println("Car Start");
    }
    void appliedGear() {

    }
    void moving() {

    }
    void stop() {
        System.out.println("Car Stop");
    }
    void printDetails(String carName) {
        String msg="Car Details ";
        System.out.println(msg+carName);
        System.out.println("Wheel "+wheel);
        System.out.println("Price "+price);
        System.out.println("Colour "+color);
    }
}
