package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.remplissage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface remplissageMapper {

    remplissage selectOne(@Param("remplissage_id") Integer id);
    void deleteOne(@Param("remplissage_id") Integer id);
    List<remplissage> allremplissages();
    void insertremplissage(@Param("remplissage") remplissage remplissage);
    Integer getNewId();
}
