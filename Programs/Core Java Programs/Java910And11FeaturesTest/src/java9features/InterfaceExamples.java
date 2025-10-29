package java9features;
interface Hello {
    void display1();
    default void display2() {
        System.out.println("Default method");
        display4();
    }
    static void display3() {
        System.out.println("static method");
    }
    private void display4() {
        System.out.println("private method");
    }
}
class HelloImp implements  Hello {
    @Override
    public void display1() {
        System.out.println("provided body for abstract display1");
    }
}
public class InterfaceExamples {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        Hello h1 = new HelloImp();
        h1.display1();
        h1.display2();
        Hello.display3();
    }
}
