package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.Usager;
import ca.usherbrooke.fgen.api.mapper.UsagerMapper;
import org.apache.ibatis.annotations.Param;
import org.jsoup.parser.Parser;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsagerService {


    @Inject
    UsagerMapper UsagerMapper;


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

    @PUT
    @Path("putusager")
    public void insertUsager() {
        System.out.println("add: ");
        Usager lol = new Usager();
        UsagerMapper.insertUsager(lol);
    }

    @GET
    @Path("getnewid")
    //@RolesAllowed({Roles.TEACHER})
    public Integer getnewid() {
        Integer id = UsagerMapper.getNewId();
        return id;
    }




}
