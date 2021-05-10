package com.cg.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.jpacrud.client.JPAUtil;
import com.cg.jpacrud.entities.Student;


public class StudentDaoImpl implements StudentDao {
	private EntityManager entityManager;
	
	 public void addStudent(Student student) {
		 entityManager=JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		System.out.println("Inserted");
		entityManager.getTransaction().commit(); 
		 
	 }
	 
	 public Student getStudentById(int id) {
		 entityManager=JPAUtil.getEntityManager();
	 Student entity=entityManager.find(Student.class, id);
	  Student student=new Student();
	  student.setName(entity.getName());
	  student.setStudentId(entity.getStudentId());
	  return student;
	  
	 }
	 
	 public void updateStudent(Student student) {
		 entityManager=JPAUtil.getEntityManager();
		Student entity=entityManager.find(Student.class,student.getStudentId());
		if(entity!=null) {
			entityManager.getTransaction().begin();
			entity.setName(student.getName());
			entityManager.getTransaction().commit(); 
		}
		 
	 }
	 
	 public void removeStudent(Student student) {
		 entityManager=JPAUtil.getEntityManager();
			Student entity = entityManager.find(Student.class, student.getStudentId());
			entityManager.getTransaction().begin();
			if(entity!=null) {
				entityManager.remove(entity);// delete 
			entityManager.getTransaction().commit();
			}
		}

}
