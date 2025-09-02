package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Student;

public class Run {
	
	// * 객체 배열 : 여러 개의 객체를 저장하는 구조
	/*
	 *  *선언
	 *  		클래스명[] 변수명;
	 *  		클래스명[] 변수명 = new 클래스명[]
	 *  
	 *  *할당
	 * 		 	변수명 = new 클래스명[배열크기];
	 *  
	 *  * 배열에 값을 초기화(대입)
	 *  		변수명[인덱스] = new 클래스명();
	 *  
	 */
	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		int[] iArr = new int[3];
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		
			System.out.println( iArr[i] );
		}
		
		// --------------------------------
		Student[] stdArr = new Student[3];
		
		for(int i=0; i<stdArr.length; i++) {
			System.out.println( stdArr[i] );
		}
		
		// * 객체 배열에 데이터를 저장
		stdArr[0] = new Student("송지훈", 29, 100.0);
		stdArr[1] = new Student("춘향이", 30, 78.87);
		stdArr[2] = new Student("홍길동", 31, 10.59);
		
		stdArr[1].printInfo();
		stdArr[2] = null;  // => 세번째 학생 정보 제거
		
		// * 입력받은 값을 기준으로 학생 정보 관리
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		// 반복문을 이용하여 입력 받은 값으로 배열에 저장
		for(int i=0; i<sArr.length; i++) {
			System.out.print("- 이름 :");
			String name = sc.next();
			
			System.out.print("- 나이 :");
			int age = sc.nextInt();
			
			System.out.print("- 성적 :");
			double score = sc.nextDouble();
			
			sArr[i] = new Student(name, age, score);
				
		}
		
		//* 출력
		//=> for(자료형 배열명 : 배열명
		for(Student s : sArr) {
			s.printInfo();
		}
	}

}










