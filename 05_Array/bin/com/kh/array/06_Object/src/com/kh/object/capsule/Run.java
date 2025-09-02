package com.kh.object.capsule;

public class Run {

	public static void main(String[] args) {
		// Person 객체 생성
		Person p1 = new Person();
		// p1.name = "송지훈";  // 직접 접근 불가!
		p1.setName("홍길동");	  // 직접 값을 변경하는것이 아니라 
						     // setter 을 통해 값을 간접적으로 변경!
		p1.introduse();
		
		//Person p2 = new Person("송지훈", 29); //=>매개변수 생성자가 없어 사용불가
		Person p2 = new Person();
		p2.setName("송지훈");
		p2.setAge(29);
		
		System.out.println( p2.getName());
		//p2.introduse();
		

	}

}






