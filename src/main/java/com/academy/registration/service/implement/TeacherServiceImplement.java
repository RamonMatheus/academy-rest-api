package com.academy.registration.service.implement;


import com.academy.registration.model.Teacher;
import com.academy.registration.repository.TeacherRepository;
import com.academy.registration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImplement implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> getTeacherById(int idTeacher) {
        return teacherRepository.findById(idTeacher);
    }

    @Override
    public String deleteTeacherById(int idTeacher) {
        teacherRepository.deleteById(idTeacher);
        return "The operation has been executed successfully";
    }

    @Override
    public String saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
        return "The operation has been executed successfully";
    }
}
