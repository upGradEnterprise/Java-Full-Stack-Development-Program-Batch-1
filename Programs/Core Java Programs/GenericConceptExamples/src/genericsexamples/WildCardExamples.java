package genericsexamples;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Operation {
    // ? type can be anything.
    public void receiveGenericSetValue(Set<?> ss){
        System.out.println("Wild card ?");
        System.out.println(ss);
    }
    public void receiveAnyCollectionType(Collection<?> ss){
        System.out.println("Wild card ?");
        System.out.println(ss);
    }
    public void receiveSetOfInteger(Set<Integer> ss){
        System.out.println("Integer");
        System.out.println(ss);
    }
    public void receiveSetOfString(Set<String> ss){
        System.out.println("String");
        System.out.println(ss);
    }
    public void receiveSetOfObject(Set<Object> ss){
        System.out.println("Object type");
        System.out.println(ss);
    }
    // this method receive set of any type but subclass or extends of Number type.
    public void receiveSetOfNumberType(Set<? extends Number> ss){
        System.out.println("wild car ? extends Number");
    }
    // this method receive set of Integer as well as super class of Integer.
    // Integer, Number, Object
    public void receiveSetOfIntegerAndSuper(Set<? super Integer> ss){
        System.out.println("wild car ? super Integer");
    }
}
public class WildCardExamples {
    public static void main(String[] args) {
    // Set
        Operation op = new Operation();
        Set<Integer> ss1 = new HashSet<>();
        ss1.add(10); ss1.add(20); ss1.add(30);
        op.receiveGenericSetValue(ss1);
        op.receiveSetOfInteger(ss1);
        //op.receiveSetOfString(ss1);
        //op.receiveSetOfObject(ss1);

        Set<String> ss2 = new HashSet<>();
        ss2.add("A"); ss2.add("B"); ss2.add("C");
        op.receiveGenericSetValue(ss2);
        //op.receiveSetOfInteger(ss2);
        op.receiveSetOfString(ss2);
        //op.receiveSetOfObject(ss2);

        Set<Object> ss3 = new HashSet<>();
            ss3.add("A"); ss3.add(100); ss3.add(100.20);
        op.receiveGenericSetValue(ss3);
        op.receiveSetOfObject(ss3);
        //op.receiveSetOfInteger(ss3);
        //op.receiveSetOfString(ss3);

        Set<Float> ss4 = new HashSet<>();
        ss4.add(10.20f); ss4.add(20.20f); ss4.add(30.30f);

        Set<Number> ss5 = new HashSet<>();
        ss5.add(10); ss5.add(20.20); ss5.add(30.30f);


        op.receiveSetOfNumberType(ss1); // integer
        op.receiveSetOfNumberType(ss4); // float
        op.receiveSetOfNumberType(ss5); // Number
        //op.receiveSetOfNumberType(ss2); String type
        //op.receiveSetOfNumberType(ss3);



        // syper of Integer is Number and Object
        op.receiveSetOfIntegerAndSuper(ss1);    // Integer
        op.receiveSetOfIntegerAndSuper(ss3);    // object
        op.receiveSetOfIntegerAndSuper(ss5);    // number
    }
}
