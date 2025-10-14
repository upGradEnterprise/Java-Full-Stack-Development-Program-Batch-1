public class OperatorExamples {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println("sum "+sum);
        int a1=1;   // 0001
        int a2=2;   // 0010
        int result1 = a1&a2;
        int result2 = a|b;
        int result3 = a1>>1;
        int result4 = 1<<a1;
        System.out.println("result "+result1);
        System.out.println("result "+result2);
        System.out.println("result "+result3);
        System.out.println("result "+result4);
        boolean result5 = a1>a2?true:false;
        System.out.println("result5 "+result5);
    }
}
