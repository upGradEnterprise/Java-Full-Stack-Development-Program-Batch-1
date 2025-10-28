package interfaceexample;
interface Abc {
    void display1();
    default  void display2() {
        System.out.println("This is default display2 method ");
    }
    default  void display3() {
        System.out.println("This is default display3 method ");
    }
    static void display4() {
        System.out.println("This is static display4 method ");
    }
    static void display5() {
        System.out.println("This is static display5 method ");
    }
}
class Test implements  Abc {
    @Override
    public void display1() {
        System.out.println("Provided body for Display1 abstract method");
    }
    @Override
    public void display2() {
        System.out.println("Interface Abc default display2 method override by Test class");
    }
}
public class DefaultAndStaticInterfaceMethodExample {
    public static void main(String[] args) {
    Abc obj1 = new Test();
    obj1.display1();
    obj1.display2();
    obj1.display3();
    Abc.display4();     // static calling through interface name
    Abc.display5();
    }
}
