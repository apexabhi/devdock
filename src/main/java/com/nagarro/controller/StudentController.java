package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.entity.Student;
import com.nagarro.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private final StudentService stService;
	@Autowired
	public StudentController(StudentService stService) {
		this.stService = stService;
	}
	
	@PostMapping
	public ResponseEntity<Student> addAccount(@RequestBody Student acc) {
		return ResponseEntity.ok().body(stService.addStudent(acc));
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAll() {
		return ResponseEntity.ok().body(stService.getAll());
	}

}
