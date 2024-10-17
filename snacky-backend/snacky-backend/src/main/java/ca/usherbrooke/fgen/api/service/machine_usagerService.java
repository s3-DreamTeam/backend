package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_usager;
import ca.usherbrooke.fgen.api.mapper.machine_usager_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_usagerService {

    @Inject
    machine_usager_Mapper machine_usagerMapper;

    @GET
    @Path("getall_machine_usager")
    public List<machine_usager> getAllMachine_usager() {
        List<machine_usager> Usagers = machine_usagerMapper.getAll();
        //System.out.println("users: " + Usagers);
        return Usagers;
    }
}
