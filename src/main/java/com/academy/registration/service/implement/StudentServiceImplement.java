package com.academy.registration.service.implement;

import com.academy.registration.model.Student;
import com.academy.registration.repository.StudentRepository;
import com.academy.registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll() ;
    }

    @Override
    public Optional<Student> getStudentByDni(int dniStudent) {
        return studentRepository.findById(dniStudent) ;
    }

    @Override
    public void deleteStudentByDni(int dniStudent) {
        studentRepository.deleteById(dniStudent);

    }

    @Override
    public String saveStudent(Student student) {
        studentRepository.save(student) ;
        return ("El estudiante "+ student.getNameStudent()+" ha sido almacenado");
    }
}
