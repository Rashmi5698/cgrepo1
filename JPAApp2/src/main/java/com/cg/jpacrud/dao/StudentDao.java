package com.cg.jpacrud.dao;

import java.util.List;

import com.cg.jpacrud.entities.Student;

public interface StudentDao {
	
	 public abstract void addStudent(Student student);
	 
	 public abstract Student getStudentById(int id);
	 
	 public abstract void updateStudent(Student student);
	 
	 public abstract void removeStudent(Student student);
	 List<Student> getAll();
}
