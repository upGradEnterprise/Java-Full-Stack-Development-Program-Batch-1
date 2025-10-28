package streamapiexamples;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
class MyConsumer implements IntConsumer {
    @Override
    public void accept(int value) {
        System.out.print(value+" ");
    }
}
public class PrimitiveStreamAPIExamples {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};   // source
        System.out.println("Retreive data from array using enhaced loop");
        for(int n:num){
            if(n%2==0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
        System.out.println("Retrieve value from array without lambda");
        IntConsumer c1 = new MyConsumer();
            Arrays.stream(num).forEach(c1);
        System.out.println("");
        System.out.println("Retreive data using stream with lambda");
        //IntStream intStream= Arrays.stream(num);    // converted to stream
        //intStream.forEach(v->System.out.print(v+" "));    // terminal operator
            Arrays.stream(num).forEach(v->System.out.print(v+" "));
            System.out.println("display only even numbers");
        Arrays.stream(num).filter(v->v%2==0).forEach(v->System.out.print(v+" "));
    }
}
