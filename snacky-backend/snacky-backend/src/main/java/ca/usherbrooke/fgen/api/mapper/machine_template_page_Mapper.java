package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_template;
import ca.usherbrooke.fgen.api.business.machine_template_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_template_page_Mapper {
    machine_template getTemplateMachine(@Param("id_machine") Integer name_usager); //done
    String getImageMachine(@Param("id_machine") Integer id_machine); //done
    machine_template_surface getMachineSurfaceTemplate(@Param("id_machine") Integer id_machine); //done
    List<Integer> getTemplateMachinesAllID(@Param("name_usager") String name_usager); //done
    void createMachineTemplate(@Param("machine_template") machine_template machineTemplate); //done
    void deleteMachineTemplate(@Param("id_machine") Integer id_machine); //done
}
