package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.product_inventory_specific;
import ca.usherbrooke.fgen.api.business.product_template_page;
import ca.usherbrooke.fgen.api.mapper.product_inventory_specific_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class product_inventory_Service {

    @Inject
    product_inventory_specific_Mapper Mapper;

    @GET
    @Path("getAllProduct/{id_usager}")
    public List<product_inventory_specific> getAllProduct(@PathParam("id_usager") Integer id_usager)
    {
        return Mapper.getAllProduct(id_usager);
    }

//    @GET
//    @Path("ProductInventory/Get/Image")
//    public List<product_template_page> getCompactProductImage(@PathParam("id_usager") Integer id_usager)
//    {
//        return Mapper.getCompactProductTemplate(id_usager);
//    }
//
//    @GET
//    @Path("ProductInventory/Get/Surface")
//    public List<Integer> getCompactProductSurface(@PathParam("id_usager") Integer id_usager)
//    {
//        List<Integer> listInt = new ArrayList<>();
//
//        return listInt;
//    }
//
//    @GET
//    @Path("ProductInventory/Get/AllID")
//    public List<String> getCompactProductAllID()
//    {
//        List<String> listInt = new ArrayList<>();
//
//        return listInt;
//    }
//
//    @GET
//    @Path("ProductInventory/New")
//    public product_template_page setCompactProduct(@PathParam("id_usager") Integer id_usager)
//    {
//        product_template_page product = new product_template_page();
//        return product;
//    }
//
//    @GET
//    @Path("ProductInventory/Modify")
//    public product_template_page modifyCompactProduct(@PathParam("id_usager") Integer id_usager)
//    {
//        product_template_page product = new product_template_page();
//        return product;
//    }
//
//    @GET
//    @Path("ProductInventory/Delete")
//    public product_template_page deleteCompactProduct(@PathParam("id_usager") Integer id_usager)
//    {
//        product_template_page product = new product_template_page();
//        return product;
//    }
}
