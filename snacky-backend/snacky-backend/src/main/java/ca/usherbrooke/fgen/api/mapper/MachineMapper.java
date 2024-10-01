package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.Machine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MachineMapper {

    Machine selectOne(@Param("Machine_id") Integer id);
    void deleteOne(@Param("Machine_id") Integer id);
    List<Machine> allMachines();
    void insertMachine(@Param("Machine") Machine Machine);
    Integer getNewId();
}
