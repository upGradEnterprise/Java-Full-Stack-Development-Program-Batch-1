package com;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public class ReactiveNonBlocking {
    public static void main(String[] args) throws Exception {
        Thread t= Thread.currentThread();
        System.out.println("main thread "+t.getName());
        Mono.fromRunnable(()-> {
            try{
            //Thread.sleep(5000);
            Thread tt = Thread.currentThread();
            System.out.println("inside fromRunnable thread "+tt.getName());
            }catch (Exception e){

            }
        }).subscribeOn(Schedulers.boundedElastic()).subscribe();

        System.out.println("Main thread in exit "+t.getName());

        //Thread.sleep(5000);
    }
}
