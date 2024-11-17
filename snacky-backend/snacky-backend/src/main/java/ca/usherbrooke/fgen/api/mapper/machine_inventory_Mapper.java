package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_inventory_Mapper {
    List<machine> getAllMachine(@Param("id_usager") String id_usager); //done
    String getMachinesImage(@Param("id_machine") String id_machine); //
    machine_surface getMachinesSurface(@Param("id_machine") Integer id_machine);
    List<Integer> getAllMachinesID(@Param("id_usager") String id_usager);
    void newMachineSpecifics(@Param("id_usager") String id_usager, @Param("newMachine") machine newMachine);
    void deleteMachineSpecifics(@Param("id_machine") Integer id_machine);
}