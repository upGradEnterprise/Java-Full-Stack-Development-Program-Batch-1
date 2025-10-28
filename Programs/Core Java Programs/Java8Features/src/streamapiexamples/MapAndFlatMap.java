package streamapiexamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MapAndFlatMap {
    public static void main(String[] args) {
        int num1[]={1,2,3,4};
        int num2[][]={{1,2},{3,4}};
        // map : one to one relationship
        System.out.println("With Map with 1 D Array");
        Arrays.stream(num1).map(v->v).forEach(v->System.out.print(v+" "));
        System.out.println("");
        Arrays.stream(num2).map(v->v).forEach(v->System.out.print(Arrays.toString(v)+" "));
        // flatMap : one to many relationship
        System.out.println("");
        System.out.println("FlatMap");
        Arrays.stream(num2).flatMapToInt(v->Arrays.stream(v)).forEach(v->System.out.print(v+" "));
    }
}
