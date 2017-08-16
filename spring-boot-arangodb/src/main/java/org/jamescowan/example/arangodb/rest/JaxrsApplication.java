package org.jamescowan.example.arangodb.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/spring-boot-arangodb/")
public class JaxrsApplication extends Application {
	
}