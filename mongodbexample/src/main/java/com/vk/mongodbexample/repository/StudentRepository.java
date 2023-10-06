package com.vk.mongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vk.mongodbexample.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{

}
