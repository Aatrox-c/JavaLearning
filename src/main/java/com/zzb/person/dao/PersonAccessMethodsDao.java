package com.zzb.person.dao;

import com.zzb.person.mapper.PersonMapper;
import com.zzb.person.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component("Mysql")
public class PersonAccessMethodsDao implements PersonAccessMethods{

    @Autowired
    private PersonMapper personMapper;
    @Override
    public void updatePerson(Person person) {
        personMapper.update(person.getId(), person.getName());
    }

    @Override
    public void deletePerson(UUID id) {
        personMapper.delete(id);
    }

    @Override
    public void addPerson(Person person) {
        personMapper.add(person.getId(), person.getName());
    }

    @Override
    public Person selectPerson(UUID id) {
        return personMapper.findOne(id);
    }

    @Override
    public List<Person> selectAll() {
        return personMapper.findAll();
    }
}
