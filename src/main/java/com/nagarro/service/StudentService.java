package com.nagarro.service;

import java.util.List;

import com.nagarro.entity.Student;

public interface StudentService {
	public Student addStudent(Student st);
	public List<Student> getAll();

}
