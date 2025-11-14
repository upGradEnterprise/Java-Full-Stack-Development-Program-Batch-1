package com;

import reactor.core.publisher.Mono;

public class MonoExample {
    public static void main(String[] args) {
        // Server
        //Mono<String> mono = Mono.just("Hello");       // 1 data   , Hello, done
        //Mono<String> mono = Mono.empty();               // no data    done
        Mono<String> mono = Mono.error(new Exception("Error")); // error
        // Client
        //mono.subscribe(s-> System.out.println(s));
        mono.subscribe((result)-> {
            System.out.println("Data "+result);
        },(error)-> {
            System.out.println("Error "+error);
        },()-> {
            System.out.println("done successfully");
        });
    }
}
