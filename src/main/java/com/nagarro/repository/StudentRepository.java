package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	

}