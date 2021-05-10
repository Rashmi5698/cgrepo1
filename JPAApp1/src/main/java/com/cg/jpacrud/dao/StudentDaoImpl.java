package com.cg.jpacrud.dao;

import com.cg.jpacrud.entities.Student;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class StudentDaoImpl implements StudentDao {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	 public void addStudent(Student student) {
		 
		entityManagerFactory=Persistence.createEntityManagerFactory("postgres");
		entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		System.out.println("Inserted");
		entityManager.getTransaction().commit(); 
		 
	 }
	 
	 public Student getStudentById(int id) {
	 entityManagerFactory=Persistence.createEntityManagerFactory("postgres");
	 entityManager=entityManagerFactory.createEntityManager();
	 Student entity=entityManager.find(Student.class, id);
	  Student student=new Student();
	  student.setName(entity.getName());
	  student.setStudentId(entity.getStudentId());
	  return student;
	  
	 }
	 
	 public void updateStudent(Student student) {
		 Student entity = entityManager.find(Student.class, student.getStudentId());
			
			if(entity!=null) {
				entityManager.getTransaction().begin();
				entity.setName(student.getName());
				entityManager.getTransaction().commit();
			}
}
	 public void removeStudent(Student student) {
			Student entity = entityManager.find(Student.class, student.getStudentId());
			entityManager.getTransaction().begin();
			if(entity!=null)		
				entityManager.remove(entity);// delete from table name where id=id;
			entityManager.getTransaction().commit();
		}
}
