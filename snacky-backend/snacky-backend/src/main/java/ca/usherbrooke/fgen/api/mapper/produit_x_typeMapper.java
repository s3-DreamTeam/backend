package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.produit_x_type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface produit_x_typeMapper {

    produit_x_type selectOne(@Param("produit_x_type_id") Integer id);
    void deleteOne(@Param("produit_x_type_id") Integer id);
    List<produit_x_type> allproduit_x_types();
    void insertproduit_x_type(@Param("produit_x_type") produit_x_type produit_x_type);
    Integer getNewId();
}
