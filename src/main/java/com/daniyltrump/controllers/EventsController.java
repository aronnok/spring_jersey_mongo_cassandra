package com.daniyltrump.controllers;

import com.daniyltrump.entities.IOEvent;
import com.daniyltrump.entities.IOEventCas;
import com.daniyltrump.service.EventsService;
import com.daniyltrump.service.IOEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashMap;

/**
 * Created by imirza on 2017-01-13.
 */

@Component
@Path("/ioevents")
public class EventsController {

    private static final Logger logger = LoggerFactory.getLogger(EventsController.class);

    @Autowired
    EventsService eventsService;

    @Autowired
    IOEventService ioEventService;

    @GET
    @Path("/get")
    @Produces("application/json")
    public Response get() {

        HashMap<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("message", "Hello from jersey event service");
        return Response.ok(apiResponse).build();

    }

    @POST
    @Consumes("application/json")
    @Path("/mongo")
    @Produces("application/json")
    public Response post(IOEvent ioEvent) {

        HashMap<String, Object> apiResponse = new HashMap<>();

        try {
            eventsService.create(ioEvent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return Response.ok(apiResponse).build();
    }

    @POST
    @Consumes("application/json")
    @Path("/cassandra")
    @Produces("application/json")
    public Response postCas(IOEventCas ioEvent) {

        HashMap<String, Object> apiResponse = new HashMap<>();

        apiResponse.put("message","saved:"+ioEvent.getName());
        try {
            ioEventService.create(ioEvent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return Response.ok(apiResponse).build();
    }
}