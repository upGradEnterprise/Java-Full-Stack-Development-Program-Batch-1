package queueexamples;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue q1 = new PriorityQueue();
        Queue q2 = new LinkedList();
        q1.add(3);q1.add(1);q1.add(2);q1.add(4);
        q2.add(3);q2.add(1);q2.add(2);q2.add(4);
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.poll());
        System.out.println(q2.poll());
        System.out.println(q1);
        System.out.println(q2);
    }
}
