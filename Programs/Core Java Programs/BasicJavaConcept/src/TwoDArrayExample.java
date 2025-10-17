import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many row ");
        int rows = sc.nextInt();
        System.out.println("How many cols ");
        int cols = sc.nextInt();
        int num[][]=new int[rows][cols];
        System.out.println("Enter the element one by one");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array element in matrix format");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
