package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.dimension;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface dimensionMapper {

    dimension selectOne(@Param("dimension_id") Integer id);
    void deleteOne(@Param("dimension_id") Integer id);
    List<dimension> alldimensions();
    void insertdimension(@Param("dimension") dimension dimension);
    Integer getNewId();
}
