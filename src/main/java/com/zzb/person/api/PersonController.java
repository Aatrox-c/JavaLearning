package com.zzb.person.api;

import com.zzb.person.pojo.Person;
import com.zzb.person.service.PersonService;
import jakarta.validation.constraints.NotBlank;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RequestMapping("PersonApi")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@Validated @RequestBody Person person) {
        personService.addPerson(person);
    }
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }

    @PostMapping("/update")
    public void updatePerson(@Validated @RequestBody Person person) {
        personService.updatePerson(person);
    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return personService.selectAll();
    }
    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") UUID id) {
        return personService.selectPerson(id);
    }
}
