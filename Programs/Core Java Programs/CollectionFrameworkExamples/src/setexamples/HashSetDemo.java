package setexamples;

import java.util.HashSet;
class A {
    @Override
    public String toString() {
        return "This is A class object";
    }
}
class B {
    @Override
    public String toString() {
        return "This is B class object";
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        int a=10;
        Integer b = new Integer(a);
        Integer c=20;
        hs.add(b);
        hs.add(c);
        hs.add(30); //auto-boxing : converting int primitive to Object reference.
        hs.add(30); //auto-boxing : converting int primitive to Object reference.
        hs.add(10.20);
        hs.add(true);
        hs.add("Ravi");
        A obj1 = new A();
        B obj2 = new B();
        hs.add(obj1);
        hs.add(obj2);
        System.out.println(hs);
    }
}
