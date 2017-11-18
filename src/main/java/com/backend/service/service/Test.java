package com.backend.service.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Ankit Bhatia on 8/28/16.
 */
@Service
@Path("/test")
public interface Test {
    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/testService")
    void testService();
}
