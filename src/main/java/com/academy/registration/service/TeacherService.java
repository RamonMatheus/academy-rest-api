package com.academy.registration.service;

import com.academy.registration.model.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    public List<Teacher> getAllTeacher();

    public Optional<Teacher> getTeacherById(int idTeacher);

    public String deleteTeacherById(int idTeacher);

    public String saveTeacher(Teacher teacher);

}
