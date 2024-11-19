package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.inventorySlot;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.mapper.inventory_slot_Mapper;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_Mapper;
import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class inventory_slot_Service {

    @Inject
    inventory_slot_Mapper Mapper;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("MachineInventory/Manage/Reset")
    public void reset(inventorySlot slot) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        information info = new information();
        info.id_machine = slot.ID;
        info.slot = slot.slot_inventaire;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Manage/Reset");
        System.out.println(objectMapper.writeValueAsString(info));

        Mapper.resetSlot(info);

        System.out.println("MachineInventory/Manage/Reset\nData received from DB:");
//        System.out.println(jsonString);
    }

    @POST
    @Path("MachineInventory/Manage/Set")
    public void setProduct(inventorySlot slot) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        information info = new information();
        info.id_machine = slot.id_produit;
        info.slot = slot.slot_inventaire;
        info.id_produit = slot.id_produit;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Manage/Set");
        System.out.println(objectMapper.writeValueAsString(info));

        Mapper.setSlot(info);

        System.out.println("MachineInventory/Manage/Set\nData received from DB:");
//        System.out.println(jsonString);
    }

    @POST
    @Path("MachineInventory/Manage/Add")
    public void addQuantity(inventorySlot slot) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        information info = new information();
        info.slot = slot.slot_inventaire;
        info.quantite = slot.quantite_produit;
        info.prix = info.prix;
        info.id_machine = slot.ID;
        info.id_produit = slot.id_produit;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Manage/Add");
        System.out.println(objectMapper.writeValueAsString(info));

        Mapper.addProductToSlot(info);
    }

    @POST
    @Path("MachineInventory/Manage/Remove")
    public void removeQuantity(inventorySlot slot) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        information info = new information();
        info.id_machine = slot.ID;
        info.slot = slot.slot_inventaire;
        info.quantite = slot.quantite_produit;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Manage/Remove");
        System.out.println(objectMapper.writeValueAsString(info));

        Mapper.removeProductFromSlot(info);

//        System.out.println(jsonString);
    }

    @POST
    @Path("MachineInventory/Manage/Get")
    public List<inventorySlot> addQuantity(Integer ID) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        information info = new information();
        info.id_machine = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Manage/Get");
        System.out.println(objectMapper.writeValueAsString(info));

        List<inventorySlot> inventSlot = Mapper.getAllSlots(info);
        System.out.println("MachineInventory/Manage/Get\nData received from DB:");
//        System.out.println(jsonString);
        return inventSlot;
    }

}
