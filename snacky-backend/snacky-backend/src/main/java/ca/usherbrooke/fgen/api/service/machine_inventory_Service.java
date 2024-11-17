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
    public String getMachinesImage(Integer machineID)
    {
        return machine_inventory_specificMapper.getMachinesImage(machineID);
        //return "";
    }

    @GET
    @Path("MachineInventory/Get/Surface")
    public machine_surface getMachinesSurface(Integer machineID)
    {
        return machine_inventory_specificMapper.getMachinesSurface(machineID);
    }

    @GET
    @Path("MachineInventory/Get/AllID")
    public List<Integer> getAllMachinesID()
    {
        List<Integer> listInt = machine_inventory_specificMapper.getAllMachinesID(new authentificationService.User(identity).getUserID());
        //List<Integer> listInt = new ArrayList<Integer>();
        return listInt;
    }

    @POST
    @Path("MachineInventory/New")
    public void newMachineSpecifics(String jsonString)
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            machine newMachine = objectMapper.readValue(jsonString, machine.class);
            newMachine.id_usager = new authentificationService.User(identity).getUserID();

            machine_inventory_specificMapper.newMachineSpecifics(newMachine);
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
