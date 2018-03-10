package com.william.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @author: william
 * Date: 2018-03-10
 * Time: 上午10:59
 * Description: com.william.service
 */
@Path("/messageservice")
public class MessageService {

    public MessageService() {
    }

    @GET
    @Path("/{param}")
    public Response printMessage(@PathParam("param") String msg) {
        String result = "Hello : " + msg;

        return Response.status(200).entity(result).build();
    }
}
