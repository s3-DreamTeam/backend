package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.remplissage_x_produit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface remplissage_x_produitMapper {

    remplissage_x_produit selectOne(@Param("remplissage_x_produit_id") Integer id);
    void deleteOne(@Param("remplissage_x_produit_id") Integer id);
    List<remplissage_x_produit> allremplissage_x_produits();
    void insertremplissage_x_produit(@Param("remplissage_x_produit") remplissage_x_produit remplissage_x_produit);
    Integer getNewId();
}
