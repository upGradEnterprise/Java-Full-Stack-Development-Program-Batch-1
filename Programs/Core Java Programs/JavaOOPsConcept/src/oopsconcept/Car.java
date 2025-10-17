package oopsconcept;

public class Car {
    int wheel;
    double price;
    String color;

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
