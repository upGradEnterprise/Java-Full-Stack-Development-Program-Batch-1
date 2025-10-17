import java.util.Scanner;

public class StudentSkillJaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("How many student details do you want to store");
        int numberOfStd = sc.nextInt();
        String names[]=new String[numberOfStd];
        String skillSet[][]=new String[numberOfStd][];
        System.out.println("Enter the student details one by one");
        for(int i=0;i<numberOfStd;i++){
            System.out.println("Enter the student name");
            names[i]=sc.next();
            System.out.println("how many skill do you know?");
            int skill = sc.nextInt();
            skillSet[i]=new String[skill];  // skill value dynamic
            for(int j=0;j<skill;j++){
                skillSet[i][j]=sc.next();
            }
        }
        System.out.println("Student details");
        for(int i=0;i<numberOfStd;i++){
            System.out.println("Name "+names[i]);
            for(int j=0;j<skillSet[i].length;j++){
                System.out.print(skillSet[i][j]+" ");
            }
            System.out.println();
        }
    }
}
