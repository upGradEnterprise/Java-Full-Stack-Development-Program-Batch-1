package webapp;

public record SuccessRespone(String reponseMessage) implements  ApiResponse {

    public String message(String responseMessage){
        return String.format("""
                        "status":"success",
                        "msg":"Successfully done!";
                    """);
    }
}
