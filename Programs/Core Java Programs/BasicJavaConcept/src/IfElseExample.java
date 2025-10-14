public class IfElseExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if(a>b ){
            System.out.println("a value is largest");
        }else {
            System.out.println("b value is largest");
        }
        System.out.println("---------------------");
        int total = 90;
        if(total>=90){
            System.out.println("A+");
        }else if(total>=80){
            System.out.println("A");
        }else if(total >=70){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
    }
}
