package com.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class Studentcontroller {
	
	@Value("${app.name: demo app name}")
	private String appName;
	//@GetMapping("/get")
//	@RequestMapping(value="/get", method = RequestMethod.GET)
	
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
	
		return studentservice.getAllStudents();
	}
	/*public void getstudent() {
		student_response student_response1 = new student_response();
	//	return student_response1;
	}*/
}
