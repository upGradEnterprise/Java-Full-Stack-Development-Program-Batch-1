package com.controller;
import com.bean.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("reactive")
public class MyController {

    @GetMapping(value = "say")
    public Mono<String> sayHello() {
        return Mono.just("Spring Reactive Rest API");
    }

    @GetMapping(value = "employee")
    public Mono<Employee> getEmployee() {
     Employee emp1 = new Employee(100,"Ravi",12000);
     return Mono.just(emp1);
    }

    @GetMapping(value = "employeee")
    public Flux<Employee> getEmployees() {
        Employee emp1 = new Employee(100,"Ravi",12000);
        Employee emp2 = new Employee(101,"Raj",16000);
        return Flux.just(emp1,emp2);
    }


}
