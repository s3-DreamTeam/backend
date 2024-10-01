package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.type_de_caracteristique_produit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface type_de_caracteristique_produitMapper {

    type_de_caracteristique_produit selectOne(@Param("type_de_caracteristique_produit_id") Integer id);
    void deleteOne(@Param("type_de_caracteristique_produit_id") Integer id);
    List<type_de_caracteristique_produit> alltype_de_caracteristique_produits();
    void inserttype_de_caracteristique_produit(@Param("type_de_caracteristique_produit") type_de_caracteristique_produit type_de_caracteristique_produit);
    Integer getNewId();
}
