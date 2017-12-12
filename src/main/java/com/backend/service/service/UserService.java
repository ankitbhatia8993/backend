package com.backend.service.service;

import com.backend.service.entry.UserEntry;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

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

    @POST
    @Produces({"application/xml", "application/json"})
    @Consumes({"application/xml", "application/json"})
    @Path("/create")
    UserEntry create(UserEntry userEntry);

    @PUT
    @Produces({"application/xml", "application/json"})
    @Consumes({"application/xml", "application/json"})
    @Path("/update")
    UserEntry update(UserEntry userEntry);
}
