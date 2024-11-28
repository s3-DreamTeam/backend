package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
import ca.usherbrooke.fgen.api.exceptions.MyCustomException;
import ca.usherbrooke.fgen.api.mapper.machine_template_Mapper;
import io.quarkus.security.identity.SecurityIdentity;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

import static ca.usherbrooke.fgen.api.exceptions.StringExceptions.isStringGood;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_template_Service {

    @Inject
    machine_template_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("MachineTemplate/Get/Full")
    public String getTemplateMachine(Integer ID) throws Exception {
        System.out.println("MachineTemplate/Get/Full\nRaw data received (ID):");
        System.out.println(ID);

        machine_template val = new machine_template();

        try
        {
            information info = new information();
            info.id_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            val = Mapper.getTemplateMachine(info);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(val);

            System.out.println("MachineTemplate/Get/Full\nData received from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @POST
    @Path("MachineTemplate/Get/Image")
    public String getMachinesSpecificsImage(Integer ID) throws Exception {
        System.out.println("MachineTemplate/Get/Image\nRaw data received (ID):");
        System.out.println(ID);

        MachineTemplateImage ima = new MachineTemplateImage();

        try
        {
            information info = new information();
            info.id_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ima.image = Mapper.getImageMachine(info);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(ima);

            System.out.println("MachineTemplate/Get/Image\nData received from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

//    @Path("MachineTemplate/Get/Surface")
    @POST
    @Path("MachineTemplate/Get/Surface")
    public String getMachinesSpecificsSurface(Integer ID) throws Exception {
        System.out.println("MachineTemplate/Get/Surface\nRaw data received (ID):");
        System.out.println(ID);

        machine_template_surface variable = new machine_template_surface();

        try
        {
            ObjectMapper objectMapper = new ObjectMapper();
            information info = new information();
            info.id_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis");
            System.out.println(objectMapper.writeValueAsString(info));
            variable = Mapper.getMachineSurfaceTemplate(info);

            String jsonString = objectMapper.writeValueAsString(variable);

            System.out.println("Data from DB Check ici:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
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
    public void createMachineTemplate(String jsonString) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("Raw data received:");
        System.out.println(jsonString);

        try {
            machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);
            machineTemplate.id_usager = new authentificationService.User(identity).getUserID();

            CheckAllMachineTemplateStrings(machineTemplate);

            System.out.println("machine template:");
            System.out.println(objectMapper.writeValueAsString(machineTemplate));

            Mapper.createMachineTemplate(machineTemplate);

        } catch (Exception e) {
            System.out.println("erreur new machine template:\n" + e.getMessage());
            throw e;
        }
    }

    @POST
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

    @POST
    @Path("MachineTemplate/Delete")
    public void deleteMachinesSpecifics(Integer ID) throws Exception {

        try
        {
            information info = new information();
            info.id_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("MachineTemplate/Delete\nRaw data received (ID):");
            System.out.println(ID);

            if(!Mapper.isTemplateUsed(info))
            {
                System.out.println("Je delete ta mere");
                Mapper.deleteMachineTemplate(info);
                System.out.println("Finished deleting: " + ID);
            }
            else
            {
                throw new Exception("Template is used, you cannot delete this template");
            }
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception");
        }
    }

    private static void CheckAllMachineTemplateStrings(machine_template template) {
        List<String> fieldsToCheck = List.of(
                template.id_usager,
                template.manufacturier_type_m,
                template.model_type_m,
                template.climate_machine
        );

        for (String field : fieldsToCheck) {
            if (!isStringGood(field)) {
                throw new MyCustomException("; What you trying to do, inject SQL?", 572);
            }
        }
    }
}
