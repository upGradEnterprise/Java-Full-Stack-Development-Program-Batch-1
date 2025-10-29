package webapp;

public record FailureResponse(String responseMessage) implements  ApiResponse {
    public String message(String responseMessage){
        return String.format("""
                        "status":"failure",
                        "msg":"Failure with some error!";
                    """);
    }
}
