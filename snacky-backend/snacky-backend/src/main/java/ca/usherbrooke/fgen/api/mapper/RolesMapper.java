package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.Roles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RolesMapper {

    Roles selectOne(@Param("Roles_id") Integer id);
    void deleteOne(@Param("Roles_id") Integer id);
    List<Roles> allRoless();
    void insertRoles(@Param("Roles") Roles Roles);
    Integer getNewId();
}
