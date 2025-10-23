package listretrieveexamples;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;


public class ArrayListRetrieveExamples {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        // we can use enhanced loop
        // Iterator
        // ListIterator
        ListIterator li = al.listIterator();
        System.out.println("forward direction");
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("backward direction");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }


        System.out.println("Vector with enumeration");
        Vector vv = new Vector();
        vv.add(10);
        vv.add(29);
        vv.add(35);
        Enumeration en = vv.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
