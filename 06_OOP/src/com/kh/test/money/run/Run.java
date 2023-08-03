package com.kh.test.money.run;

import com.kh.test.money.model.vo.Money;
import com.kh.test.money.model.vo.Money2;

public class Run {

	public static void main(String[] args) {
		
		Money money1 = new Money(); 
		
		money1.setMoney(10000);
		
		money1.print();
		
		System.out.println();
		System.out.println("생성자가 없는 money2, 컴파일러가 자동으로 생산했다.");
		Money2 money2 = new Money2();
		
		money2.print();
	}

}
