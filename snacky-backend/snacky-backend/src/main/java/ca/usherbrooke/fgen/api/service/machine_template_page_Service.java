package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template;
import ca.usherbrooke.fgen.api.business.receive_ID;
import ca.usherbrooke.fgen.api.business.usagerMachine;
import ca.usherbrooke.fgen.api.mapper.machine_template_page_Mapper;
import ca.usherbrooke.fgen.api.business.machine_template_surface;
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
    public List<machine_template> getTemplateMachine()
    {
        return Mapper.getTemplateMachine(new authentificationService.User(identity).getUserID());
    }

    @GET
    @Path("MachineTemplate/Get/Image")
    public String getMachinesSpecificsImage()
    {
        return Mapper.getImageMachine(new authentificationService.User(identity).getUserID());
    }

//    @Path("MachineTemplate/Get/Surface")
    @GET
    @Path("MachineTemplate/Get/Surface")
    public machine_template_surface getMachinesSpecificsSurface(Integer ID)
    {
//        usagerMachine id_usagerMachine = new usagerMachine();
//        id_usagerMachine.id_machine = ID;
//        id_usagerMachine.id_usager = new authentificationService.User(identity).getUserID();

//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            String jsonString = objectMapper.writeValueAsString(Mapper.getMachineSurfaceTemplate(1));
//            return jsonString;
//        } catch (Exception e) {
//
//            return "il faut que sa update un jour, big pls update idk\nerreur du message:\n" + e.getMessage();
//        }

//        try
//        {
//            machine_template_surface ma = new machine_template_surface();
//            ma.id_machine = 1;
//            ma.manufacturer_machine = "asd";
//            ma.model_machine = "asd";
//            return ma;
//        }catch (Exception e)
//        {
//            return new machine_template_surface();
//        }
        return Mapper.getMachineSurfaceTemplate(ID);
    }

    @GET
    @Path("MachineTemplate/Get/AllID")
    public List<Integer> getMachinesSpecificsAllID()
    {
        try{
            return Mapper.getTemplateMachinesAllID(new authentificationService.User(identity).getUserID());
            //return Mapper.getTemplateMachinesAllID("graf2102");
//            List<Integer> inte = new ArrayList<Integer>();
//            inte.add(1);
//            return inte;
        }
        catch (Exception exception)
        {
            return new ArrayList<Integer>();
        }
    }

//    @Path("MachineTemplate/New")
    @POST
    @Path("test")
    public void createMachineTemplate(String jsonString)
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            //machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);
            machine_template machineTemplate = new machine_template();
            machineTemplate.cash_machine = true;
            machineTemplate.model_machine = "allo charles";
            machineTemplate.manufacturer_machine = "Hardcoding for life";


            machineTemplate.id_usager = new authentificationService.User(identity).getUserID();
            Mapper.createMachineTemplate(machineTemplate);
        } catch (Exception e) {
            e.printStackTrace();
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
    public void deleteMachinesSpecifics(String id_machine)
    {
        Mapper.deleteMachineTemplate(id_machine);
    }
}
