public class TypeCastingExample {
    public static void main(String[] args) {
        byte a=10;
        short b=a;      // implicit type casting
        System.out.println("a "+a);
        System.out.println("b "+b);
        short c = 10;
        byte d = (byte)c;   // explicit type casting
        System.out.println("c "+c);
        System.out.println("d "+d);
        int e = 100;
        float f = e;
        System.out.println("e "+e);
        System.out.println("f "+f);
        //float g = 100;
        //float g = (float)100.10;
        float g = 100.10f;
        int h = (int)g;
        System.out.println("h "+g);
        System.out.println("g "+h);
    }
}
