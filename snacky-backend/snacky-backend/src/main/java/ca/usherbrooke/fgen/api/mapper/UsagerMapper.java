package ca.usherbrooke.fgen.api.mapper;


import ca.usherbrooke.fgen.api.business.Usager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsagerMapper {

    List<Usager> select(@Param("id") Integer id,
                         @Param("Nom_Usager") String Nom_Usager,
                         @Param("Prenom_Usager")String Prenom_Usager,
                         @Param("Solde_Usager") Integer Solde_Usager);
    Usager selectOne(@Param("id") Integer id);
    void deleteOne(@Param("id") Integer id);
    List<Usager> allUsagers();
    void insertUsager(@Param("Usager") Usager Usager);
    Integer getNewId();
}
