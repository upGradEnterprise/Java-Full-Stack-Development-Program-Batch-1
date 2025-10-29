package webapp;

public class ApiCall {
    public static void main(String[] args) {
        ApiResponse request1 = new SuccessRespone("success");
        //ApiResponse request2 = new FailureResponse("failure");
        System.out.println(ResponseProvider.typeOfReponse(request1));
        //System.out.println(ResponseProvider.typeOfReponse(request2));
    }
}
