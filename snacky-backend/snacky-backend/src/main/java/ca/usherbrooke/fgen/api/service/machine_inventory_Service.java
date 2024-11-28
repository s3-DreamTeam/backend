package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.*;
import ca.usherbrooke.fgen.api.exceptions.MyCustomException;
import ca.usherbrooke.fgen.api.mapper.inventory_slot_Mapper;
import ca.usherbrooke.fgen.api.mapper.machine_inventory_Mapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.security.identity.SecurityIdentity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static ca.usherbrooke.fgen.api.exceptions.StringExceptions.isStringGood;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class machine_inventory_Service {

    @Inject
    machine_inventory_Mapper machine_inventory_specificMapper;

    @Inject
    inventory_slot_Mapper MapperInventorySlot;

    @Inject
    SecurityIdentity identity;

    @POST
    @Path("MachineInventory/Get/Full")
    public String getMachinesSpecifics(Integer ID) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        information info = new information();
        info.id_machine = ID;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Full");
        System.out.println(objectMapper.writeValueAsString(info));
        machine mach = machine_inventory_specificMapper.getMachine(info);
        mach.id_machine = ID;
        String jsonString = objectMapper.writeValueAsString(mach);

        System.out.println("MachineInventory/Get/Full\nData received from DB:");
        System.out.println(jsonString);
        return jsonString;
    }

    @POST
    @Path("MachineInventory/Get/Image")
    public String getMachinesImage(Integer ID) throws Exception {
        System.out.println("MachineInventory/Get/Image\nRaw data received (ID):");
        System.out.println(ID);

        MachineTemplateImage ima = new MachineTemplateImage();

        try
        {
            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Image");
            System.out.println(objectMapper.writeValueAsString(info));

            ima.image = machine_inventory_specificMapper.getMachinesImage(info);


            String jsonString = objectMapper.writeValueAsString(ima);

            System.out.println("MachineInventory/Get/Image\nData received from DB:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @POST
    @Path("MachineInventory/Get/Surface")
    public String getMachinesSurface(Integer ID) throws Exception {
        try
        {
            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("This is what i am sending to Clovis: MachineInventory/Get/Surface");
            System.out.println(objectMapper.writeValueAsString(info));

            machine_inventory_surface variable = machine_inventory_specificMapper.getMachinesSurface(info);
            String jsonString = objectMapper.writeValueAsString(variable);

            System.out.println("Data from DB: MachineInventory/Get/Surface:");
            System.out.println(jsonString);
            return jsonString;

        } catch (Exception e) {
            System.out.println("failed to get or convert data from DB:");
            throw new Exception("This is a general exception");
        }
    }

    @GET
    @Path("MachineInventory/Get/AllID")
    public List<Integer> getAllMachinesID()
    {
        List<Integer> listInt = machine_inventory_specificMapper.getAllMachinesID(new authentificationService.User(identity).getUserID());
        return listInt;
    }

    @POST
    @Path("MachineInventory/New")
    public void newMachineSpecifics(String jsonString) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            machine newMachine = objectMapper.readValue(jsonString, machine.class);
            System.out.println("checking strings");
            CheckAllMachinesString(newMachine);

            newMachine.id_usager = new authentificationService.User(identity).getUserID();

            System.out.println("This is what i am sending to Clovis: MachineInventory/New");
            System.out.println(objectMapper.writeValueAsString(newMachine));

            machine_inventory_specificMapper.newMachineInventaire(newMachine);
            Integer id_machine = machine_inventory_specificMapper.getLastID(newMachine);

            System.out.println("New machine has been created: " +id_machine);
            createSlots(newMachine, id_machine);

        } catch (Exception e) {
            //throw new MyCustomException("This is a special exception", 572);
            System.out.println("failed to create new machine: " +e.getMessage());
            throw e;
        }
    }

    @POST
    @Path("MachineInventory/Delete")
    public void deleteMachineSpecifics(Integer ID) throws Exception {
        try
        {
            ObjectMapper objectMapper = new ObjectMapper();

            information info = new information();
            info.id_machine = ID;
            info.id_usager = new authentificationService.User(identity).getUserID();

            List<inventorySlot> inventSlot = MapperInventorySlot.getAllSlots(info);
            System.out.println("Slots to delete: " + inventSlot.size());
            for (inventorySlot slot: inventSlot) {
                Integer currentQuantity = MapperInventorySlot.getQuantity(info);
                info.id_machine = slot.id_machine;
                info.slot = slot.slot_inventaire;
                info.quantite = slot.quantite_inventaire;

                System.out.println("Information a delete");
                System.out.println(objectMapper.writeValueAsString(info));

                if(slot.quantite_inventaire <=0)
                    continue;


                MapperInventorySlot.resetSlot(info);//remove fom slot and add to warehouse
            }

            machine_inventory_specificMapper.deleteMachineInventaire(info);
            System.out.println("Finished deleting: " + ID);
        }
        catch (Exception e)
        {
            System.out.println("failed to delete:");
            throw new Exception("This is a general exception: " + e.getMessage());
        }
    }

    private void createSlots(machine newMachine, Integer id_machine) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Creating Slots");
        information info = new information();
        info.id_machine = id_machine;
        info.id_usager = new authentificationService.User(identity).getUserID();

        System.out.println("Slots sending to clovis: \n"+objectMapper.writeValueAsString(info));
        row_column r_c = machine_inventory_specificMapper.getRowColumn(info);

        for (Integer row = 1; row <= r_c.row_type_m; row++) {
            for (Integer column = 1; column <= r_c.column_type_m; column++) {
                info.slot = getSlot(row, column);
                System.out.println("Slot: " + objectMapper.writeValueAsString(info));
                machine_inventory_specificMapper.createSlot(info);
            }
        }
    }

    public static String getSlot(Integer row, Integer column) {
        if (row < 1 || column < 1) {
            throw new IllegalArgumentException("Row and column must be greater than or equal to 1");
        }

        // Convert the row number to a letter (e.g., 1 -> A, 27 -> AA)
        String rowLabel = getRowLabel(row);

        return rowLabel + column;
    }

    private static String getRowLabel(Integer row) {
        StringBuilder label = new StringBuilder();

        while (row > 0) {
            row--; // Adjust for 0-based indexing
            label.insert(0, (char) ('A' + (row % 26)));
            row /= 26;
        }

        return label.toString();
    }

    private static void CheckAllMachinesString(machine newMachine) {
        if (newMachine.image_machine != null && !isStringGood(newMachine.image_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.nom_machine != null && !isStringGood(newMachine.nom_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.emplacement_machine != null && !isStringGood(newMachine.emplacement_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.no_serie != null && !isStringGood(newMachine.no_serie))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.networkSSID_machine != null && !isStringGood(newMachine.networkSSID_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.networkPassword_machine != null && !isStringGood(newMachine.networkPassword_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.bluetoothSSID_machine != null && !isStringGood(newMachine.bluetoothSSID_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.bluetoothPassword_machine != null && !isStringGood(newMachine.bluetoothPassword_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.physicalConnector_machine != null && !isStringGood(newMachine.physicalConnector_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.onlineStoreUrl_machine != null && !isStringGood(newMachine.onlineStoreUrl_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.debitProviders_machine != null && !isStringGood(newMachine.debitProviders_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.creditProviders_machine != null && !isStringGood(newMachine.creditProviders_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
        if (newMachine.acceptedCurrencies_machine != null && !isStringGood(newMachine.acceptedCurrencies_machine))
            throw new MyCustomException("; What you trying to do, inject SQL?", 572);
    }

}
