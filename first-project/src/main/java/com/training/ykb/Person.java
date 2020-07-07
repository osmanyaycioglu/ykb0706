package com.training.ykb;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

    @NotEmpty(message = "name boş olamaz")
    @Size(min = 2, max = 100, message = "name 2 ie 100 karater arasında olmaı")
    private String name;
    @NotEmpty(message = "surname boş olamaz")
    private String surname;
    @Min(value = 12, message = "age en az 12 olmalı")
    @Max(value = 120, message = "age en fazla 120 olmalı")
    private int    age;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int ageParam) {
        this.age = ageParam;
    }

}
