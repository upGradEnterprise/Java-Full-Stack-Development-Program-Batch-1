package webapp;

public sealed interface ApiResponse permits SuccessRespone,FailureResponse {
    public String message(String responseMessage);
}
