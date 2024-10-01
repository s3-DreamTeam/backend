package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.type_de_caracteristique_machine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface type_de_caracteristique_machineMapper {

    type_de_caracteristique_machine selectOne(@Param("type_de_caracteristique_machine_id") Integer id);
    void deleteOne(@Param("type_de_caracteristique_machine_id") Integer id);
    List<type_de_caracteristique_machine> alltype_de_caracteristique_machines();
    void inserttype_de_caracteristique_machine(@Param("type_de_caracteristique_machine") type_de_caracteristique_machine type_de_caracteristique_machine);
    Integer getNewId();
}
