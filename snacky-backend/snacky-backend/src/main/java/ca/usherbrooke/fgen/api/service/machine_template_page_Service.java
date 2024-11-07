package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template_page;
import ca.usherbrooke.fgen.api.mapper.machine_template_page_Mapper;
import ca.usherbrooke.fgen.api.service.authentificationService;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
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
    @Path("MachineTemplate/Get/Full/{id_usager}")
    public List<machine_template_page> getMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getCompactTemplateMachine(id_usager);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    //tout est a modifier, c fait pour shawn qu'il a pas l'erreur 404

    //
    @GET
    @Path("MachineTemplate/Get/Image/{id_usager}")
    public List<machine_template_page> getMachinesSpecificsImage(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getCompactTemplateMachine(id_usager);
    }


    @GET
    @Path("MachineTemplate/Get/Surface/{id_usager}")
    public List<Integer> getMachinesSpecificsSurface(@PathParam("id_usager") Integer id_usager)
    {
        List<Integer> listInt = new ArrayList<>();


        return listInt;
    }

    @GET
    @Path("MachineTemplate/Get/AllID")
    public List<Integer> getMachinesSpecificsAllID()
    {
        //List<Integer> listInt = new ArrayList<>();
        return Mapper.getMachinesSpecificsAllID(new authentificationService.User(identity).getUserID());

        //return listInt;
    }

    @GET
    @Path("MachineTemplate/New/{id_usager}")
    public machine_template_page setMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page();
        return machine;
    }

    @GET
    @Path("MachineTemplate/Modify/{id_usager}")
    public machine_template_page modifyMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page();
        return machine;
    }

    @GET
    @Path("MachineTemplate/Delete/{id_usager}")
    public machine_template_page deleteMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page();
        return machine;
    }
}
