package test;

//1. 포함시키기!
import java.util.Scanner;

public class ScannerTest {
	//자바 프로그램 실행 시 반드시 필요한 것 (시작점)
	// => main 메소드
	public static void main(String[] atgs) {
		//2. 준비하기! (생성)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하이는 영어로?");
		
		//3. 사용하기!
		String str = sc.nextLine(); 
		//nextLine은 문자열로 입력받는 메소드
		
		//입력받은 값을 출력
		System.out.println(str);
		
		//4. 사용 완료 (자원 해제)
		sc.close(); // 생략 가능함!
	}

}
