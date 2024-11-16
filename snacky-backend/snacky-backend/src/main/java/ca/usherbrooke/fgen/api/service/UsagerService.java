package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.Usager;
import ca.usherbrooke.fgen.api.mapper.Usager_Mapper;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsagerService {


    @Inject
    Usager_Mapper UsagerMapper;


/*    @GET
    @Path("getUsagers/{trimester}/{profile}/{unit}")

    public List<Usager> getUsagers(
            @PathParam("trimester") String trimesterId,
            @PathParam("profile") String profileId,
            @PathParam("unit") String unit
    ) {
        List<Usager> Usagers = UsagerMapper.select(trimesterId, profileId, unit, null);
        return unescapeEntities(Usagers);
    }*/

    //This is modified for Shawn, it will be empty
    @GET
    @Path("getallusagers")
    public List<Usager> getAllUsagers() {
        List<Usager> Usagers = UsagerMapper.allUsagers();
        //List<Usager> Usagers = new ArrayList<>();
        //System.out.println("users: " + Usagers);
        //List<Usager> Usagers = new ArrayList<>();
        return Usagers;
    }

    @GET
    @Path("getPrenom")
    public List<String> nomUsagers()
    {
        List<String> prenoms = UsagerMapper.nomUsagers();
        return prenoms;
    }

    @GET
    @Path("getusager/{usager_id}")
    public Usager getUsager(@PathParam("usager_id") Integer usager_id) {
        Usager Usager = UsagerMapper.selectOne(usager_id);
        return Usager;
    }

    @DELETE
    @Path("deleteUsager/{id}")
    public void deleteUsager(@PathParam("id") Integer id) {
        UsagerMapper.deleteOne(id);
        return;
    }

    @GET
    @Path("insertUsager")
    public int insertUsager() {
        System.out.println("add: ");
        Usager usagerNew = new Usager();
        usagerNew.id_usager = "larv1803";
        usagerNew.nom_usager = "Charlestouille";
        usagerNew.prenom_usager = "chien";
        usagerNew.solde_usager = 42;
        UsagerMapper.insertUsager(usagerNew);
        return 0;
    }

    @GET
    @Path("getnewids")
    //@RolesAllowed({Roles.TEACHER})
    public Integer getnewid() {
        Integer id = UsagerMapper.getNewId();
        return id;
    }



}
