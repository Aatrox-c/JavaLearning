package com.zzb.person.dao;

import com.zzb.person.pojo.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component("Mysql")
public class PersonAccessMethodsDao implements PersonAccessMethods{
    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(UUID id) {

    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public Person selectPerson(UUID id) {
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return List.of(new Person(UUID.randomUUID(), "Mysql"));
    }
}
