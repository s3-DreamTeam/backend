package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.achat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface achatMapper {

    achat selectOne(@Param("achat_id") Integer id);
    void deleteOne(@Param("achat_id") Integer id);
    List<achat> allachats();
    void insertachat(@Param("achat") achat achat);
    Integer getNewId();
}
