package org.jamescowan.example.arangodb.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/arangodb/")
public class JaxrsApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	
	public JaxrsApplication() {
		singletons.add(new HelloService());
	}
	
	@Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}