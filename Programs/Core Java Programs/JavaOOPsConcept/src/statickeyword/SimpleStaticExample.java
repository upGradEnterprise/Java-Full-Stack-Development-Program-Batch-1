package statickeyword;
class Test {
    int a;      // non static or instance variable
    static int b;   // static variable
    void display1() {
        System.out.println("Non static method");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
    static void display2() {
        System.out.println("static method");
        //System.out.println("a "+a);   //non static can't access
        Test tt = new Test();
        System.out.println("a "+tt.a); // non static to access object created inside static method
        System.out.println("b "+b);
    }
}
public class SimpleStaticExample {
    public static void main(String[] args) {
    Test t1 = new Test();
    t1.a=100;
    Test.b=200;
    //Test.a=300;
        t1.display1();
        Test.display2();
        t1.display2();
    }
}
