package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_inventory_surface;
import ca.usherbrooke.fgen.api.business.machine_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_inventory_Mapper {
    machine getMachine(@Param("id_usager") String id_usager); //done
    String getMachinesImage(@Param("id_machine") Integer id_machine); //
    machine_inventory_surface getMachinesSurface(@Param("id_machine") Integer id_machine);
    List<Integer> getAllMachinesID(@Param("id_usager") String id_usager);
    void newMachineSpecifics(@Param("newMachine") machine newMachine);
    void deleteMachineSpecifics(@Param("id_machine") Integer id_machine);
}