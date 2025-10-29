package streamapiexamples;
interface Info{
    public String sayHello(String name);
}
class InfoImp{
    public static String sayHello(String name){
        return "Welcome user with method reference as static "+name;
    }
}
class InfoImp1{
    public String sayHello(String name){
        return "Welcome user with method reference as non static "+name;
    }
}
public class CustomMethodReferenceExample {
    public static void main(String[] args) {
     // provide the body for sayHello method using lambda style
         Info i1 = (name)->"Welcome user "+name;
     System.out.println(i1.sayHello("Raj"));
     // provide the method reference for sayHello with static method
            Info i2 = InfoImp::sayHello;
        System.out.println(i2.sayHello("Ajay"));
            Info i3 = (name)->"Hi user "+name;
        System.out.println(i3.sayHello("Raju"));
        InfoImp1 ref =new InfoImp1();
        Info i4 = ref::sayHello;
        System.out.println(i4.sayHello("Vikash"));
    }
}
