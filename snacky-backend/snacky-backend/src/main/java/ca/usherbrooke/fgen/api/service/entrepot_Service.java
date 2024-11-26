package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.entrepot_ajout;
import ca.usherbrooke.fgen.api.business.entrepot_perdu;
import ca.usherbrooke.fgen.api.mapper.entrepot_manage_Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class entrepot_Service {

    @Inject
    entrepot_manage_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("ProductInventory/Manage/Add")
    public void reset(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        entrepot_ajout newProduct = objectMapper.readValue(jsonString, entrepot_ajout.class);
        newProduct.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductInventory/Manage/Add");
        System.out.println(objectMapper.writeValueAsString(newProduct));

        Mapper.ajoutProduitInventaire(newProduct);
    }

    @POST
    @Path("ProductInventory/Manage/Loss")
    public void setProduct(String jsonString) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        entrepot_perdu lostProduct = objectMapper.readValue(jsonString, entrepot_perdu.class);
        lostProduct.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: ProductInventory/Manage/Loss");
        System.out.println(objectMapper.writeValueAsString(lostProduct));

        Integer productQuantity = Mapper.getQuantityWarehouseProduct(lostProduct);

        if(productQuantity >= lostProduct.lostQuantity_product)
        {
            Mapper.perduProduitInventaire(lostProduct);
        }
    }
}
