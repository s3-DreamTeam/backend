package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_inventory_specific;
import ca.usherbrooke.fgen.api.business.machine_template_page;
import ca.usherbrooke.fgen.api.business.machine_template_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_template_page_Mapper {
    List<machine_template_page> getCompactTemplateMachine(@Param("name_usager") String name_usager);
    String getImageMachine(@Param("name_usager") String name_usager);
    machine_template_surface getMachineSurfaceTemplate(@Param("name_usager") String name_usager, @Param("id_machine") Integer id_machine);
    List<Integer> getMachinesSpecificsAllID(@Param("name_usager") String name_usager);
}
