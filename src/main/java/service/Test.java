package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by 11157 on 8/28/16.
 */
@Path("/test")
public interface Test {
    @GET
    @Produces({"application/xml", "application/json"})
    @Path("/testService")
    void testService();
}
