package com.kh.object.access;

public class Run {

	public static void main(String[] args) {
		
		AccessTest test = new AccessTest();
		
		System.out.println( test.publicField );
		test.publicMethod();
		
		System.out.println( test.portectedField );
		test.protectedMethod();
		
		System.out.println( test.defaultField );
		test.defaultMethod();
		
//		System.out.println( test.privateField );
//		test.privateMethod();
		// => private 제한자 사용 이유
		// : 객체의 데이터를 외부로부터 안전하게 보호하기 위함 (정보 은닉)
		// 	 객체 지향 핵심 원리 중 하나인 캡슐화를 실현하는데 사용!
		
		
	}

}
