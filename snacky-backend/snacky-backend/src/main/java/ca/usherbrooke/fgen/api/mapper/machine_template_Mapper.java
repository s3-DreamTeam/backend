package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.machine_template;
import ca.usherbrooke.fgen.api.business.machine_template_surface;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_template_Mapper {
    machine_template getTemplateMachine(@Param("info") information info); //done
    String getImageMachine(@Param("info") information info); //done
    machine_template_surface getMachineSurfaceTemplate(@Param("info") information info); //done
    List<Integer> getTemplateMachinesAllID(@Param("id_usager") String name_usager); //done
    void createMachineTemplate(@Param("machine_template") machine_template machineTemplate); //done
    void deleteMachineTemplate(@Param("info") information info); //done
}
