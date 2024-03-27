package com.librarymanagement.library.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bookName;
	private String autherName;
	private int price;
	
	
	public Book(String bookName, String autherName, int price) {
		super();
		this.bookName = bookName;
		this.autherName = autherName;
		this.price = price;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAutherName() {
		return autherName;
	}


	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", autherName=" + autherName + ", price=" + price + "]";
	}
	
	
	
}
