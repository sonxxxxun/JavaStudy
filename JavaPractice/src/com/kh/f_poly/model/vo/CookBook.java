package com.kh.f_poly.model.vo;

public class CookBook extends Book {
	
	private boolean coupon; 	// 요리학원 쿠폰 유무
	
	public CookBook() {}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		this.coupon = coupon;
	}
	@Override
	public String toString() {
		return "";
	}
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
