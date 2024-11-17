package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.usagerMachine;
import ca.usherbrooke.fgen.api.business.machine_template;
import ca.usherbrooke.fgen.api.business.machine_template_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_template_page_Mapper {
    List<machine_template> getTemplateMachine(@Param("name_usager") String name_usager);
    String getImageMachine(@Param("name_usager") String name_usager);
    machine_template_surface getMachineSurfaceTemplate(@Param("id_machine") String id_machine);
    List<Integer> getTemplateMachinesAllID(@Param("name_usager") String name_usager);
    void createMachineTemplate(@Param("machine_template") machine_template machineTemplate);
    void deleteMachineTemplate(@Param("id_machine") String id_machine);
}
