package com.zzb.person.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import java.util.UUID;

// 校验字段时，要在类上加@Validated，并且在对应的字段上加上@NotBlank @NotNull等注解
@Validated
public class Person {

    private final UUID id;
    @NotBlank(message = "name can not be blank")
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
