package com.kh.f_poly.model.vo;

public class Book {
	private String title; 		//도서명
	private String author;		//저자명
	private String publisher;	//출판사명
	
	public Book() {}
	public Book(String title, String author, String publisther) {
		this.title = title;
		this.author = author;
		this.publisher = publisther;
		
	}
	@Override
	public String toString() {
		return "";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}















