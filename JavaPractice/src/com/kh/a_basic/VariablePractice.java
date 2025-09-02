package com.kh.a_basic;

import java.util.Scanner;

public class VariablePractice {

	public static void main(String[] args) {
		
		//practice1();
		practice4();
		
	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요 (남/여) : ");
		String gender = sc.nextLine();
		// ==> 문자타입으로 추출하고자 할 경우 문자열.charAt(위치)
		char gen = gender.charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		//문자열로 만든 printf문
		/*
		 * System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^" , 
				height, age, gender, name);
		*/
		//문자타입으로 만튼 printf문
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^\n"  , 
						height, age, gen, name );
		
		//System.out.printf("키 " + height + "cm인 " + age+"살 " + gender + " " +name +"님 반갑습니다^^");
	
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char ch1 = str.charAt(0);
		System.out.println("첫 번째 문자 : " + ch1);
		char ch2 = str.charAt(1);
		System.out.println("두 번째 문자 : " + ch2);
		char ch3 = str.charAt(2);
		System.out.println("세 번째 문자 : " + ch3);
		char ch4 = str.charAt(3);
		System.out.println("네 번째 문자 : " + ch4);
		
	}
	
}
