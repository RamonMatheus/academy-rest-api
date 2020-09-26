package com.academy.registration.controller;

import com.academy.registration.model.Student;
import com.academy.registration.repository.StudentRepository;
import com.academy.registration.service.implement.StudentServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

   /* StudentServiceImplement studentServiceImplement;


    @GetMapping
    public List<Student> getAllStudent(){
  //      return studentServiceImplement.getAllStudent();
    }

    @PostMapping
    public String saveStudent(Student student){
   //     return studentServiceImplement.saveStudent(student);
    }
    */

    //Implemnts Repository Interface

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student){
       studentRepository.save(student);
       return ("Completed saved");
    }
    @GetMapping("/{dniStudent}")
    public Optional<Student> getStudentByDni(@PathVariable int dniStudent){
        return studentRepository.findById(dniStudent);
    }
    @DeleteMapping("/{dniStudent}")
    public String deleteStudentByDni(@PathVariable int dniStudent){
        studentRepository.deleteById(dniStudent);
        return "completed deleted";
    }
}
