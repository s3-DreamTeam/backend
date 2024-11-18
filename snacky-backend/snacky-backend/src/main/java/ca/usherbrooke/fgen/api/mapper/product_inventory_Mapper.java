package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.product;
import ca.usherbrooke.fgen.api.business.product_template_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_inventory_Mapper {
    product getProductInventory(@Param("info") information info);
    String getProductTemplateImage(@Param("info") information info);
    product_template_surface getProductSurface(@Param("info") information info);
    List<Integer> getProductAllID(@Param("id_usager") String name_usager);
    void createProduct(@Param("product_template") product productTemplate);
    void deleteProduct(@Param("info") information info);

}
