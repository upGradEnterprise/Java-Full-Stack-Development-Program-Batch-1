package recodsexamples;
record Person(String name,int age){
        // Validation while creating record reference.
        Person{
            if(age<0){
                throw new IllegalArgumentException("age must be +ve");
            }
        }
}
public class SimpleRecordExample {
    public static void main(String[] args) {
    Person p1 = new Person("Raj",21);
    Person p2 = new Person("Ajay",34);
    System.out.println(p1.name()+" "+p1.age());
    System.out.println(p1);
    System.out.println(p2.name()+" "+p2.age());
    System.out.println(p2);
    Person p3 = new Person("Mahesh",-21);

    }
}
