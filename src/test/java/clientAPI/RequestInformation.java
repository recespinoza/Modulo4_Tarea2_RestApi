package clientAPI;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import java.util.HashMap;
import java.util.Map;

public class RequestInformation {
    private String url;
    private Map<String, String> params = new HashMap<>();
    private MultivaluedMap <String, Object> headers= new MultivaluedHashMap<>();
    private String body;

    public RequestInformation(){}

    public RequestInformation(String url, Map<String,String> params, MultivaluedMap <String, Object> header,String body){
        this.url=url;
        this.params=params;
        this.headers=header;
        this.body=body;
    }

     public void addHeaders(String attribute,String value){
        this.headers.add(attribute,value);
     }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public MultivaluedMap<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(MultivaluedMap<String, Object> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
