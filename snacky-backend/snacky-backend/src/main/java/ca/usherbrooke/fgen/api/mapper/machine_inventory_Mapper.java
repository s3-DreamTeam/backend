package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_inventory_surface;
import ca.usherbrooke.fgen.api.business.machine_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_inventory_Mapper {
    machine getMachine(@Param("info") information info); //done
    String getMachinesImage(@Param("info") information info); //done
    machine_inventory_surface getMachinesSurface(@Param("info") information info); //done
    List<Integer> getAllMachinesID(@Param("id_usager") String id_usager); //done
    void newMachineSpecifics(@Param("newMachine") machine newMachine); //done
    void deleteMachineSpecifics(@Param("info") information info); //done
}