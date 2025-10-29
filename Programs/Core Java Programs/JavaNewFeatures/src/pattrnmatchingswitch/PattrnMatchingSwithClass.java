package pattrnmatchingswitch;

public class PattrnMatchingSwithClass {

    static void PrintDataTypesInfo(Object obj){
        switch (obj){
            case String s->System.out.println("You pass string object "+s);
            case Integer i when i>0->System.out.println("you pass +ve value "+i);
            case Integer i when i<0->System.out.println("you pass -ve value "+i);
            case Float f->System.out.println("you pass float value "+f);
            case null ->System.out.println("you pass null value");
            default -> System.out.println("Unkown type ");
        }
    }
    public static void main(String[] args) {
        PrintDataTypesInfo("Hello");
        PrintDataTypesInfo(100);
        PrintDataTypesInfo(-100);
        PrintDataTypesInfo(10.10f);
        PrintDataTypesInfo(null);
        PrintDataTypesInfo(true);
    }

}
