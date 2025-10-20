package interfaceexample;
interface Abc {
    //public static final int A=10;
    //static final int A=10;
    //final int A=10;
    int A=10;
    int id=111;
    //int B;
    //public abstract void dis1();
    //abstract  void dis1();
    void dis1();
    void dis();
    //void dis2() {}
}
interface Xyz {
    int B=20;
    int id=222;
    void dis2();
    void dis();
}
interface Mno extends Abc,Xyz{
    int C=30;
    void dis3();
}
class Test implements  Abc,Xyz {
    @Override
    public void dis1() {
        System.out.println("A = "+A);
        System.out.println("Abc inteface dis1 method");
    }
    @Override
    public void dis2() {
        System.out.println("B = "+B);
        System.out.println("Xyz inteface dis2 method");
    }

    @Override
    public void dis() {
        System.out.println(Abc.id+" "+Xyz.id);      // 111 222
        System.out.println("Abc and Xyz inteface dis method");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {

    }
}
