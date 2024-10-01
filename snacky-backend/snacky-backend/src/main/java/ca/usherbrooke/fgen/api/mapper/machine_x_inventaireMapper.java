package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_x_inventaire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_x_inventaireMapper {

    machine_x_inventaire selectOne(@Param("machine_x_inventaire_id") Integer id);
    void deleteOne(@Param("machine_x_inventaire_id") Integer id);
    List<machine_x_inventaire> allmachine_x_inventaires();
    void insertmachine_x_inventaire(@Param("machine_x_inventaire") machine_x_inventaire machine_x_inventaire);
    Integer getNewId();
}
