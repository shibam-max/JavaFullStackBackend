package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;
 
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
		
	}
	
	public List<Student> getAllStudents(){
		
		return studentRepo.findAll();
	}
	
}
