package webapp;

public class ResponseProvider {
    public static String typeOfReponse(ApiResponse response){
        return switch (response){
            case SuccessRespone sr->sr.message(sr.reponseMessage());
            case FailureResponse fr->fr.message(fr.responseMessage());
            default ->String.format("""
                        "status":"unknown",
                        "msg":"Unknown Message";
                    """);

        };
    }
}
