package genericsexamples;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Operation {
    // ? type can be anything.
    public void receiveGenericSetValue(Set<?> ss){
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
    }
}
