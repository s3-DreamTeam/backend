package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.produit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface produitMapper {

    produit selectOne(@Param("produit_id") Integer id);
    void deleteOne(@Param("produit_id") Integer id);
    List<produit> allproduits();
    void insertproduit(@Param("produit") produit produit);
    Integer getNewId();
}
