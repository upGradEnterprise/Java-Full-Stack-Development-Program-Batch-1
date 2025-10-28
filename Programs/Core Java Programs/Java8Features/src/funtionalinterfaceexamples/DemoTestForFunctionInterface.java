package funtionalinterfaceexamples;


import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class MyFunction implements Function<Integer,String>{
    @Override
    public String apply(Integer integer) {
        return "You pass me number as "+integer;
    }
}
public class DemoTestForFunctionInterface {
    public static void main(String[] args) {
    Function<Integer,String> f1 = new MyFunction();
    System.out.println(f1.apply(100));

    Function<Integer,String> f2 = (n)->"You pass value is "+n;
    System.out.println(f1.apply(101));
    Function<Float,String> f3 = (n)->"You pass float value as "+n;
    System.out.println(f3.apply(100.10f));
    Function<Integer,Integer> f4 = (n)->n*n;
    System.out.println(f4.apply(2));
        System.out.println(f4.apply(5));
            System.out.println(f4.apply(100));

        Predicate<Integer> isPositive = (value)->value>0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        Consumer<String> c1 = (msg)->System.out.println(msg);
        c1.accept("Hello");
        c1.accept("How r you");
        Supplier<Double> s1 = ()-> Math.random();
        System.out.println(s1.get());
    }
}
