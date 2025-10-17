import java.util.Scanner;
import java.util.Random;
 
public class Demo {
    public static boolean check(Scanner s, String n) {
        Random r = new Random();
        int n1 = r.nextInt(10) + 1, n2 = r.nextInt(10) + 1, ans = n1 + n2;
        System.out.printf("\n%s: What is %d + %d? ", n, n1, n2);
        if (s.hasNextInt()) {
            if (s.nextInt() == ans) {
                System.out.println("-> LUCKY FELLOW!");
                return true;
            } else {
                System.out.println("-> UNLUCKY FELLOW GO AWAY.");
                return false;
            }
        } else {
            System.out.println("-> Invalid man. Enter a number.");
            s.next(); return false;
        }
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c, a=0, b=0, v=0;
        System.out.println("Good at maths?");
 
        do {
            System.out.print("\nStatus: A(" + a + ") B(" + b + ") C(" + v + ") | Enter choice (1-4): ");
           c = s.hasNextInt() ? s.nextInt() : 404;
           if (c == 404) s.next();
            switch (c) {
                case 1: 
                    if(a==0) if(check(s, "A")) a=1; else System.out.println("-> Already done."); 
                    break;
                case 2: 
                    if(b==0) if(check(s, "B")) b=1; else System.out.println("-> Already done."); 
                    break;
                case 3: 
                    if(v==0) if(check(s, "C")) v=1; else System.out.println("-> Already done."); 
                    break;
                case 4: 
                    if (a==1 && b==1 && v==1) {
                        System.out.println("Ahaa not bad man!");
                        c = 0;
                    } else {
                        System.out.println("AM SMARTER THEN U. Solve all challenges first.");
                    }
                    break;
                default:
                    if (c != 0) System.out.println("Invalid selection.");
            }
        } while (c != 0);
 
        s.close();
    }
}