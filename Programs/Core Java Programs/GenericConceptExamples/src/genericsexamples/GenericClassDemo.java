package genericsexamples;
class GenericClass<T>{
    GenericClass(T obj){
        System.out.println("object created with value as "+obj);
    }
}
class GenericMethodExample {
    <V> void display(V obj) {
        System.out.println("you pass the value as "+obj);
    }
    <K> void add(K obj1,K obj2) {
        System.out.println(obj1+" "+obj2);
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
      GenericClass t1 = new GenericClass("Rai");
      GenericClass t2 = new GenericClass(100);
      GenericClass t3 = new GenericClass(100.10);
      GenericClass<String> t4 = new GenericClass<String>("Raj");
      GenericClass<Integer> t5 = new GenericClass<Integer>(200);
      GenericClass<Float> t6 = new GenericClass<Float>(200.40f);
      System.out.println("------------------");
      GenericMethodExample gm1 = new GenericMethodExample();
      gm1.display(10);
      gm1.display("Ravi");
      gm1.display(10.10);
      gm1.add(10,20);
      gm1.add(10.10,20.20);
      gm1.add("Raj","Deep");
    }
}
