package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		// 1) 크기3 객체배열 생성 후 3개의 생성자 이용
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		
		// 2) 출력
		for(int i = 0; i < emp.length; i++) {
			System.out.print("emp[" + i + "] : " + emp[i].information() + "\n");
		}
		System.out.println("=======================================================");
		
		// 3) 빈 필드에 값 넣기
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		// 4) 출력
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		System.out.println("=======================================================");
		
		// 5) 직원 각각이 보너스가 적용된 연봉 계산후 출력
		// 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		int emp0 = ( emp[0].getSalary() + (int)(emp[0].getSalary() * emp[0].getBonusPoint() ) ) * 12;
		int emp1 = ( emp[1].getSalary() + (int)(emp[1].getSalary() * emp[1].getBonusPoint() ) ) * 12;
		int emp2 = ( emp[2].getSalary() + (int)(emp[2].getSalary() * emp[2].getBonusPoint() ) ) * 12;
		int avg = ( emp0 + emp1 + emp2 ) / 3;
		
		System.out.println("김말똥의 연봉 : " + emp0 + "원");
		System.out.println("홍길동의 연봉 : " + emp1 + "원");
		System.out.println("강말순의 연봉 : " + emp2 + "원");
		System.out.println("=======================================================");
		
		// 6) 총 직원 연봉의 평균 후 출력
		System.out.println("직원들의 연봉의 평균 : " + avg + "원");
		
	}

}
