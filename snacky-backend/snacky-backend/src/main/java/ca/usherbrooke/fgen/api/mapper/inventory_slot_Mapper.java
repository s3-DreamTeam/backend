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
}
