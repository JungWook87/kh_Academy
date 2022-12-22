package edu.kh.inheritance.model.vo;

public class Student extends Person {
	// extends
	// Student 클래스에 Person 클래스 내용을 확장한다.
	// == Student 클래스에 Person 클래스 내용(속성, 기능)이 추가됨.
	
	
	
	
	// 필드
//	private String name;
//	private int age;
//	private String nationality;
	
	private int grade;
	private int classRoom;
	
	
	// 생성자
	public Student() {
		// Student() 객체 생성시 
		// 내부에 상속받은 Person 객체를 생성하기 위한
		// Person 생성자 호출 코드가 필요하다
		super(); // super() 생성자 
		// Person 클래스의 기본생성자를 받아오는 코드. 부모의 생성자를 호출하는 코드
		// 반드시 자식 생성자의 최상단에 작성
		
		// *super() 생성자 미작성 시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌
		
	
		
	}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		super(name, age, nationality);	// super()가 의미하는 것은 결국 부모클래스의 기본생성자 또는 매개변수 생성자이다.
		this.grade = grade;
		this.classRoom = classRoom;
		
		// super() 생성자
		// 1. 자식 내 부모객체 생성
		// 2. 부모객체 생성시 초기화
	}

	
	// 메소드
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + grade + " / " + classRoom;
		// super 참조변수
		// super 즉 부모의 클래스인 person에서 작성된 toString의 내용을 가져온다
	}
}
