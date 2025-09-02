package com.kh.c_array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice4();
		practice7();
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		
		int num = sc.nextInt();
		
		if(num >= 0 && num < weeks.length) {
			
			System.out.print(weeks[num]);
		} else {
			
			System.out.print("잘못 입력하셨습니다.");
		}

	}
	
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("로또 당첨 번호 : ");
		
		int[] lottos = new int[6];
		
		for(int i=0; i<lottos.length; i++) {
			lottos[i] = (int)(Math.random() * 45 + 1);
			
			// 중복 값 확인
			for(int j=0; j<i; j++) {
				
				if (lottos[i] == lottos[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
	}
	
}







