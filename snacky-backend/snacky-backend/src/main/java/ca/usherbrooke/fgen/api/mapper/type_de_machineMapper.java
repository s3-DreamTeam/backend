package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.type_de_machine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface type_de_machineMapper {

    type_de_machine selectOne(@Param("type_de_machine_id") Integer id);
    void deleteOne(@Param("type_de_machine_id") Integer id);
    List<type_de_machine> alltype_de_machines();
    void inserttype_de_machine(@Param("type_de_machine") type_de_machine type_de_machine);
    Integer getNewId();
}
