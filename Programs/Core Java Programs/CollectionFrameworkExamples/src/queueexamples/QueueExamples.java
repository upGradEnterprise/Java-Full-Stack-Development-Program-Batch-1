package queueexamples;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
//        Queue q1 = new PriorityQueue();
//        Queue q2 = new LinkedList();
//        q1.add(3);q1.add(1);q1.add(2);q1.add(4);
//        q2.add(3);q2.add(1);q2.add(2);q2.add(4);
//        System.out.println(q1);
//        System.out.println(q2);
//        System.out.println(q1.poll());
//        System.out.println(q2.poll());
//        System.out.println(q1);
//        System.out.println(q2);

            // double ended queue
        // we can add element from head and tail as well as we can remove
        ArrayDeque q3 = new ArrayDeque();
        LinkedList q4 = new LinkedList();
        q3.addFirst(10);
        q3.add(20);
        q3.add(30);
        q3.add(40);
        q3.addLast(50);
        System.out.println(q3);
        System.out.println(q3.pop());       // remove from begining
        System.out.println(q3.pollLast());  // remove from last
        System.out.println(q3);
    }
}
