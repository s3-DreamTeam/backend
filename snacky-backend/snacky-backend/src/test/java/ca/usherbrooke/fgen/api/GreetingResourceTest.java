//package ca.usherbrooke.fgen.api;
//
//
//import ca.usherbrooke.fgen.api.business.machine_template;
//import ca.usherbrooke.fgen.api.business.testClass;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.quarkus.test.junit.QuarkusTest;
//import org.junit.jupiter.api.Test;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.UUID;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.CoreMatchers.is;
//
//@QuarkusTest
//public class GreetingResourceTest {
//
//    //    @Test
////    public void testGetMessagePara() {
////        given()
////                .when().get("/api/test")
////                .then()
////                .statusCode(200)
////                .body(is("hello"));
////    }
//    @Test
//    public void testGetMessagePara() {
//        // Création d'un objet machine_template avec des valeurs
//        machine_template machineTemplate = new machine_template();
//        machineTemplate.machineImage_produit = "image.jpg";
//        machineTemplate.manufacturer_produit = "Acme Corp";
//        machineTemplate.model_produit = "Model X";
//        machineTemplate.climate_produit = "Tropical";
//        machineTemplate.hasSerialNumbers_produit = true;
//        machineTemplate.colorVaries_produit = false;
//        machineTemplate.seeThroughWindow_produit = true;
//        machineTemplate.hasInternetConnection_produit = true;
//        machineTemplate.hasBluetooth_produit = false;
//        machineTemplate.hasPhysicalConnection_produit = true;
//        machineTemplate.onlineStore_produit = true;
//        machineTemplate.debitCards_produit = true;
//        machineTemplate.creditCards_produit = false;
//        machineTemplate.cash_produit = true;
//
//        // Conversion de l'objet machine_template en JSON
//        String requestBody;
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            requestBody = objectMapper.writeValueAsString(machineTemplate);
//        } catch (Exception e) {
//            throw new RuntimeException("Erreur lors de la conversion en JSON", e);
//        }
//
//        // Envoi de la requête POST et validation de la réponse
//        given()
//                .contentType(MediaType.APPLICATION_JSON) // Spécifie que le corps est en JSON
//                .body(requestBody) // Ajoute l'objet JSON au corps de la requête
//                .when()
//                .post("/api/test") // Utilise POST pour appeler le endpoint
//                .then()
//                .statusCode(200) // Vérifie que le code de retour est 200
//                .body(is(requestBody)); // Vérifie que la réponse JSON correspond à la requête JSON
//    }
//}
//
//
////package ca.usherbrooke.fgen.api.service;
////
////import ca.usherbrooke.fgen.api.business.machine_template;
////import ca.usherbrooke.fgen.api.business.testClass;
////import com.fasterxml.jackson.databind.ObjectMapper;
////
////import javax.inject.Inject;
////import javax.ws.rs.*;
////        import javax.ws.rs.core.MediaType;
////import javax.ws.rs.core.Response;
////import java.util.List;
////
////@Path("/api")
////@Produces(MediaType.APPLICATION_JSON)
////@Consumes(MediaType.APPLICATION_JSON)
////public class test {
////
////    @GET
////    @Path("testGet")
////    public String getMessage() {
////
//////        testClass responseDTO = new testClass();
//////        responseDTO.message = "Message.exe ";
//////        return Response.ok(responseDTO).build();
////        return "Ta mere";
////    }
////
////    @POST
////    @Path("testPost")
////    public Response postMessage() {
////
////        testClass responseDTO = new testClass();
////        responseDTO.message = "Message.exe ";
////        return Response.ok(responseDTO).build();
////        //return responseDTO;
////    }
////
////    @POST
////    @Path("test")
////    public String getMessagePara(machine_template machineTemplate) {
////
////        //return jsonString;
//////        testClass responseDTO = new testClass();
//////        responseDTO.message = "Message.exe ";
//////        return Response.ok(responseDTO).build();
////        //ObjectMapper objectMapper = new ObjectMapper();
////
////        try {
////            //machine_template machineTemplate = objectMapper.readValue(jsonString, machine_template.class);
////            //Mapper.createMachineTemplate(new authentificationService.User(identity).getUserID(), machineTemplate);
////            ObjectMapper objectMapper = new ObjectMapper();
////            String jsonString = objectMapper.writeValueAsString(machineTemplate);
////            return jsonString;
////        } catch (Exception e) {
////
////            return "erreur:\n" + e.getMessage();
////        }
////    }
////
////    @POST
////    @Path("testPostPara")
////    public Response postMessagePara(String val) {
////
////        testClass responseDTO = new testClass();
////        responseDTO.message = "Message.exe ";
////        return Response.ok(responseDTO).build();
////        //return responseDTO;
////    }
////}
//
