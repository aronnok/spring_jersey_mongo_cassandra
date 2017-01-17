package com.daniyltrump;

import com.daniyltrump.controllers.EventsController;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by imtiaz on 12/23/2016.
 */
@Component
@Configuration
public class JerseyConfig extends ResourceConfig {

     public JerseyConfig(){
         register(MultiPartFeature.class);
         register(EventsController.class);
     }

}
