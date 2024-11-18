package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
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
    public String getCompactProductTemplate(Integer ID) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        information info = new information();
        info.id_produit_template = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductTemplate/Get/Full:");
        System.out.println(objectMapper.writeValueAsString(info));
        product_template prodTemp = Mapper.getProductTemplate(info);

        String returnString = objectMapper.writeValueAsString(prodTemp);

        System.out.println("ProductTemplate/Get/Full\nData received from DB:");
        System.out.println(returnString);

        return returnString;
    }

    @POST
    @Path("ProductTemplate/Get/Image")
    public String getProductImage(Integer ID) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        information info = new information();
        productImage ima = new productImage();
        info.id_produit_template = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductTemplate/Get/Image:");
        System.out.println(objectMapper.writeValueAsString(info));
        ima.image = Mapper.getProductTemplateImage(info);

        String jsonString = objectMapper.writeValueAsString(ima.image);

        System.out.println("ProductTemplate/Get/Full\nData received from DB:");
        System.out.println(jsonString);

        return ima.image;
    }


    @POST
    @Path("ProductTemplate/Get/Surface")
    public String getProductSurface(Integer ID) throws Exception {
        try
        {
            information info = new information();
            info.id_produit_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: ProductTemplate/Get/Surface");
            System.out.println(objectMapper.writeValueAsString(info));

            product_template_surface productTemplateSurface = Mapper.getProductSurfaceTemplate(info);
            String returnString = objectMapper.writeValueAsString(productTemplateSurface);

            System.out.println("Data from DB: ProductTemplate/Get/Surface:");
            System.out.println(returnString);
            return returnString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @GET
    @Path("ProductTemplate/Get/AllID")
    public List<Integer> getCompactProductAllID()
    {
        List<Integer> listInt = Mapper.getProductTemplatesAllID(new authentificationService.User(identity).getUserID());
        return listInt;
    }

    @POST
    @Path("ProductTemplate/New")
    public void createProductTemplate(String jsonString) throws Exception
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            product_template newProductTemplate = objectMapper.readValue(jsonString, product_template.class);
            newProductTemplate.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: ProductTemplate/New");
            System.out.println(objectMapper.writeValueAsString(newProductTemplate));

            Mapper.createProductTemplate(newProductTemplate);
        } catch (Exception e) {
            throw new Exception("This is a general exception\n: ProductTemplate/New:\n" + e.getMessage());
        }
    }

//    @POST
//    @Path("ProductTemplate/Modify")
//    public product_template_page modifyCompactProduct()
//    {
//        product_template_page product = new product_template_page();
//        return product;
//    }

    @POST
    @Path("ProductTemplate/Delete")
    public void deleteCompactProduct(Integer ID) throws Exception
    {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();

            information info = new information();
            info.id_produit_template = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: ProductTemplate/Delete");
            System.out.println(objectMapper.writeValueAsString(info));

            Mapper.deleteProductTemplate(info);
            System.out.println("Finished deleting: " + ID);
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception");
        }
    }
}
