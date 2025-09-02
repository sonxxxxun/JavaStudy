package com.kh.inter.ex1;

//인터페이스를 상속(구현)=> implements 인터페이스명

public class Cat implements Animal {
	
	// * 오버라이딩 조건 : 반환형, 메소드명, 매개변수정보가 같아야함
	@Override
	public void move() {
		System.out.println("꽁꽁 얼어붙은 한강 위로 고양이가 걸어다닙니다.");
		
	}
	@Override
	public void eat() {
		System.out.println("꽁꽁 얼어붙은 한강 위를 걸어가는 고양이가 생선을 먹는다");
	}
	@Override
	public void makeSound() {
		System.out.println("야옹~");
	}
}





















