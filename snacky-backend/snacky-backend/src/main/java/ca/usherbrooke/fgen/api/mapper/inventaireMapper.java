package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.inventaire;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface inventaireMapper {

    inventaire selectOne(@Param("inventaire_id") Integer id);
    void deleteOne(@Param("inventaire_id") Integer id);
    List<inventaire> allinventaires();
    void insertinventaire(@Param("inventaire") inventaire inventaire);
    Integer getNewId();
}
