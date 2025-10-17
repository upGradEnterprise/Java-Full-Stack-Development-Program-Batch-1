import java.util.Scanner;

public class ArrayMemoryCreationExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how many number do you want to store");
        int n = sc.nextInt();
        int []num=new int[n];
        System.out.println("enter the value one by one");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        // business logic on those values


        System.out.println("all elements are");
        for(int value:num){
            System.out.println(value);
        }
    }
}
