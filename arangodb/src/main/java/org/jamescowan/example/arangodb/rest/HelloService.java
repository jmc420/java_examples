package org.jamescowan.example.arangodb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/services")
public class HelloService {
	
	@GET
    @Path("/hello")
    public Response addMovie() {
        return Response.status(Response.Status.OK).build();
    }
}