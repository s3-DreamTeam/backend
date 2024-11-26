package ca.usherbrooke.fgen.api.mapper;


import ca.usherbrooke.fgen.api.business.entrepot_ajout;
import ca.usherbrooke.fgen.api.business.entrepot_perdu;
import ca.usherbrooke.fgen.api.business.information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface entrepot_manage_Mapper {

    void ajoutProduitInventaire(@Param("quantite_ajout") entrepot_ajout quantite_ajout);
    void perduProduitInventaire(@Param("quantite_perdu") entrepot_perdu quantite_perdu);

    Integer getQuantityWarehouseProduct(@Param("product")entrepot_perdu lostProduct);//get

    boolean isProducUsed(@Param("info") information info);//is it used???
}
