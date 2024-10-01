package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.caracteristique_machine;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface caracteristique_machineMapper {

    caracteristique_machine selectOne(@Param("caracteristique_machine_id") Integer id);
    void deleteOne(@Param("caracteristique_machine_id") Integer id);
    List<caracteristique_machine> allcaracteristique_machines();
    void insertcaracteristique_machine(@Param("caracteristique_machine") caracteristique_machine caracteristique_machine);
    Integer getNewId();
}
