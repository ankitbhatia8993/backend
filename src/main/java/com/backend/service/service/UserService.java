package com.backend.service.service;

import com.backend.service.entry.UserEntry;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Ankit Bhatia on 12/17/16.
 */
@Service
@Path("/user")
public interface UserService {
    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/{id}")
    UserEntry findById(@PathParam("id") Long id);
}
