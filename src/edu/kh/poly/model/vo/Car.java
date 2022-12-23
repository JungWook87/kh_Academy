package edu.kh.poly.model.vo;

public class Car /*extends Object*/ {
	
	// 자동차라면 가지고 있는 것?
	
	private String engine;	// 엔진
	private String fuel;	// 연
	private int wheel;		// 바퀴수
	
	public Car() {
		super(); // 부모생성자(Object)
		// 안적으면 컴파일러가 자동으로 만들어준다
	}
	
	// 자동완성 : alt + shift + s -> o -> enter
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	
	// getter / setter
	// 자동완성 : alt + shift + s -> r -> (tab -> space -> shift tab -> enter)
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	//Object 클래스의 toString을 오버라이딩
	@Override // 어노테이션, 컴파일러에게 오버라이드 했다는걸 알림
	public String toString() {
		return engine +" / " + fuel + " / " + wheel;
	}
	
}
