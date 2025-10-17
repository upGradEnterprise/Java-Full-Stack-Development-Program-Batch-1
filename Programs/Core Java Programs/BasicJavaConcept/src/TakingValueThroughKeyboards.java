import java.util.Scanner;
public class TakingValueThroughKeyboards {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the id");
        int id = sc.nextInt();
        sc.nextLine(); // hold the enter key.
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Ener the salary");
        float salary = sc.nextFloat();
        System.out.println("id is "+id);
        System.out.println("name is "+name);
        System.out.println("salary is "+salary);
    }
}
