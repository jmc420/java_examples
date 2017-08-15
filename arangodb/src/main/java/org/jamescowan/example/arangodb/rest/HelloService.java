package org.jamescowan.example.arangodb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class HelloService {
	
	@GET
    @Path("/hello")
    public String hello() {
        return "Hello";
    }
}