package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.product_template_page;
import ca.usherbrooke.fgen.api.mapper.product_template_page_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_template_page_Service {

    @Inject
    product_template_page_Mapper Mapper;

    @GET
    @Path("ProductTemplate/Get/Full/{id_usager}")
    public List<product_template_page> getCompactProductTemplate(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getCompactProductTemplate(id_usager);
    }
}
