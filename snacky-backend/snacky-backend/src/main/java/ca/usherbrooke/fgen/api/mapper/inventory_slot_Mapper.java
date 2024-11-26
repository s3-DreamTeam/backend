package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.inventorySlot;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface inventory_slot_Mapper {
    List<inventorySlot> getAllSlots(@Param("info") information info);

    void removeProductFromSlot(@Param("info") information info);

    void addProductToSlot(@Param("info") information info);

    void setSlot(@Param("info") information info);

    void resetSlot(@Param("info") information info);


    Integer getInventoryQuantity(@Param("info") information info);//get la quantiter du produit dans l'inventaire

    Integer getMaxQuantity(@Param("info") information info);// get le nombre d'espace dans le slot

    Integer getQuantity(@Param("info") information info);// get la quantiter presentement dans le slot

    boolean isProductUsed(@Param("info") information info);//is it used???
}
