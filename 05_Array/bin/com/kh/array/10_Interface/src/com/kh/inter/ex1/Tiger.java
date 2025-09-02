package com.kh.inter.ex1;

public class Tiger implements Animal {

	// Shift + Alt + S => v 오버드라이드 자동완성
	@Override
	public void move() {
		System.out.println("꽁꽁 얼어붙은 한강 위로 호랑이가 걸어다닙니다.");
	}

	@Override
	public void eat() {
		System.out.println("꽁꽁 얼어붙은 한강 위로 걸어가는 고양이를 호랑이가 잡아먹습니다.");
	}

	@Override
	public void makeSound() {
		System.out.println("어흥!");
	}
	
	

}
