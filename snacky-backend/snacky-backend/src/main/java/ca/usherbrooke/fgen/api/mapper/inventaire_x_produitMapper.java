package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.inventaire_x_produit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface inventaire_x_produitMapper {

    inventaire_x_produit selectOne(@Param("inventaire_x_produit_id") Integer id);
    void deleteOne(@Param("inventaire_x_produit_id") Integer id);
    List<inventaire_x_produit> allinventaire_x_produits();
    void insertinventaire_x_produit(@Param("inventaire_x_produit") inventaire_x_produit inventaire_x_produit);
    Integer getNewId();
}
