package lambdaexamples;
@FunctionalInterface
interface Operation{
    public int add(int x, int y);
}
interface Compare{
    public String findLargest(int x, int y);
}
public class LambdaExamples {
    public static void main(String[] args) {
    Operation op1 = (x,y)->x+y;
    System.out.println("Addition of two number is "+op1.add(10,20));
    Operation op2 = (int x, int y)->x+y;
    System.out.println("Addition of two number is "+op2.add(1,2));
    Operation op3 = (a,b)->a+b;
    System.out.println("Addition of two number is "+op3.add(100,200));
    Operation op4 = (m,n)-> {
            int sum = m+n;
            return sum;
    };
    System.out.println("Addition two number is "+op4.add(1000,2000));
    Compare c1 = (x,y)-> {
      if(x>y){
          return "1st number largest";
      }  else {
          return "2nd numbr largest";
      }
    };
    System.out.println("Find the largest "+c1.findLargest(100,200));

    Compare c2 = (x,y)->x>y?"1st number largest":"2nd number largest";
        System.out.println("Find the largest "+c2.findLargest(1000,200));
    }
}
