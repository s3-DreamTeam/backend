package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_template;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface product_template_Mapper {
    product_template getProductTemplate(@Param("id_produit") Integer id_produit);
    String getProductTemplateImage(@Param("id_machine") Integer id_machine);
}
