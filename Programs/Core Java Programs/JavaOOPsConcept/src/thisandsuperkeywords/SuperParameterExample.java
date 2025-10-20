package thisandsuperkeywords;
abstract class Test1 {
    Test1(){
        System.out.println("Test1 class constructor");
    }
    Test1(int id){
        this();         // same class empty constructor
        System.out.println("Test1 class constructor - (int)");
    }
}
class Test2 extends Test1{
    Test2() {
        this(10);       // same class parameter constructor
        System.out.println("Test2 class constructor");
    }
    Test2(int x) {
        super(10);      // super class parameter constructor
        System.out.println("Test2 class constructor - (int)");
    }
}
public class SuperParameterExample {
    public static void main(String[] args) {
    Test2 t2 = new Test2();
    }
}
