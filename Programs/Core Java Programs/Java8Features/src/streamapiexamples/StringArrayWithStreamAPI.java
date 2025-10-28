package streamapiexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringArrayWithStreamAPI {
    public static void main(String[] args) {
        String names[]={"Raj","Ravi","Ajay","Vikash","Vikash","Raj","Mahesh","Reeta","Meeta","Keeta"};
        System.out.println("display all names using stream api");
        Arrays.stream(names).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("filter names start with R");
        Arrays.stream(names).filter(s->s.startsWith("R")).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("filter names contains 'ee' character");
        Arrays.stream(names).filter(s->s.contains("ee")).forEach(v->System.out.print(v+" "));

        System.out.println("");
        System.out.println("map display in upper case");
        Arrays.stream(names).map(n->n.toUpperCase()).forEach(v->System.out.print(v+" "));

        // collect terminal operator
        System.out.println("");
   List<String> namesEECharcters= Arrays.stream(names).filter(s->s.contains("ee")).collect(Collectors.toList());
    System.out.println(namesEECharcters);
    Set<String> UpperCaseNamesSet =Arrays.stream(names).map(n->n.toUpperCase()).collect(Collectors.toSet());
    System.out.println(UpperCaseNamesSet);
    List<String> UpperCaseNamesList =Arrays.stream(names).map(n->n.toUpperCase()).collect(Collectors.toList());
    System.out.println(UpperCaseNamesList);
    }
}
