package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.testClass;

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

    @GET
    @Path("testGetPara")
    public String getMessagePara(String val) {

//        testClass responseDTO = new testClass();
//        responseDTO.message = "Message.exe ";
//        return Response.ok(responseDTO).build();
        return "Ta mere" + val;
    }

    @POST
    @Path("test")
    public Response postMessagePara(String val) {

        testClass responseDTO = new testClass();
        responseDTO.message = "Message.exe ";
        return Response.ok(responseDTO).build();
        //return responseDTO;
    }
}

