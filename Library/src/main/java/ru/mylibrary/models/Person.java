package ru.mylibrary.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

public class Person {

    private int id;

    @NotEmpty(message = "Name should be not empty")
    @Size(min = 2, max = 3, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "Birthday should be in format 18.09.2023")
    @DateTimeFormat
    private Date birthday;

    public Person(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Person() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
