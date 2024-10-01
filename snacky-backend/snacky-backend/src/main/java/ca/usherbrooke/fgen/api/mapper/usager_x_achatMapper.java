package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.usager_x_achat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface usager_x_achatMapper {

    usager_x_achat selectOne(@Param("usager_x_achat_id") Integer id);
    void deleteOne(@Param("usager_x_achat_id") Integer id);
    List<usager_x_achat> allusager_x_achats();
    void insertusager_x_achat(@Param("usager_x_achat") usager_x_achat usager_x_achat);
    Integer getNewId();
}
