package inheritance;

public class Manager extends  Employee{
    private int numberOfEmp;
    public void readMgr() {
        System.out.println("Enter the number of employee working under him/her");
        numberOfEmp = sc.nextInt();
    }
    public void disMgr() {
        System.out.println("Number of employee working under him/her "+numberOfEmp);
    }
}
