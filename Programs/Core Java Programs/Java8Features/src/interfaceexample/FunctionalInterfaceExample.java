package interfaceexample;
@FunctionalInterface
interface Hello{
    void greeting();
    default void sayHello(){
        System.out.println("sayHello method");
    }
    static void sayHi(){
        System.out.println("sayHi method");
    }
    //void checkInfo();
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {

    }
}
