package com.zzb.person.mapper;

import com.zzb.person.pojo.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.UUID;

public interface PersonMapper {

    Person findOne(UUID id);

    List<Person> findAll();

    @Update("update person_info set name = #{name} where id = #{id};")
    void update(UUID id, String name);

    @Delete("delete from person_info where id = #{id};")
    void delete(UUID id);

    @Insert("insert into person_info (id, name) values (#{id}, #{name});")
    void add(UUID id, String name);
}
