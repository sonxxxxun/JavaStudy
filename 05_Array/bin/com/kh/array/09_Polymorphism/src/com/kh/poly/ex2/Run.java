package com.kh.poly.ex2;

public class Run {
	
	public static void main(String[] args) {
		//[1] 부모타입 참조변수로 부모 객체를 다루는 경우
		Car c1 = new Car("Red", "가솔린", 2024);
		// Car -----------> Car
		//*color			*color
		//*fuel				*fuel
		//*year				*year
		//*drive()			*drive()
		c1.drive();
		
		//[2] 자식타입 참조변수로 자식 객체를 다루는 경우
		BMW c2 = new BMW("Purple", "고급휘발유", 2025);
		// BMW -----------> BMW
		//*color			*color
		//*fuel				*fuel
		//*year				*year
		//*drive()			*drive()
		//*moveBMW()		*moveBMW()
		c2.drive();
		c2.moveBMW();
		
		System.out.println("======================================");
		
		//[3] 부모타입 참조변수로 자식 객체를 다루는 경우
		Car c3 = new Genesis("Black", "경유", 2020);
		// Car -----------> Genesis
		//*color			*color			
		//*fuel				*fuel
		//*year				*year
		//*drive()			*drive()
		//					*moveGenesis()
		c3.drive();
		// c3.moveGenesis(); => 오류!!
		((Genesis)c3).moveGenesis();
		//=> 자식객쳉의 멤버에 접근하고자 한다면, 
		//강제형변환 후 접간 가능!! => "다운캐스팅"
		//------------------------------------------------------
		/*
		 * * 다형성 : 부모 타입으로부터 파생된 자식 객체들을
		 * 			부모 타입 하나로 다룰 수 있는 기술!
		 * 
		 * 	- 장점 : 하나의 부모 타입만으로 여러 자식 객체들을 다룰 수 있어
		 * 			"편리"하고 "고드 길이 감소" 됨!
		 * 
		 * * 클래스 간의 형변환 (* 상속 관계에서만 가능*)
		 *	- 업캐스팅( Up Casting )
		 *	: 자식타입 -> 부모타입 형변환 (자동 형변환)
		 *		ex) Car c3 = (Car)new Genesis();
		 *
		 * 	- 다운캐스팅( Down Casting )
		 *	: 부모타입 -> 자식타입 형변환 (강제 형변환)
		 *		ex) ((Genesis)c3).moveGenesis();
		 *
		 * * 동적 바인딩
		 * 	: 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩됨!
		 * 	  실질적으로 참조하는 자식 객체에 해당하는 메소드가 "오버라이딩" 되면서
		 * 	  프로그램 실행 시 동적으로 해당 메소드를 찾아서 실행!
		 */
		
		System.out.println("======================================");
		
		// * 다향성 적용 전 *
		BMW[] lArr = new BMW[3];  // BMW 객체들만 담을 수 있음!
		lArr[0] = new BMW("Purple", "고급휘발유", 2025);
		
		Genesis[] gArr = new Genesis[3];
		gArr[0] = new Genesis("Red", "경유", 2020);
		
		for(BMW bmw : lArr) {
			if (bmw != null) {
				bmw.drive();
			}
			
		}
		
		for(Genesis gen : gArr) {
			if (gen != null) {
				gen.drive();	
			}
			
		}
		
		System.out.println("======================================");
		
		// * 다향성 적용 후 *
		Car[] cArr = new Car[6];
		cArr[0] = new Car("White", "휘발유", 2001);
		cArr[1]	= new BMW("Purple", "고급유", 2025);
		cArr[2]	= new Genesis("Black", "경유", 2023);
		
		for(Car c : cArr) {
			
			if(c !=null) {
				c.drive();
				
				System.out.println("======================================");
				
				// 해당 클래스 타입으로 생성된 인스턴스(객체)인지 확인!
				if (c instanceof BMW) {
					((BMW)c).moveBMW();
				} else if (c instanceof Genesis) {
					((Genesis)c).moveGenesis();
				}		
			
			}
			
		}	
		
	}
	
}



















