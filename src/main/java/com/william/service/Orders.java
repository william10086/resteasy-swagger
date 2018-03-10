package com.william.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * @author: william
 * Date: 2018-03-10
 * Time: 上午10:49
 * Description: com.william
 */
@Path("orders")
public class Orders {

    @Path("{id}")
    @GET
    @Produces("text/plain")
    public String getOrder(@PathParam("id") String id) {
        return "Order Id is : " + id;
    }
}