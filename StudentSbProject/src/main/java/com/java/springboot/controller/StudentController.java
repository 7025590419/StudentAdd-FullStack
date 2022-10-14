package com.java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.models.Student;
import com.java.springboot.service.StudentService;

@RestController
	@RequestMapping("/student")
	
	public class StudentController {
	    @Autowired
	    private StudentService studentService;

	    @CrossOrigin(origins = "http://localhost:3000")
	    @PostMapping("/add")
	    public String add(@RequestBody Student student){
	        studentService.saveStudent(student);
	        return "New student is added";
	    }
	    @CrossOrigin(origins = "http://localhost:3000")
	    @GetMapping("/getAll")
	    public List<Student> list(){
	        return studentService.getAllStudents();
	    }
	}


