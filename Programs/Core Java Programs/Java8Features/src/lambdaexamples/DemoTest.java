package lambdaexamples;
interface Hello {
    public void greeting();
}
class HelloImp implements  Hello {
    @Override
    public void greeting() {
        System.out.println("Provided body for Hello interface greeting method using separate class ");
    }


}
public class DemoTest {
    public static void main(String[] args) {
    // 1st way
        Hello h1 = new HelloImp();
        h1.greeting();
        //2nd way : providing the body for hello inerface using Anonymous inner class
        Hello h2 = new Hello(){
            @Override
            public void greeting() {
                System.out.println("Provided body for Hello interface greeting method using anonymous class 1st way");
            }


        };
        h2.greeting();

        Hello h3 = new Hello(){
            @Override
            public void greeting() {
                System.out.println("Provided body for Hello interface greeting method using anonymous class 2nd way");
            }


        };
        h3.greeting();

        // 3rd way using lambda style
        Hello h4 = ()->System.out.println("Provided by for Hello interface greeting method using Lambda style");
        h4.greeting();
    }
}
