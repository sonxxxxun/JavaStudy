package com.kh.inherit.before;

public class Run {

	public static void main(String[] args) {
		//Desktop 객체 생성
		Desktop dt = new Desktop("LG", "LG-001", "사무용PC", 2000000, false);
		System.out.println( dt.information());
		
		//TV 객체 생성
		TV tv = new TV("삼성", "SM-002", "LED TV", 3000000, 55);
		String info = tv.information();
		System.out.println(info);
	}

}
