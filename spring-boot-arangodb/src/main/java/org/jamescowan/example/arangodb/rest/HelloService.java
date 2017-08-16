package org.jamescowan.example.arangodb.rest;

import javax.ws.rs.GET;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Path("/service")
@Component
public class HelloService {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
	
	public HelloService() {
		logger.info(HelloService.class.getSimpleName()+" starting");
	}
	
	@GET
	@Path("/hello")
    public String hello() {
        return "Hello";
    }
}