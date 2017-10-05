package com.LogiStix.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Origin {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("itinerary/{origin}/{destination}")
    public String getOrigin(@PathParam("origin") String origin, @PathParam("destination") String destination) {
        return "Trip is " + origin + " to " + destination;
    }


}
