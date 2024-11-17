package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.product_template;
import ca.usherbrooke.fgen.api.business.product_template_page;
import ca.usherbrooke.fgen.api.mapper.product_template_page_Mapper;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_template_Service {

    @Inject
    product_template_page_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @GET
    @Path("ProductTemplate/Get/Full")
    public product_template getCompactProductTemplate(Integer ID)
    {
        return Mapper.getProductTemplate(ID);
    }

    @GET
    @Path("ProductTemplate/Get/Image")
    public String getProductImage(String id_machine)
    {
        return Mapper.getProductTemplateImage(id_machine);
    }


    @POST
    @Path("ProductTemplate/Get/Surface")
    public List<Integer> getCompactProductSurface()
    {
        List<Integer> listInt = new ArrayList<>();

        return listInt;
    }

    @GET
    @Path("ProductTemplate/Get/AllID")
    public List<String> getCompactProductAllID()
    {
        List<String> listInt = new ArrayList<>();

        return listInt;
    }

    @POST
    @Path("ProductTemplate/New")
    public product_template_page setCompactProduct()
    {
        product_template_page product = new product_template_page();
        return product;
    }

    @POST
    @Path("ProductTemplate/Modify")
    public product_template_page modifyCompactProduct()
    {
        product_template_page product = new product_template_page();
        return product;
    }

    @POST
    @Path("ProductTemplate/Delete")
    public product_template_page deleteCompactProduct()
    {
        product_template_page product = new product_template_page();
        return product;
    }
}
