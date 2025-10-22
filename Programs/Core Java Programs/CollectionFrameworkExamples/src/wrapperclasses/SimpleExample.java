package wrapperclasses;

public class SimpleExample {
    public static void main(String[] args) {
        int a=10;       // primitive
        Integer b = new Integer(a);     // b is object consider. converting primitive to objects.
        int c = b.intValue();       // converting primitive to object
        float d = b.floatValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("Converting string to primitive and vice-versa");
        int m=10;
        int n=20;
        System.out.println(m+n);            // 30
        String s1 = String.valueOf(m); // converting int to string
        String s2 = String.valueOf(n);
        System.out.println(s1+s2);          // 1020
        int m1 = Integer.parseInt(s1);
        int n1 = Integer.parseInt(s2);
        System.out.println(m1+n1);      // 30
    }
}
