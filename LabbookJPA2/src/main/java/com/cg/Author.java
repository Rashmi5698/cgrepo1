package com.cg;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.util.Set;
@Entity
@Table(name="author_table")
public class Author {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int authorId;
	@Column
	private String authorname;
	@OneToMany(cascade=CascadeType.ALL, targetEntity=Book.class)
	@JoinTable(name="book_author")
	private Set<Book> book;
	
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorname;
	}
	public void setAuthorName(String authorname) {
		this.authorname = authorname;
	}
	public Set<Book> getBook() {
		return book;
	}
	public void setBook(Set<Book> book) {
		this.book = book;
	}
	

}
