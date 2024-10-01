package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.type_machine_x_caracteristique;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface type_machine_x_caracteristiqueMapper {

    type_machine_x_caracteristique selectOne(@Param("type_machine_x_caracteristique_id") Integer id);
    void deleteOne(@Param("type_machine_x_caracteristique_id") Integer id);
    List<type_machine_x_caracteristique> alltype_machine_x_caracteristiques();
    void inserttype_machine_x_caracteristique(@Param("type_machine_x_caracteristique") type_machine_x_caracteristique type_machine_x_caracteristique);
    Integer getNewId();
}
