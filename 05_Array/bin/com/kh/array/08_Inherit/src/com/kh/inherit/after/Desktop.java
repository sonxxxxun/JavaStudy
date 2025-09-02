package com.kh.inherit.after;

// Product 클래스로부터 상속 받기! -> extends
public class Desktop extends Product {
	// * 부모클래스에서 받지 않은 정보는 추가적으로 따로 정의!
	private boolean allInOne;
/*
 * 	public Desktop(){
 * 		super();   // 부모클래스의 기본생성자 호출.
 *  }
 */
	// 매개변수 5개인 생성자 => 부모클래스(Product)로부터 4개 필드
	//					   자식클래스(Desktop) 1개 필드를 정의
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price); // => 부모클래스의 매개변수가 4개인 생성자를 호출!
		this.allInOne = allInOne;
	}
	
	//* information():String -> 부모클래스에 정의되어 있음!
	@Override
	public String information() {
		return super.information() + ", allInOne: " + allInOne;
	// Stting.format("%s, allInOne: %b, super.information(), allInOne");
	}
	
	//* allInOne 필드에 대한 getter/setter
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
}
















