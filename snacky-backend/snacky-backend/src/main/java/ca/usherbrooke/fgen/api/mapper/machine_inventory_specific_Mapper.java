package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_inventory_page;
import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_inventory_specific_Mapper {
    List<machine_inventory_specific> getAllMachine(@Param("id_usager") Integer id_usager);
}
