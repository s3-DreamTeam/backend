package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.product_inventory_specific;
import ca.usherbrooke.fgen.api.mapper.product_inventory_specific_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_inventory_specific_Service {

    @Inject
    product_inventory_specific_Mapper Mapper;

    @GET
    @Path("getAllProduct/{id_usager}")
    public List<product_inventory_specific> getAllProduct(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getAllProduct(id_usager);
    }
}
