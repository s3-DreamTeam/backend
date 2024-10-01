package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.status;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface statusMapper {

    status selectOne(@Param("status_id") Integer id);
    void deleteOne(@Param("status_id") Integer id);
    List<status> allstatuss();
    void insertstatus(@Param("status") status status);
    Integer getNewId();
}
