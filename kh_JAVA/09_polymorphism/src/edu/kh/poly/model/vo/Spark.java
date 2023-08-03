package edu.kh.poly.model.vo;

public class Spark extends Car {	// 경차
	
	private  double discountOffer;	// 할인혜택
	
	
	public Spark() {} // super() 생략시 컴파일러가 자동으로 추가

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
}
