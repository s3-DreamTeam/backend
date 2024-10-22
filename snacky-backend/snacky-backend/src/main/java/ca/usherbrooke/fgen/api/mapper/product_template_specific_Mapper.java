package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.product_template_specific;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface product_template_specific_Mapper {
    List<product_template_specific> getAllProductTemplate(@Param("id_usager") Integer id_usager);
}
