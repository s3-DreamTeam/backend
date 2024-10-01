package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.usager_x_remplissage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface usager_x_remplissageMapper {

    usager_x_remplissage selectOne(@Param("usager_x_remplissage_id") Integer id);
    void deleteOne(@Param("usager_x_remplissage_id") Integer id);
    List<usager_x_remplissage> allusager_x_remplissages();
    void insertusager_x_remplissage(@Param("usager_x_remplissage") usager_x_remplissage usager_x_remplissage);
    Integer getNewId();
}
