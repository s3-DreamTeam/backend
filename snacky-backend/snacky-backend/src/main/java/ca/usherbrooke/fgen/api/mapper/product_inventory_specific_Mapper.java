package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_inventory_specific;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_inventory_specific_Mapper {

    List<product_inventory_specific> getAllProduct(@Param("id_usager") Integer id_usager);
}
