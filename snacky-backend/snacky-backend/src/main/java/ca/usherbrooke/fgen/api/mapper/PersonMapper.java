package ca.usherbrooke.fgen.api.mapper;

import ca.usherbrooke.fgen.api.business.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {

    Person selectOne(@Param("Person_id") Integer id);
    void deleteOne(@Param("Person_id") Integer id);
    List<Person> allPersons();
    void insertPerson(@Param("Person") Person Person);
    Integer getNewId();
}
