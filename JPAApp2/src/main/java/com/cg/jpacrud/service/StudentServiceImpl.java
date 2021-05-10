package com.cg.jpacrud.service;

import com.cg.jpacrud.entities.Student;

import java.util.List;

import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
		
	private StudentDao dao=new StudentDaoImpl();
	
	public void addStudent(Student student) {
		dao.addStudent(student);
	}
	
	public Student findStudentById(int id) {
		Student student=dao.getStudentById(id);
		return student;
	}
	public  void updateStudent(Student student) {
		dao.updateStudent(student);
	}
	public void removeStudent(Student student) {
		dao.removeStudent(student);

	}
	
	public List<Student> findAllStudents(){
		List<Student> list= dao.getAll();   //new ArrayList<Student>();
		
		
		return list;
	}
}