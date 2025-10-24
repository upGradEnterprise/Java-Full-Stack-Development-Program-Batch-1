package com;

public class DefaultThreadDetails {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("My Demo Thread");
        t.setPriority(1);
        //t.setPriority(11);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
        String name = t.getName();
        int priority = t.getPriority();
        System.out.println("name of the thread "+name);
        System.out.println("priority of the thread "+priority);
       ThreadGroup tg   =   t.getThreadGroup();
       System.out.println(tg);
       System.out.println("Thread group "+tg.getName());
    }
}
