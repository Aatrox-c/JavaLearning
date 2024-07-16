package com.zzb.person.dao;

import com.zzb.person.pojo.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;
@Component("fake")
public class FakePersonAccessMethodsDao implements PersonAccessMethods{

    private final List<Person> DB = new ArrayList<>();
    @Override
    public void updatePerson(Person person) {
        for(Person p: DB) {
            if(p.getId().equals(person.getId())) {
                DB.remove(p);
                addPerson(person);
                return;
            }
        }
    }

    @Override
    public void deletePerson(UUID id) {
        for(Person p: DB) {
            if(p.getId().equals(id)) {
                DB.remove(p);
                return;
            }
        }
    }

    @Override
    public void addPerson(Person person) {
        DB.add(person);
    }

    @Override
    public Person selectPerson(UUID id) {
        for(Person p: DB) {
            if(p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Person> selectAll() {
        return DB;
    }
}
