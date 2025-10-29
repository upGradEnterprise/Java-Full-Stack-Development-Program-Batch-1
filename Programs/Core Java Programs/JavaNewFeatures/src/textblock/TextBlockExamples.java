package textblock;

public class TextBlockExamples {
    public static void main(String[] args) {
        String msg1="Welcome to Java";
        String msg2="Welcome to Java Today\n " +
                "we are leaning java \n" +
                "new features";
        String msg3="Welcome"+
                    "Once again";
        String textBlock = """
                    Welcome to Java 
                    with text block 
                    features 
                """;
        String jsonData = """
                {
                 "id":100,
                 "name":"Ravi",
                  "age":21
                }
                """;
        System.out.println(msg2);
        System.out.println(textBlock);
        System.out.println(jsonData);
    }
}
