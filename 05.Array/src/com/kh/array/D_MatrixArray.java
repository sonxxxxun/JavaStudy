package com.kh.array;
import java.util.Scanner;

public class D_MatrixArray {
	/*
	 * 2차원 배열 : 배열 안에 배열.
	 *  "같은" 자료형의 "1차원 배열의 묶음"
	 *  
	 *  2차원 배열은 할당된 공간마다 인덱스 번호를 " 두 개" 부여
	 *   : 앞의 번호는 행의 인덱스 (몇 번째 1차원 배열인지),
	 *   	뒤의 번호는 열의 인덱스 (1차원 배열에서 몇 번째 데이터인지)
	 *   
	 *   선언 => 1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만듬!
	 *   
	 *   	자료형[][] 배열명;  => 권장
	 *   	자료형 배열명[][];
	 *   	자료형[] 배열명[];
	 *   
	 *   할당
	 *   
	 *   	배열명 = new 자료형[행크기][열크기];
	 *   	* 행크기 : 1차원 배열의 개수
	 *   	* 열크기 : 1차원 배열의 크기 (생략 가능-> 가변 길이의 1차원 배열 할당)
	 *   
	 *   선연 및 할당 : 자료형[][] 배열명 = new 자료형[행크기][열크기];
	 *   
	 *   값대입 
	 *   		배열명[행인덱스][열인덱스] = 값;
	 *   		* 행인덱스 : 몇 번째 1차원 배열인지
	 *   		* 열인덱스 : 1차원 배열에서 몇 번째 데이터인지 (인덱스)
	 *   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//practice1();
		practice2();
	}
	
	public static void practice1() {
		// 정수형 2차원 배열 arr 선언
		int[][] arr;
		
		// 크기가 4인 1차원 배열 3묶음
		
		//arr = new int[3][4];
		
		
		arr = new int[3][];
		/*
		arr[0] = new int[4];
		arr[0] = new int[4];
		arr[0] = new int[4];
		arr[0] = new int[4];
		*/
		// => 반복문으로...?
		for(int i=0; i<arr.length; i++) {		// arr.length => 행크기
			arr[i] = new int[4];
		}
		// arr[0].length => 4. 열크기. 해당 인덱스 위치의 1차원 배열 크기.
		
		// * 값 대입
		// 초기화
		int[][] arr2 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
		System.out.println(arr2[1][1]);	
	}
	
	public static void practice2() {
		
		String[][] arr = new String[3][3];
		
//		arr[0][0] = "(0행 0열)";
//		arr[0][1] = "(0행 1열)";
//		arr[0][2] = "(0행 2열)";
		/*
		for(int i=0; i<arr[0].length; i++) {
			arr[0][i] = "(0행" + i +"열)";
		}
		for(int i=0; i<arr[0].length; i++) {
			arr[1][i] = "(1행" + i +"열)";
		
		}
		for(int i=0; i<arr[0].length; i++) {
			arr[2][i] = "(2행" + i +"열)";
		*/
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				
				arr[row][col] = "(" + row + "행" + col + "열)";
			}
		}
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			
			System.out.println();
		}
		
		
	}

		
		
}






