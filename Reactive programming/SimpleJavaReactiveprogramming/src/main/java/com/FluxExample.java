package com;

import reactor.core.publisher.Flux;

public class FluxExample {
    public static void main(String[] args) {
//        Flux<Integer> flux = Flux.range(1, 10);
//        flux.subscribe(System.out::println);

        Flux<Integer> flux = Flux.just(1,2,3,4,5).concatWithValues(6).concatWith(Flux.error(new Exception("Error generated"))).concatWithValues(7);

        flux.subscribe(System.out::println, System.err::println,()->System.out.println("Done"));

        System.out.println("Normal code");
       }
}
