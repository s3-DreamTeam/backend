package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template_specific;
import ca.usherbrooke.fgen.api.mapper.machine_template_specific_Mapper;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_template_specific_Service {

    @Inject
    machine_template_specific_Mapper Mapper;

    @GET
    @Path("getAllTemplateMachine/{id_usager}")
    public List<machine_template_specific> getAllTemplateMachine(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getAllTemplateMachine(id_usager);
    }
}
