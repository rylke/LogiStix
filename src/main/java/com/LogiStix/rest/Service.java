package com.LogiStix.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Service {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("service/{serviceType}")
    public String getOrigin(@PathParam("serviceType") String serviceType) {
        return "Service is " + serviceType;
    }

}
