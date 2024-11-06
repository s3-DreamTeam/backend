package ca.usherbrooke.fgen.api.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class healthService {

    @GET
    @Path("health")
    public Integer getHealthCheck() {

        return 69;
    }
}
