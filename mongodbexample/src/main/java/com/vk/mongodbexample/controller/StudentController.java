package com.vk.mongodbexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vk.mongodbexample.entity.Student;
import com.vk.mongodbexample.repository.StudentRepository;

@RestController
public class StudentController {
	
@Autowired
StudentRepository studentRepo;

 	
@GetMapping("/getStudent")
public ResponseEntity<List<Student>> Find(@RequestBody Student student){
	
	List<Student> isFind = studentRepo.findAll();
	return new ResponseEntity<List<Student>>(isFind, HttpStatus.OK);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<Boolean> deleteStudent(@PathVariable int id) {
   
        if (studentRepo.existsById(id)) {
            studentRepo.deleteById(id);
            return ResponseEntity.ok(true);  
        } else {
            return ResponseEntity.notFound().build();
        }
}
}
