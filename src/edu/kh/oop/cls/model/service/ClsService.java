package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;

public class ClsService {
	// 클래스 접근제한자 확인하기
	
	public void ex1() {
		Student std = new Student(); 
		// public class인 Student는 import 가능
		
		//TestVo test = new TestVO();
		// (default) class인 TestVO는 import 불가 (다른패키지 여서)
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러가 없다
	}
	
	public void ex2() {
		// static 필드 확인 예제
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schoolName);
		// public 이기 때문에 직접 가능
		//System.out.println(std1.name); //name이 private라서 접근x
		System.out.println(std1.getName());
		
		System.out.println(std2.schoolName);
		// public 이기 때문에 직접 가능
	}
}
