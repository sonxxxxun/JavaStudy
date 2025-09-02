package com.kh.collection.set.model.vo;

public class Student {

	private String name;
	private int age;
	private int score;
	
	public Student() {}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
	@Override
	public int hashCode() {
		
		// 모든 필드의 값이 일치하면 동일한 hashCode 반환
		//	=> 문자열로 만들어서 해시값 반환
		String str = name + age + score;	// "장원영20100"
		return str.hashCode();
	
	}
	
	// Student객체.equals(Student 객체)으로 호출될 것임!!
	@Override
	public boolean equals(Object obj) {
		
		// 현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true, 그렇지않으면 false
		
		//this (현재 객체) 		| 	obj (전달받은객체)
		//	Student					Object
		Student other = (Student)obj;	// 전달받은 객체를 강제형변환!
		
		//this (현재 객체) 		| 	other (전달받은객체)
		//	this.name 과 other.name 일치하는지 확인 		: String
		// 	this.age 와 other.age 일치하는지 확인 		: int
		// 	this.scoer 와 other.scoer 일치하는 확인 	: int
		
		if (this.name.equals(other.name) 
				&& this.age == other.age && this.score == other.score) {
			return true;
		} else {
			return false;
		}
		
		
		
		
		
		
	}
	
	
	
}
















