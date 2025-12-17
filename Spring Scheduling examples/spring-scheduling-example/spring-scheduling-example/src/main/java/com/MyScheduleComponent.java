package com;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduleComponent {

    @Scheduled(fixedRate = 1000)
    public void runTask() {

        System.out.println("This task execute after every 1 second");
    }
    @Scheduled(fixedDelay = 3000)
    public void delayTask() {
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println("This task execute after every 5 second");
    }
}
