package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.business.machine_template_page;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_specific_Mapper;
import ca.usherbrooke.fgen.api.business.machine_surface;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_inventory_specific_Service {

    @Inject
    machine_inventory_specific_Mapper machine_inventory_specificMapper;

    @GET
    @Path("MachineInventory/Get/Full/{id_usager}")
    public List<machine_inventory_specific> getMachinesSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        return machine_inventory_specificMapper.getAllMachine(id_usager);
    }

    @GET
    @Path("MachineInventory/Get/Image/{id_usager}")
    public String getMachinesImage(@PathParam("id_usager") Integer id_usager)
    {
        //return machine_inventory_specificMapper.getMachinesImage(id_usager);
        return "";
    }

    @GET
    @Path("MachineInventory/Get/Surface/{id_usager}")
    public machine_surface getMachinesSurface(@PathParam("id_usager") Integer id_usager)
    {
        //return machine_inventory_specificMapper.getMachinesSurface(id_usager);
        return null;
    }

    @GET
    @Path("MachineInventory/Get/AllID/{id_usager}")
    public List<Integer> getAllMachinesID(@PathParam("id_usager") Integer id_usager)
    {
        //List<Integer> listInt = machine_inventory_specificMapper.getAllMachinesID(id_usager);
        List<Integer> listInt = new ArrayList<Integer>();
        return listInt;
    }

    @GET
    @Path("MachineInventory/New/{id_usager}")
    public void newMachineSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        //machine_inventory_specificMapper.newMachineSpecifics(id_usager, machine);
    }

    @GET
    @Path("MachineInventory/Delete/{id_usager},{machine}")
    public boolean deleteMachineSpecifics(@PathParam("id_usager") Integer id_usager)
    {
        //return machine_inventory_specificMapper.deleteMachineSpecifics(id_usager, machine.id_machine);
        return false;
    }
}
