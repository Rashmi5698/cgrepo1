package com.cg;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfact=Persistence.createEntityManagerFactory("ab");
		EntityManager em=emfact.createEntityManager();
	
		Book book=new Book();
		//book.setIbsn(12);
		book.setTitle("Fifty");
		book.setPrice(1000);
		
		Book book1=new Book();
		//book1.setIbsn(12);
		book1.setTitle("Fifty grey");
		book1.setPrice(2000);
		
		Set<Book> b=new HashSet<>();
		b.add(book);
		b.add(book1);
		
		
		Author author=new Author();
		//author.setAuthorId(70);
		author.setAuthorName("Reshmi");
		
		author.setBook(b);
		
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		

	}

}
