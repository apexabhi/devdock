package com.nagarro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entity.Student;
import com.nagarro.repository.StudentRepository;
import com.nagarro.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private final StudentRepository repo;
	
	@Autowired
	public StudentServiceImpl(StudentRepository repo) {
		this.repo=repo;
	}

	@Override
	public Student addStudent(Student st) {
		// TODO Auto-generated method stub
		repo.save(st);
		return st;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
