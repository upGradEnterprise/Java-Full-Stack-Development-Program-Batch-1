public class SwitchStatementExamples {
    public static void main(String[] args) {
        int choice = 1;
        switch (choice){
            case 1: System.out.println("block1");
                    //break;
            case 2: System.out.println("block2");
                break;
            case 3: System.out.println("block3");
                break;
            case 4: System.out.println("block4");
                break;
            default :System.out.println("wrong block");
              //  break;
        }
        System.out.println("finish");

    }
}
