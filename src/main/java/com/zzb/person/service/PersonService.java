package com.zzb.person.service;

import com.zzb.person.dao.PersonAccessMethods;
import com.zzb.person.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class PersonService {

    private final PersonAccessMethods personAccessMethods;
    // @Qualifier的作用是当IOC自动注入依赖的时候选择名称对应的接口实现类
    @Autowired
    public PersonService(@Qualifier("Mysql") PersonAccessMethods personAccessMethods) {
        this.personAccessMethods = personAccessMethods;
    }

    public void addPerson(Person person) {
        personAccessMethods.addPerson(new Person(UUID.randomUUID(), person.getName()));
    }

    public void deletePerson(UUID id) {
        personAccessMethods.deletePerson(id);
    }

    public void updatePerson(Person person) {
        personAccessMethods.updatePerson(person);
    }

    public Person selectPerson(UUID id) {
        return personAccessMethods.selectPerson(id);
    }

    public List<Person> selectAll() {
        return personAccessMethods.selectAll();
    }
}
