package com.cg.jpacrud.service;

import java.util.List;

import com.cg.jpacrud.entities.Student;

public interface StudentService {
	
	 public abstract void addStudent(Student student);
	 
	 public abstract Student findStudentById(int id);
	 
	 public abstract void updateStudent(Student student);
	 
	 public abstract void removeStudent(Student student);
	 
	 List<Student> findAllStudents();
	 
}
