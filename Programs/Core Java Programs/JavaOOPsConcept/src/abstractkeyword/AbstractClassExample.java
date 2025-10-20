package abstractkeyword;
abstract class Bike {
    int wheel;
    Bike() {
        wheel=2;
    }
    abstract void speed();
    void mailage() {
        System.out.println("Generic mailage is 55km/lt");
    }
}
class Pulsar extends Bike {
    @Override
    void speed() {
        System.out.println("Pulsar class speed method logic 90km/hr");
    }
}
abstract  class Honda extends Bike {

}
class Activa extends  Honda{
    @Override
    void speed() {
        System.out.println("Active class speed method logic 60km/hr");
    }
    @Override
    void mailage() {
        System.out.println("Active class mailage is 45km/lt");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
      Bike bb1 = new Pulsar();
      bb1.mailage();
      bb1.speed();
      Bike bb2 = new Activa();
      bb2.mailage();
      bb2.speed();
    }
}
