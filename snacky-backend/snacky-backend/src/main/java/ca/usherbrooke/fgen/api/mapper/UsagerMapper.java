package ca.usherbrooke.fgen.api.mapper;


import ca.usherbrooke.fgen.api.business.Usager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsagerMapper {

    List<Usager> select(@Param("usager_id") Integer usager_id,
                        @Param("nom") String Nom_Usager,
                        @Param("prenom")String Prenom_Usager,
                        @Param("solde") Integer Solde_Usager,
                        @Param("email")String Email_Usager,
                        @Param("profil_pic")String Profile_pic_Usager,
                        @Param("status_id")String Status_id_Usager);
    Usager selectOne(@Param("usager_id") Integer id);
    void deleteOne(@Param("usager_id") Integer id);
    List<Usager> allUsagers();
    void insertUsager(@Param("usager") Usager Usager);
    Integer getNewId();
}
