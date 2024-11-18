package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;
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
    public machine getMachinesSpecifics(Integer ID) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        information info = new information();
        info.id_machine = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Full");
        System.out.println(objectMapper.writeValueAsString(info));
        machine mach = machine_inventory_specificMapper.getMachine(info);

        String jsonString = objectMapper.writeValueAsString(mach);

        System.out.println("MachineInventory/Get/Full\nData received from DB:");
        System.out.println(jsonString);
        return mach;
    }

    @POST
    @Path("MachineInventory/Get/Image")
    public String getMachinesImage(Integer ID) throws Exception {
        System.out.println("MachineInventory/Get/Image\nRaw data received (ID):");
        System.out.println(ID);

        MachineTemplateImage ima = new MachineTemplateImage();

        try
        {
            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Image");
            System.out.println(objectMapper.writeValueAsString(info));

            ima.image = machine_inventory_specificMapper.getMachinesImage(info);


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
            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Surface");
            System.out.println(objectMapper.writeValueAsString(info));

            machine_inventory_surface variable = machine_inventory_specificMapper.getMachinesSurface(info);
            String jsonString = objectMapper.writeValueAsString(variable);

            System.out.println("Data from DB: MachineInventory/Get/Surface:");
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

            System.out.println("This is what i am sending to Clovis: MachineInventory/New");
            System.out.println(objectMapper.writeValueAsString(newMachine));

            machine_inventory_specificMapper.newMachineInventaire(newMachine);
        } catch (Exception e) {
            throw new Exception("This is a general exception: MachineInventory/New:\n" + e.getMessage());
        }
    }

    @POST
    @Path("MachineInventory/Delete")
    public void deleteMachineSpecifics(Integer ID) throws Exception {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();

            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: MachineInventory/Delete");
            System.out.println(objectMapper.writeValueAsString(info));

            machine_inventory_specificMapper.deleteMachineInventaire(info);
            System.out.println("Finished deleting: " + ID);
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception: " + e.getMessage());
        }

    }
}
