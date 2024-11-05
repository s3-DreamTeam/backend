package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_inventory_page;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_page_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_inventory_pageService {

    @Inject
    machine_inventory_page_Mapper machine_inventory_pageMapper;

    @GET
    @Path("getAllMachineInventoryPage/{id}")
    public List<machine_inventory_page> getAllmachine_inventory_page(@PathParam("id") Integer id) {

        return machine_inventory_pageMapper.getCompactMachine(id);
    }


}
