package clientAPI;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class RequestPOST extends RequestClient {
    @Override
    public ResponseInformation send(RequestInformation request) {
        System.out.println("POST "+request.getUrl());
        System.out.println("body : \n"+request.getBody());

        // If I want to change the library / framework
        Response response= this.client.target(request.getUrl())
                                      .request(MediaType.APPLICATION_JSON_TYPE)
                                      .headers(request.getHeaders())
                                      .post(Entity.json(request.getBody()));

        ResponseInformation responseInformation = new ResponseInformation(response.readEntity(String.class),
                                                                          response.getStatus());

        response.close();
        return responseInformation;
    }
}
