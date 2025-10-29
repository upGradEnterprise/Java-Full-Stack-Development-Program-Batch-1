package sealedexamples;
sealed class Payment permits CreditCard,UpiPayment{
    public void payment() {
        System.out.println("Generic Payment Logic");
    }
}
sealed class CreditCard extends Payment permits MasterCreditCard,VisaCreditCard {
    @Override
    public void payment() {
        System.out.println("Credit Card Payment");
    }
}
final class MasterCreditCard extends CreditCard {
    @Override
    public void payment() {
        System.out.println("Credit Card Payment through master card");
    }
}
final class VisaCreditCard extends CreditCard {
    @Override
    public void payment() {
        System.out.println("Credit Card Payment through master card");
    }
}
final class UpiPayment extends  Payment {
    @Override
    public void payment() {
        System.out.println("Upi Payment");
    }
}
//class PhonePay extends Payment {
//
//}
public class JavaSealedAndPermitsExample {
    public static void main(String[] args) {
    Payment payment1 = new CreditCard();
    payment1.payment();
    Payment payment2 = new MasterCreditCard();
    payment2.payment();
    Payment payment3 = new UpiPayment();
    payment3.payment();
    }
}
