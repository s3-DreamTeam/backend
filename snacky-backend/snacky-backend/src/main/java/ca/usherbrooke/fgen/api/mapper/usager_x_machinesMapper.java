package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.usager_x_machines;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface usager_x_machinesMapper {

    usager_x_machines selectOne(@Param("usager_x_machines_id") Integer id);
    void deleteOne(@Param("usager_x_machines_id") Integer id);
    List<usager_x_machines> allusager_x_machiness();
    void insertusager_x_machines(@Param("usager_x_machines") usager_x_machines usager_x_machines);
    Integer getNewId();
}
