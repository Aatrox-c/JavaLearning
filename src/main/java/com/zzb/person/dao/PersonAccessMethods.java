package com.zzb.person.dao;

import com.zzb.person.pojo.Person;
import org.springframework.stereotype.Component;

import java.util.*;

public interface PersonAccessMethods {

    void updatePerson(Person person);

    void deletePerson(UUID id);

    void addPerson(Person person);

    Person selectPerson(UUID id);

    List<Person> selectAll();
}
