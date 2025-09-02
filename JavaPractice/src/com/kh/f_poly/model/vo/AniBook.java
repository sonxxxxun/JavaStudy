package com.kh.f_poly.model.vo;

public class AniBook extends Book {
	
	private int accessAge; 		//제한 나이
	
	public AniBook() {}
	public AniBook(String title, String author, String publisher, int accessAge) {
		this.accessAge = accessAge;
		
	}
	@Override
	public String toString() {
		return "";
	}
	public int inAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	

}
