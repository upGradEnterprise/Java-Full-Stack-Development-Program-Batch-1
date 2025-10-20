package polymorphism;
class Operation {
    void add() {
        System.out.println(10+20);
    }
    void add(int x) {
        System.out.println(x+20);
    }
    void add(int x,int y) {
        System.out.println(x+y);
    }
    void add(float x,float y) {
        System.out.println(x+y);
    }
    void add(String x, String y) {
        System.out.println(x+y);
    }

//    void read() {
//
//    }
//    void display() {
//
//    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
       Operation op1 = new Operation();
       op1.add();
       op1.add(10.0f,20.0f);
       op1.add(10);
       op1.add(1,2);
       op1.add("10","20");
    }
}
