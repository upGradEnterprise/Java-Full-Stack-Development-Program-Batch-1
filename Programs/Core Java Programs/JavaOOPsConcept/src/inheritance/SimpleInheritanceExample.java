package inheritance;
class A {
    void display1() {
        System.out.println("A class display1 method");
    }
}
class B extends A{
    void display2() {
        System.out.println("B class display2 method");
    }
}
public class SimpleInheritanceExample {
    public static void main(String[] args) {
    A obj1 = new A();
    obj1.display1();
    B obj2 = new B();
    obj2.display2();
    obj2.display1();
    }
}
