package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.product_inventory_page;
import ca.usherbrooke.fgen.api.mapper.product_inventory_page_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_inventory_page_Service {

    @Inject
    product_inventory_page_Mapper Mapper;

    @GET
    @Path("getAllCompactProduct/{id_usager}")
    public List<product_inventory_page> getAllCompactProduct(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getAllCompactProduct(id_usager);
    }
}
