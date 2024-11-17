package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.MachineTemplateImage;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_inventory_surface;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_Mapper;
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
    machine_inventory_Mapper machine_inventory_specificMapper;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("MachineInventory/Get/Full")
    public machine getMachinesSpecifics(Integer ID)
    {
        return machine_inventory_specificMapper.getMachine(ID);
    }

    @POST
    @Path("MachineInventory/Get/Image")
    public String getMachinesImage(Integer ID) throws Exception {
        System.out.println("MachineInventory/Get/Image\nRaw data received (ID):");
        System.out.println(ID);

        MachineTemplateImage ima = new MachineTemplateImage();
        ima.image = machine_inventory_specificMapper.getMachinesImage(ID);
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(ima);

            System.out.println("MachineInventory/Get/Image\nData received from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @POST
    @Path("MachineInventory/Get/Surface")
    public String getMachinesSurface(Integer ID) throws Exception {
        try
        {
            machine_inventory_surface variable = machine_inventory_specificMapper.getMachinesSurface(ID);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(variable);

            System.out.println("Data from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @GET
    @Path("MachineInventory/Get/AllID")
    public List<Integer> getAllMachinesID()
    {
        List<Integer> listInt = machine_inventory_specificMapper.getAllMachinesID(new authentificationService.User(identity).getUserID());
        return listInt;
    }

    @POST
    @Path("MachineInventory/New")
    public void newMachineSpecifics(String jsonString) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            machine newMachine = objectMapper.readValue(jsonString, machine.class);
            newMachine.id_usager = new authentificationService.User(identity).getUserID();

            machine_inventory_specificMapper.newMachineSpecifics(newMachine);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("This is a general exception");
        }
    }

    @POST
    @Path("MachineInventory/Delete")
    public void deleteMachineSpecifics(Integer ID) throws Exception {
        try
        {
            machine_inventory_specificMapper.deleteMachineSpecifics(ID);
            System.out.println("Finished deleting: " + ID);
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception");
        }

    }
}
