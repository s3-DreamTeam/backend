package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
import ca.usherbrooke.fgen.api.mapper.machine_template_page_Mapper;
import com.fasterxml.jackson.databind.JsonNode;
import io.quarkus.security.identity.SecurityIdentity;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.validation.constraints.Null;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_template_page_Service {

    @Inject
    machine_template_page_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("MachineTemplate/Get/Full")
    public machine_template getTemplateMachine(Integer ID)
    {
        System.out.println("MachineTemplate/Get/Full\nRaw data received (ID):");
        System.out.println(ID);

        machine_template val = new machine_template();

        try
        {
            val = Mapper.getTemplateMachine(ID);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(val);

            System.out.println("MachineTemplate/Get/Full\nData received from DB:");
            System.out.println(jsonString);

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
        }

        return val;

    }

    @POST
    @Path("MachineTemplate/Get/Image")
    public String getMachinesSpecificsImage(Integer ID)
    {
        System.out.println("MachineTemplate/Get/Image\nRaw data received (ID):");
        System.out.println(ID);

        String val = Mapper.getImageMachine(ID);

        System.out.println("MachineTemplate/Get/Image\nData received from DB:");
        System.out.println(val);
        return val;
    }

//    @Path("MachineTemplate/Get/Surface")
    @POST
    @Path("MachineTemplate/Get/Surface")
    public String getMachinesSpecificsSurface(Integer ID)
    {
        System.out.println("MachineTemplate/Get/Surface\nRaw data received (ID):");
        System.out.println(ID);

        machine_template_surface variable = new machine_template_surface();

        try
        {
            variable = Mapper.getMachineSurfaceTemplate(ID);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(variable);

            System.out.println("Data from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
        }

        return "variable";
    }

    @GET
    @Path("MachineTemplate/Get/AllID")
    public List<Integer> getMachinesSpecificsAllID()
    {
        try{
            return Mapper.getTemplateMachinesAllID(new authentificationService.User(identity).getUserID());
            //return Mapper.getTemplateMachinesAllID("graf2102");
//            List<Integer> inte = new ArrayList<Integer>();
//            inte.add(2);
//            return inte;
        }
        catch (Exception exception)
        {
            return new ArrayList<Integer>();
        }
    }

    @POST
    @Path("MachineTemplate/New")
    public void createMachineTemplate(String jsonString)
    {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("Raw data received:");
        System.out.println(jsonString);

        try {
            machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);

            System.out.println("machine template:");
            System.out.println(objectMapper.writeValueAsString(machineTemplate));

            machineTemplate.id_usager = new authentificationService.User(identity).getUserID();
            Mapper.createMachineTemplate(machineTemplate);

        } catch (Exception e) {
            System.out.println("erreur new machine template:\n" + e.getMessage());
        }
    }

    @GET
    @Path("MachineTemplate/Modify")
    public void modifyMachinesTemplate(String jsonString)
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);
            machineTemplate.id_usager = new authentificationService.User(identity).getUserID();
            Mapper.createMachineTemplate(machineTemplate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("MachineTemplate/Delete")
    public void deleteMachinesSpecifics(Integer id_machine)
    {
        Mapper.deleteMachineTemplate(id_machine);
    }
}
