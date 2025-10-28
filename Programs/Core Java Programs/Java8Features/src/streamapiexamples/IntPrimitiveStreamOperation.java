package streamapiexamples;

import javax.xml.transform.stream.StreamSource;
import java.util.Arrays;

public class IntPrimitiveStreamOperation {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("All element using forEach ");
        Arrays.stream(num).forEach(v->System.out.print(v+" "));
        System.out.println("All element with filter intermediate operator");
        System.out.println("Even number");
        Arrays.stream(num).filter(n->n%2==0).forEach(v->System.out.print(v+" "));
        System.out.println();
        System.out.println("Odd number");
        Arrays.stream(num).filter(n->n%2!=0).forEach(v->System.out.print(v+" "));
        System.out.println();
        System.out.println("> 5 number");
        Arrays.stream(num).filter(n->n>5).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("map inter mediator operator");
        Arrays.stream(num).map(m->m*2).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("map and filter inter mediator operator");
        Arrays.stream(num).map(m->m*2).filter(v->v>10).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("skip inter mediator operator");
        Arrays.stream(num).skip(4).forEach(v->System.out.print(v+" "));
        System.out.println("");
        System.out.println("limit inter mediator operator");
        Arrays.stream(num).limit(4).forEach(v->System.out.print(v+" "));
        System.out.println("count");
        long evenCount = Arrays.stream(num).filter(v->v%2==0).count();
        long oddCount= Arrays.stream(num).filter(v->v%2!=0).count();
        System.out.println("Even count is "+evenCount);
        System.out.println("Odd count is "+oddCount);
        System.out.println("anyMatch and allMatch");
        boolean result1 = Arrays.stream(num).anyMatch(v->v>=10);
        boolean result2 = Arrays.stream(num).allMatch(v->v>=2);
        boolean result3 = Arrays.stream(num).noneMatch(v->v>=20);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
