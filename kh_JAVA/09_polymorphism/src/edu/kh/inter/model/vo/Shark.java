package edu.kh.inter.model.vo;

public class Shark extends TypePisces implements WaterLife, Test{

	@Override
	public void swimming() {
		System.out.println("상어가 수영한다");
	}

	@Override
	public void eat() {
		System.out.println("상어가 밥을 먹는다");
	}

	@Override
	public void cry() {
		System.out.println("상어가 소리를 낸다");
	}

	@Override
	public void move() {
		System.out.println("상어가 움직인다");
	}

	@Override
	public void water() {
		System.out.println("상어는 물에서 가장 쌥니다");
	}

	@Override
	public void test() {
		System.out.println("상어 Test");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}
