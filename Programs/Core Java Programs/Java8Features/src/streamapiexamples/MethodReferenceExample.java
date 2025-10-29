package streamapiexamples;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("A","B","C","D","E");
        System.out.println("display value using lambda expression");
        data.stream().forEach(v->System.out.println(v));
        System.out.println("display value using method reference");
        data.stream().forEach(System.out::println);
        System.out.println("using map convert all names in lower case with lambda");
        data.stream().map(n->n.toLowerCase()).forEach(v->System.out.println(v));
        System.out.println("using map convert all names in lower case with method reference");
        data.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
