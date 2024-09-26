package ca.usherbrooke.fgen.api.service;

import ca.usherbrooke.fgen.api.business.Usager;
import ca.usherbrooke.fgen.api.mapper.UsagerMapper;
import org.apache.ibatis.annotations.Param;
import org.jsoup.parser.Parser;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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


    @GET
    @Path("getallusagers")
    public List<String> getAllUsagers(
    ) {
        List<String> Usagers = UsagerMapper.allUsagers();
        System.out.println(Usagers);
        return Usagers;
    }

    @GET
    @Path("getusager/{usager_id}")
    public Usager getUsager(
            @PathParam("usager_id") Integer usager_id
    ) {
        Usager Usager = UsagerMapper.selectOne(usager_id);
        return unescapeEntities(Usager);
    }

    @DELETE
    @Path("deleteUsager/{id}")
    public void deleteUsager(
            @PathParam("id") Integer id
    ) {
        UsagerMapper.deleteOne(id);
        return;
    }


    @PUT
    @Path("putusager")
    //@RolesAllowed({Roles.TEACHER})
    public void insertUsager(Usager Usager) {
        UsagerMapper.insertUsager(Usager);
    }

    @GET
    @Path("getnewid")
    //@RolesAllowed({Roles.TEACHER})
    public Integer getnewid() {
        Integer id = UsagerMapper.getNewId();
        return id;
    }

    public static Usager unescapeEntities(Usager Usager) {
        //zUsager.description = Parser.unescapeEntities(Usager.description, true);
        return Usager;
    }

    public List<Usager> unescapeEntities(List<Usager> Usagers) {
        return Usagers
                .stream()
                .map(UsagerService::unescapeEntities)
                .collect(Collectors.toList());
    }
}
