package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template;
import ca.usherbrooke.fgen.api.business.testClass;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class test {

    @GET
    @Path("testGet")
    public String getMessage() {

//        testClass responseDTO = new testClass();
//        responseDTO.message = "Message.exe ";
//        return Response.ok(responseDTO).build();
        return "Ta mere";
    }

    @POST
    @Path("testPost")
    public Response postMessage() {

        testClass responseDTO = new testClass();
        responseDTO.message = "Message.exe ";
        return Response.ok(responseDTO).build();
        //return responseDTO;
    }

    @POST
    @Path("test")
    public String getMessagePara(machine_template machineTemplate) {

        //return jsonString;
//        testClass responseDTO = new testClass();
//        responseDTO.message = "Message.exe ";
//        return Response.ok(responseDTO).build();
        //ObjectMapper objectMapper = new ObjectMapper();

        try {
            //machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);
            //Mapper.createMachineTemplate(new authentificationService.User(identity).getUserID(), machineTemplate);
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(machineTemplate);
            return jsonString;
        } catch (Exception e) {

            return "erreur:\n" + e.getMessage();
        }
    }

    @POST
    @Path("testPostPara")
    public Response postMessagePara(String val) {

        testClass responseDTO = new testClass();
        responseDTO.message = "Message.exe ";
        return Response.ok(responseDTO).build();
        //return responseDTO;
    }
}

