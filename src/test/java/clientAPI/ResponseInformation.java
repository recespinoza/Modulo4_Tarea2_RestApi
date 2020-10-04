package clientAPI;

public class ResponseInformation {
    private String responseBody;
    private int responseCode;
    private String responseMessage;

    public ResponseInformation(){}

    public ResponseInformation(String responseBody, int responseCode){
        this.responseBody=responseBody;
        this.responseCode=responseCode;
    }


    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
