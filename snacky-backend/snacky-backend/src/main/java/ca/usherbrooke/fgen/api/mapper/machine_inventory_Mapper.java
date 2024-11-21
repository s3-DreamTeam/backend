package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.information;
import ca.usherbrooke.fgen.api.business.machine;
import ca.usherbrooke.fgen.api.business.machine_inventory_surface;
import ca.usherbrooke.fgen.api.business.row_column;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface machine_inventory_Mapper {
    machine getMachine(@Param("info") information info); //done
    String getMachinesImage(@Param("info") information info); //done
    machine_inventory_surface getMachinesSurface(@Param("info") information info); //done
    List<Integer> getAllMachinesID(@Param("id_usager") String id_usager); //done

    void deleteMachineInventaire(@Param("info") information info); //done

    void newMachineInventaire(@Param("newMachine") machine newMachine); //Changed to int (je veux le ID de la machine que tu viens de lui donner)
    row_column getRowColumn(@Param("info") information info);//je veux le nombre de row et column
    void createSlot(@Param("info") information info);//Create slot avec les info et l'affaire de base qu'on parlait

    Integer getLastID(@Param("newMachine") machine newMachine);
}