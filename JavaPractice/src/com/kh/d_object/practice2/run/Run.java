package com.kh.d_object.practice2.run;

import com.kh.d_object.practice2.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("객채지향의 사실과 오해");
		b1.setPublisher("조영호");
		b1.setAuthor("위키북스");
		b1.setPrice(25000);
		b1.setDiscountRate(0.1);
		
		b1.introduse3();
		
		Book b2 = new Book("클린 코드", "로버트 C. 마틴", "인사이트");
		b2.setPrice(38000);
		b2.setDiscountRate(0.15);
		b2.introduse3();
		
		Book b3 = new Book("실용주의 프로그래머", "앤드류 헌트, 데이비드 토마스", "인사이트", 35000,0.15);
		b3.introduse3();
		
	}

}
