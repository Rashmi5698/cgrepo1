package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jps progress");
		StudentService service=new StudentServiceImpl();
		
		Student student=new Student();
		//addstudent
		/*student.setStudentId(102);
		student.setName("Sharada");
		service.addStudent(student);*/
		
		
		//findbyid
		student=service.findStudentById(101);
		System.out.println("ID:"+student.getStudentId());
		System.out.println("Name:"+student.getName());
		
		/*student.setName("Reni");
		service.updateStudent(student);*/
		
		service.removeStudent(student);
	}
	
	

}
