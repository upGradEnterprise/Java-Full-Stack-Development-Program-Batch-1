package interfaceexample;
interface Abc {
    void display1();
    default  void display2() {
        System.out.println("This is default display2 method of Abc interface");
    }
    default  void display3() {
        System.out.println("This is default display3 method of Abc interface");
    }
    static void display4() {
        System.out.println("This is static display4 method of Abc interface ");
    }
    static void display5() {
        System.out.println("This is static display5 method ");
    }
}
interface Xyz {
    void display1();
    default  void display2() {
        System.out.println("This is default display2 method of Xyz interface");
    }
//    default  void display3() {
//        System.out.println("This is default display3 method Xyz Interface");
//    }
    static void display4() {
        System.out.println("This is static display4 method of Xyz interface ");
    }
}
class Test implements  Abc,Xyz {
    @Override
    public void display1() {
        System.out.println("Provided body for Display1 abstract method of Abc and Xyz interface");
    }
    @Override
    public void display2() {
        System.out.println("Interface Abc default display2 method of Abc/Xyz override by Test class");
    }
}
public class DefaultAndStaticInterfaceMethodExample {
    public static void main(String[] args) {
//    Abc obj1 = new Test();
//    obj1.display1();
//    obj1.display2();
//    obj1.display3();
//    Abc.display4();     // static calling through interface name
//    Abc.display5();
        Abc obj1 = new Test();
        obj1.display1();        // body provided by Test class
        obj1.display2();        // body provided by Test class for default method
        obj1.display3();
        Xyz obj2 = new Test();
        obj2.display1();        // body provided by Test class
        obj2.display2();        // body provided by Test class for default method
        Abc.display4();
        Xyz.display4();
    }
}
