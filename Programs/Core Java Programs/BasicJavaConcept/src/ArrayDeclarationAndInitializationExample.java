public class ArrayDeclarationAndInitializationExample {
    public static void main(String[] args) {
        int []abc;
        int []num={10,20,30,40,50,60,4,88,12,35,32,90,67};
        System.out.println("Array Example");
        //System.out.println(abc);
        System.out.println(num);
        System.out.println(num[0]);
        System.out.println(num[4]);
        //System.out.println(num[8]);
        System.out.println("Display all array element one by one using for loop");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("Display all array element one by one using enhanced loop");
        for(int n:num){
            System.out.println(n);
        }
    }
}
