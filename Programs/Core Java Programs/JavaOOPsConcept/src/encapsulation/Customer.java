package encapsulation;

public class Customer {
    private int cid;
    private String cname;
    private int age;

    public Customer() {

    }
    public Customer(int cid, String cname, int age) {
        this.cid = cid;
        this.cname = cname;
        this.age = age;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
