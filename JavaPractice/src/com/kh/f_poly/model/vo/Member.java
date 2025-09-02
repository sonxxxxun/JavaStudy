package com.kh.f_poly.model.vo;

public class Member {
	private String name;		//회원명
	private int age;			//회원 나이
	private char gender;		//성별
	private int couponCount;	//요리학원 쿠폰 개수 = 0
	
	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age + "/n성별: " + gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int inCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	
}























