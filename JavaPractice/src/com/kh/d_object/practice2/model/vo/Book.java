package com.kh.d_object.practice2.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	
	public Book() {}
	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	public Book(String title, String publisher, String author, int price, double discountRate) {
	
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	/*
	public void introduse1() {
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격 : %d 할인율 : %.1f\n",title,publisher,author,price,discountRate);			
	}
	public void introduse2() {
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격 : %d 할인율 : %.2f\n",title,publisher,author,price,discountRate);
	}
	*/
	public void introduse3() {
		System.out.println("도서명: " + title + "저자명: " + publisher + "출판사: " + author + "가격 : " + price + "할인율 : " + discountRate);
	}


}









