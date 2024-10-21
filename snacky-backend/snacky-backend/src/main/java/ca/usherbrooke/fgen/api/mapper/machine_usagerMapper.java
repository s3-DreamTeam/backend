package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_usager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface machine_usagerMapper {

    List<machine_usager> getAll();
}
