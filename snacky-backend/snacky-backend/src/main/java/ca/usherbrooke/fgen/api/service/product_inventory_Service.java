package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
import ca.usherbrooke.fgen.api.mapper.entrepot_manage_Mapper;
import ca.usherbrooke.fgen.api.mapper.inventory_slot_Mapper;
import ca.usherbrooke.fgen.api.mapper.product_inventory_Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_inventory_Service {

    @Inject
    product_inventory_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @Inject
    entrepot_manage_Mapper MapperEntrepotManage;

    @Inject
    inventory_slot_Mapper MapperInventorySlot;

    @POST
    @Path("ProductInventory/Get/Full")
    public String getCompactProductTemplate(Integer ID) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        information info = new information();
        info.id_produit = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductInventory/Get/Full:");
        System.out.println(objectMapper.writeValueAsString(info));
        product productInventory = Mapper.getProductInventory(info);

        String returnString = objectMapper.writeValueAsString(productInventory);

        System.out.println("ProductInventory/Get/Full\nData received from DB:");
        System.out.println(returnString);

        return returnString;
    }

    @POST
    @Path("ProductInventory/Get/Image")
    public String getProductImage(Integer ID) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        productImage ima = new productImage();
        information info = new information();
        info.id_produit = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductInventory/Get/Image:");
        System.out.println(objectMapper.writeValueAsString(info));
        ima.image = Mapper.getProductImage(info);

        String jsonString = objectMapper.writeValueAsString(ima);

        System.out.println("ProductInventory/Get/Full\nData received from DB:");
        System.out.println(jsonString);

        return jsonString;
    }


    @POST
    @Path("ProductInventory/Get/Surface")
    public String getProductSurface(Integer ID) throws Exception {
        try
        {
            information info = new information();
            info.id_produit = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: ProductInventory/Get/Surface");
            System.out.println(objectMapper.writeValueAsString(info));

            product_inventory_surface productTemplateSurface = Mapper.getProductSurface(info);
            String returnString = objectMapper.writeValueAsString(productTemplateSurface);

            System.out.println("Data from DB: ProductInventory/Get/Surface:");
            System.out.println(returnString);
            return returnString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @GET
    @Path("ProductInventory/Get/AllID")
    public List<Integer> getCompactProductAllID()
    {
        List<Integer> listInt = Mapper.getProductAllID(new authentificationService.User(identity).getUserID());
        return listInt;
    }

    @POST
    @Path("ProductInventory/New")
    public void createProductTemplate(String jsonString) throws Exception
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            product newProduct = objectMapper.readValue(jsonString, product.class);
            newProduct.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: ProductInventory/New");
            System.out.println(objectMapper.writeValueAsString(newProduct));

            Mapper.createProduct(newProduct);
        } catch (Exception e) {
            throw new Exception("This is a general exception: ProductInventory/New:\n" + e.getMessage());
        }
    }

    @POST
    @Path("ProductInventory/Delete")
    public void deleteCompactProduct(Integer ID) throws Exception
    {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();

            information info = new information();
            info.id_produit = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: ProductInventory/Delete");
            System.out.println(objectMapper.writeValueAsString(info));

            if(!MapperInventorySlot.isProductUsed(info) && !MapperEntrepotManage.isProductUsed(info))
            {
                Mapper.deleteProduct(info);
                System.out.println("Finished deleting: " + ID);
            }
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception " + e.getMessage());
        }
    }
}
