package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.product_template;
import ca.usherbrooke.fgen.api.business.product_template_page;
import ca.usherbrooke.fgen.api.mapper.product_template_Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    product_template_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("ProductTemplate/Get/Full")
    public product_template getCompactProductTemplate(Integer ID) throws JsonProcessingException
    {
//        ObjectMapper objectMapper = new ObjectMapper();
//        information info = new information();
//        info.id_machine = ID;
//        info.id_usager = new authentificationService.User(identity).getUserID();
//
//        System.out.println("This is what i am sending to Clovis");
//        System.out.println(objectMapper.writeValueAsString(info));
//        product_template mach = Mapper.getTemplateProduct(info);
//
//        String jsonString = objectMapper.writeValueAsString(mach);
//
//        System.out.println("MachineInventory/Get/Full\nData received from DB:");
//        System.out.println(jsonString);

        return Mapper.getProductTemplate(ID);
    }

    @GET
    @Path("ProductTemplate/Get/Image")
    public String getProductImage(Integer ID) throws JsonProcessingException {

        return Mapper.getProductTemplateImage(ID);
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
