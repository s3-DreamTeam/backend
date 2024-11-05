package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_specific_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_inventory_specific_Service {

    @Inject
    machine_inventory_specific_Mapper machine_inventory_specificMapper;

    @GET
    @Path("getAllMachinesSpecifics/{id_usager}")
    public List<machine_inventory_specific> getMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        return machine_inventory_specificMapper.getAllMachine(id_usager);
    }
}
