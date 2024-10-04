package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.machine_inventory_page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface machine_inventory_pageMapper {

    List<machine_inventory_page> getAllImageMachine(@Param("id") Integer id);
    String getImage(@Param("id") Integer id);
}
