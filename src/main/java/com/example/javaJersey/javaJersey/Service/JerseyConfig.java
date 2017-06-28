package com.example.javaJersey.javaJersey.Service;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luis on 6/28/2017.
 */

@Configuration
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        register(RestActivityService.class);
    }
}
