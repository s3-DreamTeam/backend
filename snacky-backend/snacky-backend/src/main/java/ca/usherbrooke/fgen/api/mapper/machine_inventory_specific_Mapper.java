package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_inventory_page;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.ws.rs.PathParam;
import java.util.Base64;
import java.util.List;

@Mapper
public interface machine_inventory_specific_Mapper {
    List<machine> getAllMachine(@Param("id_usager") String id_usager);
    String getMachinesImage(@Param("id_usager") String id_usager, @Param("id_machine") String id_machine);
    machine_surface getMachinesSurface(@Param("id_usager") String id_usager);
    List<Integer> getAllMachinesID(@Param("id_usager") String id_usager);
    void newMachineSpecifics(@Param("id_usager") String id_usager, @Param("newMachine") machine newMachine);
    boolean deleteMachineSpecifics(@Param("id_usager") String id_usager);
}
