package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.caracteristique_produit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface caracteristique_produitMapper {

    caracteristique_produit selectOne(@Param("caracteristique_produit_id") Integer id);
    void deleteOne(@Param("caracteristique_produit_id") Integer id);
    List<caracteristique_produit> allcaracteristique_produits();
    void insertcaracteristique_produit(@Param("caracteristique_produit") caracteristique_produit caracteristique_produit);
    Integer getNewId();
}
