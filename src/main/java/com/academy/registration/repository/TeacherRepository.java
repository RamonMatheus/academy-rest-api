package com.academy.registration.repository;

import com.academy.registration.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, Integer> {


}
