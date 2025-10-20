package polymorphism;
class Bank {
    void withdraw() {
        System.out.println("Withdraw process generic code");
    }
}
class Hdfc extends  Bank {
    @Override
    void withdraw() {
        System.out.println("Withdraw hdfc bank process code");
    }
    void deposit(){
        System.out.println("Deposit hdfc bank process code");
    }
}
public class MethodOverridingAnotherExample {
    public static void main(String[] args) {
      //  Hdfc hdfc = new Hdfc();
      //  hdfc.withdraw();
        Bank bb = new Bank();       // super class object
        bb.withdraw();
            Hdfc hdfc = new Hdfc();     // sub class object and same class reference.
        hdfc.deposit();
        hdfc.withdraw();            // override method
        //Hdfc hdfc1 = new Bank();    // creating super class object and sub class reference not possible
            // Run time polymophism with object creation
            Bank bb1 = new Hdfc();  // sub class object super class reference possible
            bb1.withdraw(); // we can call only super class method or only those method override by sub class.

            Hdfc hdfc2 = (Hdfc)bb1;     // down level type casting
            hdfc2.withdraw();
            hdfc2.deposit();
    }
}
