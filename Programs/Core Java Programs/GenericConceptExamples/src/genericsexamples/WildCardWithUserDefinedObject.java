package genericsexamples;

import java.util.ArrayList;
import java.util.List;

class A {

}
class B extends  A {

}
class C extends  B{

}
class D extends  C {

}
class Task {
    // ? can be any type ie A,B,C,D and Object
    void display1(List<?> ll){

    }
    // B it take only B object. no other objects.
    void display2(List<B> ll){

    }
    // B class object as well sub class of B class object.
    void display3(List<? extends B> ll){

    }
    // B class object as well as super class of B ie A and object.
    void display4(List<? super B> ll){

    }
}
public class WildCardWithUserDefinedObject {
    public static void main(String[] args) {
    List<A> ll1 = new ArrayList<>();
    List<B> ll2 = new ArrayList<>();
    List<C> ll3 = new ArrayList<>();
    List<D> ll4 = new ArrayList<>();
    List<Object> ll5 = new ArrayList<>();

    Task tt1 = new Task();
    tt1.display1(ll1);tt1.display1(ll2);tt1.display1(ll3);tt1.display1(ll4);tt1.display1(ll5);

    tt1.display2(ll2);
                        // sub class of B including B
    tt1.display3(ll2);
    tt1.display3(ll3);
    tt1.display3(ll4);
                                // super clas of B including B
    tt1.display4(ll1);
    tt1.display4(ll2);
    tt1.display4(ll5);
    }
}
