package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_template;
import ca.usherbrooke.fgen.api.business.product_template_surface;
import ca.usherbrooke.fgen.api.business.information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_template_Mapper {
    product_template getProductTemplate(@Param("info") information info);
    String getProductTemplateImage(@Param("info") information info);
    product_template_surface getProductSurfaceTemplate(@Param("info") information info);
    List<Integer> getProductTemplatesAllID(@Param("id_usager") String name_usager);
    void createProductTemplate(@Param("product_template") product_template productTemplate);
    void deleteProductTemplate(@Param("info") information info);

    boolean isTemplateUsed(@Param("info") information info);//Check si le templateID est utiliser par un produit
}
