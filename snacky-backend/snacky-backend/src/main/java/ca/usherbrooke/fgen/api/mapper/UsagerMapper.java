package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.Usager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsagerMapper {

    Usager selectOne(@Param("Usager_id") Integer id);
    void deleteOne(@Param("Usager_id") Integer id);
    List<Usager> allUsagers();
    void insertUsager(@Param("Usager") Usager Usager);
    Integer getNewId();
}
