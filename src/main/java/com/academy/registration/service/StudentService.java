package com.academy.registration.service;

import com.academy.registration.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<Student> getAllStudent();

    public Optional<Student> getStudentByDni(int dniStudent);

    public void deleteStudentByDni(int dniStudent);

    public String saveStudent(Student student);

}
