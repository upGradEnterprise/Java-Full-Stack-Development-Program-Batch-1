package thisandsuperkeywords;
class A {
    int id =100;            // super class instance or super variable
}
class B extends  A{
    int id=200;                     // sub class instance variable
    public void dis() {
        int id=300;     // local variable
        System.out.println("Local variable "+id);   // 300
        System.out.println("Instance variable "+this.id);   // 200
        System.out.println("super variable "+super.id);   // 100
    }
}
public class ThisAndSuperConcept {
    public static void main(String[] args) {
        B obj = new B();
        obj.dis();
    }
}
