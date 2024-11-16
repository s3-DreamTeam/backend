package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_specific_Mapper;
import ca.usherbrooke.fgen.api.business.machine_surface;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_inventory_Service {

    @Inject
    machine_inventory_specific_Mapper machine_inventory_specificMapper;

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("MachineInventory/Get/Full")
    public List<machine_inventory_specific> getMachinesSpecifics()
    {
        return machine_inventory_specificMapper.getAllMachine(new authentificationService.User(identity).getUserID());
    }

    @GET
    @Path("MachineInventory/Get/Image")
    public String getMachinesImage(String machineID)
    {
        return machine_inventory_specificMapper.getMachinesImage(new authentificationService.User(identity).getUserID(), machineID);
        //return "";
    }

    @GET
    @Path("MachineInventory/Get/Surface")
    public machine_surface getMachinesSurface(String machineID)
    {
        return machine_inventory_specificMapper.getMachinesSurface(new authentificationService.User(identity).getUserID());
    }

    @GET
    @Path("MachineInventory/Get/AllID")
    public List<Integer> getAllMachinesID()
    {
        List<Integer> listInt = machine_inventory_specificMapper.getAllMachinesID(new authentificationService.User(identity).getUserID());
        //List<Integer> listInt = new ArrayList<Integer>();
        return listInt;
    }

    @GET
    @Path("MachineInventory/New")
    public void newMachineSpecifics(Integer id_usager)
    {
        //machine_inventory_specificMapper.newMachineSpecifics(id_usager, machine);
    }

    @GET
    @Path("MachineInventory/Delete")
    public boolean deleteMachineSpecifics(Integer id_usager)
    {
        //return machine_inventory_specificMapper.deleteMachineSpecifics(id_usager, machine.id_machine);
        return false;
    }
}
