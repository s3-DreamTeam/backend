package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.business.machine_template_page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_template_page_Mapper {
    List<machine_template_page> getCompactTemplateMachine(@Param("name_usager") String name_usager);
    String getImageMachine(@Param("name_usager") String name_usager);
    List<Integer> getMachinesSpecificsAllID(@Param("name_usager") String name_usager);
}
