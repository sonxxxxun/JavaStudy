package com.kh.d_object.practice1.run;

import com.kh.d_object.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p1 = new Product("아이폰 16", 1000000, "애플");
			
		/*p1.setProductName("아이폰 16");
		p1.setPrice(1000000);
		p1.setBrand("애플");
		*/
		p1.introduse();
			
		Product p2 = new Product("갤럭시 S25", 1100000, "삼성");
		/*
		p2.setProductName("갤럭시");
		p2.setPrice(10000);
		p2.setBrand("삼성");
		*/
		p2.introduse();

	}
	
}


