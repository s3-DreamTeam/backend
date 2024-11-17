package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_template_page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_template_page_Mapper {
    List<product_template_page> getProductTemplate(@Param("id_usager") String id_usager);
    String getProductTemplateImage(@Param("id_machine") String id_machine);
}
