package com.kh.model.vo;

public class Student { //=> 학생 정보
	// 데이터 -> 이름, 나이, 학년, 키, 성별, 학번, 성적
	// 이름, 나이, 성적
	
	// 기능 -> 공부, 출석, 질문 ....
	
	// 학생 정보 출력
	
	private String name;		// 이름
	private int age;			// 나이
	private double score;		// 성적
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;	
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 성적: " + score);
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
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	
}










