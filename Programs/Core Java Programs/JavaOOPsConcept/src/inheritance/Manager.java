package inheritance;

public class Manager extends  Employee{
    private int numberOfEmp;
    public void readMgr() {
        readEmp();
        System.out.println("Enter the number of employee working under him/her");
        numberOfEmp = sc.nextInt();
        add.readAdd();
    }
    public void disMgr() {
        disEmp();
        System.out.println("Number of employee working under him/her "+numberOfEmp);
        add.disAdd();
    }
}
