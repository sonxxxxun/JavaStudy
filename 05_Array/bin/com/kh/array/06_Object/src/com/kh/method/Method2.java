package com.kh.method;

public class Method2 {
	/*
	 * 메소드 오버로딩
	 *  : 같은 이름의 메소드를 여러 개 작성할 수 있는 기술
	 *  
	 *  조건
	 *  : 매개변수 정보가 달라야 함
	 *  
	 *   => 매개변수 정보 : 개수, 타입(자료형), 순서
	 */
	public static void main(String[] args) {
		
		int result1 = add(10, 5);
		System.out.println(result1);
		
		double result2 = add(12.5, 5.5);
		System.out.println(result2);
		
	}
	/**
	 * add 메소드
	 * 두 정수의 합을 반환하는 메소드
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	/* => 매개변수 개수와 타입이 같아 실행 오류
	public static int add(int n1, int n2) {
		return n1 + n2;
		*/
	/*
	 * add 메소드
	 * 두 실수의 합을 반환하는 메소드
	 * 
	 * @param n1
	 * @param n2
	 * @return n1 + n2
	 */
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	
}













