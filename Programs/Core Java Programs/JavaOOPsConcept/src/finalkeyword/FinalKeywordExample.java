package finalkeyword;
final class A {
    final void display1() {
        System.out.println("A class method");
    }
}
//class B extends A {
////    @Override
////    void display1() {
////        System.out.println("B class override display1 method");
////    }
//}

public class FinalKeywordExample {
    public static void main(String[] args) {
        final int A=100;
        System.out.println(A);
        //A=200;
//        B obj1 = new B();
//        obj1.display1();
        A obj2 = new A();
        obj2.display1();
    }
}
