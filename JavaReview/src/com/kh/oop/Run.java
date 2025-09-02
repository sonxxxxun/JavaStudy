package com.kh.oop;

import com.kh.oop.model.BankTransfer;
import com.kh.oop.model.PaymentMethod;
import com.kh.oop.model.Toss;

public class Run {

	public static void main(String[] args) {
		// 결제 방식별 객체 생성
		Toss toss = new Toss();
		BankTransfer bt = new BankTransfer("213-123-3456");
		
		toss.process(1000);
		System.out.println();
		bt.process(3000);
		
		System.out.println();
		
		// 다형성 적용. 부모 타입으로 자식 객체들을 다루는 기술
		PaymentMethod pm1 = new Toss();
		PaymentMethod pm2 = new BankTransfer("412-3466-874");
		
		pm1.process(5000);
		System.out.println();
		pm2.process(7700);
		
		// ------------------------------------
		System.out.println("=======================");
		
		PaymentMethod[] methods = new PaymentMethod[4];
		
		//methods[0].process(1000);
		methods[0] = new Toss();
		methods[1] = new BankTransfer("123-1233-1233");
		methods[2] = toss;
		methods[3] = bt;
		
		//--------------
		for(int i=0; i<methods.length; i++) {
			methods[i].process(10000);
			System.out.println("=======================");
		}
		
		
	}

}











