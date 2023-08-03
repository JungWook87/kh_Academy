package com.kh.test.money.model.vo;

public class Money {
	
	// 필드
	// 클래스 다이어그램에 변수명이 대문자->상수로 해라, 밑줄은 static을 써라이다.
	public final static String UNIT = "원";
	private int money;
	
	//생성자
	public Money() {};
	public Money(int money) {
		this.money = money;
	}

	//메소드
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public static String getUnit() {
		return UNIT;
	}
	
	public void print() {
		System.out.println(money + UNIT);
	}
	
}

