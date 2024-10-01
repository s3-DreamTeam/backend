package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.None;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoneMapper {

    None selectOne(@Param("None_id") Integer id);
    void deleteOne(@Param("None_id") Integer id);
    List<None> allNones();
    void insertNone(@Param("None") None None);
    Integer getNewId();
}
