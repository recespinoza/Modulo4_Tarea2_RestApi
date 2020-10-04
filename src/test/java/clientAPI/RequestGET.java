package clientAPI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RequestGET extends RequestClient {
    @Override
    public ResponseInformation send(RequestInformation request) {
        System.out.println("GET "+request.getUrl());

        // If I want to change the library  / framework
        Response response= this.client.target(request.getUrl())
                                      .request(MediaType.APPLICATION_JSON_TYPE)
                                      .headers(request.getHeaders())
                                      .get();

        ResponseInformation responseInformation = new ResponseInformation(response.readEntity(String.class),
                                                                          response.getStatus());

        response.close();
        return responseInformation;
    }
}
