package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_specific_Mapper;
import ca.usherbrooke.fgen.api.business.machine_surface;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public List<machine> getMachinesSpecifics()
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
    public void newMachineSpecifics(String jsonString)
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            machine newMachine = objectMapper.readValue(jsonString, machine.class);
            machine_inventory_specificMapper.newMachineSpecifics(new authentificationService.User(identity).getUserID(), newMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("MachineInventory/Delete")
    public boolean deleteMachineSpecifics(String machineID)
    {
        return machine_inventory_specificMapper.deleteMachineSpecifics(new authentificationService.User(identity).getUserID(), machineID);
    }
}
