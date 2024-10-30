package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_template_page;
import ca.usherbrooke.fgen.api.mapper.machine_template_page_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_template_page_Service {

    @Inject
    machine_template_page_Mapper Mapper;

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
    public List<int> getMachinesSpecificsSurface(@PathParam("id_usager") Integer id_usager)
    {
        List<int> listInt = new ArrayList<>();

        return listInt;
    }

    @GET
    @Path("MachineTemplate/Get/AllID/{id_usager}")
    public List<String> getMachinesSpecificsAllID()
    {
        List<String> listInt = new ArrayList<>();

        return listInt;
    }

    @GET
    @Path("MachineTemplate/New/{id_usager}")
    public machine_template_page setMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page_Service();
        return machine;
    }

    @GET
    @Path("MachineTemplate/Modify/{id_usager}")
    public machine_template_page modifyMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page_Service();
        return machine;
    }

    @GET
    @Path("MachineTemplate/Delete/{id_usager}")
    public machine_template_page deleteMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        machine_template_page machine = new machine_template_page_Service();
        return machine;
    }
}
