package edu.kh.poly.model.vo;

public class Tesla extends Car {	// 전기차
	// Car를 상속 받을 수 있도록 => extends Car(부모)
	
	private int batteryCapacity; // 배터리 용량
	
	
	// 기본생성자 단축키, ctrl + space + enter
	public Tesla() {
		super(); // Car 클래스의 생성자를 호출
	}
	
	// arl + shift + s -> o -> ↓ -> enter
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	@Override	// Car.toString()의 오버라이딩
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
		// super. : 부모클래스의 참조변수
	}
}
