package encapsulation;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setCid(100);
        c1.setCname("Raj");
        c1.setAge(21);

        System.out.println("CId is "+c1.getCid());
        System.out.println("CName is "+c1.getCname());
        System.out.println("Age is "+c1.getAge());

        Customer c2 = new Customer(102,"Ravi",23);

        System.out.println("CId is "+c2.getCid());
        System.out.println("CName is "+c2.getCname());
        System.out.println("Age is "+c2.getAge());
    }
}
