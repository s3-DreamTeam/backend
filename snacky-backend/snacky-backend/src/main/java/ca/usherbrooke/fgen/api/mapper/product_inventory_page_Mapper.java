package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_inventory_page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_inventory_page_Mapper {
    List<product_inventory_page> getAllCompactProduct(@Param("id_usager") Integer id_usager);
}
