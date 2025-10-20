package runtimepolymorphism;
interface Client1 {
    public int add(int x, int y);
}

interface Client2 {
    public int sub(int x, int y);
}

class Server implements Client1,Client2{
    @Override
    public int add(int x, int y) {
        return x+y;
    }
    @Override
    public int sub(int x, int y) {
        return x-y;
    }
    public void ownMethod() {
        System.out.println("Server own method");
    }
}

public class RuntimePolymorphismUsingInterface {
    public static void main(String[] args) {
    Server ss = new Server();
    System.out.println("Client1 "+ss.add(10,20));
    System.out.println("Client2 "+ss.sub(100,50));
    ss.ownMethod();
        Client1 client1 = new Server(); // creating sub class object and super class reference can be normal class or abstract class or interface.
        Client2 client2 = new Server();
    System.out.println("Client1 "+client1.add(10,20));
    System.out.println("Client2 "+client2.sub(100,50));

//        System.out.println("Client1 "+client2.add(10,20));
//        System.out.println("Client1 "+client1.sub(10,20));
//        client1.ownMethod();
//        client2.ownMethod();
    }
}
