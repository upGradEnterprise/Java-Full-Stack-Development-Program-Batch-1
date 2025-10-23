package listexamples;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll  = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        ll.add(2,100);
        System.out.println(ll);
    }
}
