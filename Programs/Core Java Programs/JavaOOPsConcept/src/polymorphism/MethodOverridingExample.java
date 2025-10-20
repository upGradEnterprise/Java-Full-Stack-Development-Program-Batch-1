package polymorphism;
class Bike {
    void speed() {
        System.out.println("Bike generic Speed : 60km/hr");
    }
}
class Pulsar extends Bike {
    void mailage() {
        System.out.println("Pulsa bike mailage : 40km/lt");
    }
    void speed() {                  // override speed method
        System.out.println("Pular bike Speed : 90km/hr, overriding speed method of Bike class ");
    }
}
class Honda extends Bike {
    void mailage() {
        System.out.println("Honda bike mailage : 60km/lt");
    }
    // re-usability of speed method provided by bike
}
class Tvs extends Bike {
    void mailage() {
        System.out.println("Tvs bike mailage : 50km/lt");
    }
    void speed() {
        //speed();        // it call same class speed method
        super.speed();   // call super class speed method
        System.out.println("Tvs Bike speed : 20km/hr"); // merge the output
    }
}
public class MethodOverridingExample {
    public static void main(String[] args) {
    Bike bb = new Bike();
    bb.speed();
    Pulsar pu = new Pulsar();
    pu.speed();
    pu.mailage();
    Honda hh = new Honda();
    hh.speed();
    hh.mailage();
    Tvs tvs =new Tvs();
    tvs.mailage();
    tvs.speed();
    }
}
