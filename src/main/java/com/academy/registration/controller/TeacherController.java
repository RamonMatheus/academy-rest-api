package com.academy.registration.controller;

import com.academy.registration.model.Teacher;

import com.academy.registration.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getAllTeacher(){
        return teacherRepository.findAll();
    }
    @GetMapping("/{idTeacher}")
    public Optional<Teacher> getTeacherById(@PathVariable int idTeacher){
        return teacherRepository.findById(idTeacher);
    }
    @DeleteMapping("/{idTeacher}")
    public String deleteTeacherById(@PathVariable int idTeacher){
        teacherRepository.deleteById(idTeacher);
        return "The teacher has been removed";
    }
    @PostMapping("/save")
    public String saveTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
        return ("Completed saved");
    }
}
