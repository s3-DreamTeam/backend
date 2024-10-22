package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_template_page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_template_page_Mapper {
    List<product_template_page> getCompactProductTemplate(@Param("id_usager") Integer id_usager);
}
