package wrapperclasses;

public class AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {
        int a=10;
        Integer b = new Integer(a); // old version
        Integer c = 10;     // converting primitive to object. auto boxing :converting
                // primitive to object

        int d = b;  // auto-unboxing : converting object to primitive
        int e = b.intValue();   // old version
    }
}
