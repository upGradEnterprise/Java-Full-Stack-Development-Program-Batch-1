package optionalclassexamples;

import java.util.Optional;

public class SimpleOptionalClassExamples {
    public static String sayHello() {
        //return null;
        return "Welcome to Java8 Features";
    }
    public static Optional<String> sayHi() {
        //Optional<String> op = Optional.of("Hello");
        Optional<String> op = Optional.ofNullable(null);
        return op;
        //return "Welcome to Java8 Features";
    }
    public static void main(String[] args) {
        // Before Java 8
        String result = sayHello();
        if(result!=null) {
            System.out.println(result.toUpperCase());
        }else {
            System.out.println("Value is null");
        }
        // After java 8 ;
        Optional<String> result1 = sayHi();
       if(result1.isPresent()) {
           String s1 = result1.get();
           System.out.println(s1.toUpperCase());
       }else {
           System.out.println("Value is null");
       }
       System.out.println("----------------------");
       sayHi().ifPresent(v->System.out.println(v.toLowerCase()));
       //System.out.println(sayHi().orElse("Value is null"));
    }
}
