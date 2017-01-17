package com.daniyltrump.service;

import com.daniyltrump.entities.IOEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by imirza on 1/13/2017.
 */
@Component
public class EventsService  {

   @Autowired
   MongoTemplate mongoTemplate;

    private static final Logger logger = LoggerFactory.getLogger(EventsService.class);
    public Object create(IOEvent ioEvent) throws Exception {

        mongoTemplate.insert(ioEvent);
        return ioEvent;
    }
}

