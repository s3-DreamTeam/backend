package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template_page;
import ca.usherbrooke.fgen.api.mapper.machine_template_page_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_template_page_Service {

    @Inject
    machine_template_page_Mapper Mapper;

    @GET
    @Path("MachineTemplate/Get/Full/{id_usager}")
    public List<machine_template_page> getMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getCompactTemplateMachine(id_usager);
    }
}
