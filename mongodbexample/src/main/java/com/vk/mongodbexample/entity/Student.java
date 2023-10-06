package com.vk.mongodbexample.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="student")
public class Student {

	@Id
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private float marks;
}
