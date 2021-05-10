package com.cg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="book_table")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ibsn;
	@Column
	private String title;
	private int price;
	public int getIbsn() {
		return ibsn;
	}
	public void setIbsn(int ibsn) {
		this.ibsn = ibsn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
