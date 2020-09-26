package com.academy.registration.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "student")
public class Student {

    @Id
    private int dniStudent;
    private String nameStudent;


    public int getDniStudent() {
        return dniStudent;
    }

    public void setDniStudent(int dniStudent) {
        this.dniStudent = dniStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
}
