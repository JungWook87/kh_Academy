package edu.kh.poly.practice.model.vo;

public class Student extends Person {
	
	private int grade;
	private int classRoom;
	
	public Student() {
	}

	public Student(String name, int age, int grade, int classRoom) {
		super(name, age);
		this.grade = grade;
		this.classRoom = classRoom;
	}

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
	
	
	
	
}
