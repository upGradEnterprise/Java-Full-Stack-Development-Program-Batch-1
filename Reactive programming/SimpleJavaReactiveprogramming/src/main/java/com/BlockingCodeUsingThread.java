package com;

public class BlockingCodeUsingThread {
    public static void main(String[] args) throws Exception{
        Thread t = Thread.currentThread();
        System.out.println("main thread "+t.getName());
        Thread tt = new Thread(()-> {
            Thread t1 = Thread.currentThread();
            try{
                System.out.println("user defined thread "+t1.getName());
                Thread.sleep(5000);
            }catch (Exception e) {
            }
        });
        tt.start();
        tt.join();
        System.out.println("main thread in exit "+t.getName());
    }
}
