package edu.kh.poly.practice.model.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Employee;
import edu.kh.poly.practice.model.vo.Person;
import edu.kh.poly.practice.model.vo.Student;

public class PersonService implements QuestionInterface {
	Scanner sc = new Scanner(System.in);

	@Override
	public void displayMenu() {
		
		int num = 0;
		
		do {
			
		System.out.print("번호를 누르세요 >>>>");
		System.out.println("1. 모든 요소 출력");
		System.out.println("2. 학생 정보만 출력");
		System.out.println("3. 직원 정보만 출력");
		System.out.println("4. 정보 찾기(이름)");
		System.out.println("5. 모든 사람의 나이 (합/최고/최저) 출력");
		System.out.println("6. 입력 인덱스 삭제");
		System.out.println("7. 학생 or 직원 등록");
		System.out.println("0. 프로그램 종료");
		num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : break;
		case 2 : break;
		case 3 : break;
		case 4 : break;
		case 5 : break;
		case 6 : break;
		case 7 : break;
		case 0 : System.out.println("프로그램을 종료 합니다."); break;
		default : System.out.println("번호를 잘못 입력하셨습니다.");
		}
		
		} while(num != 0);
	}

	@Override
	public void insertPerson() {
		
		Person s = new Student();
		Person e = new Employee();
		
		Person[] pArr = new Person[10];
		
		int num = 0;
		
		do {
			
		System.out.println("==== 등록 ====");
		System.out.print("번호를 누르세요 >>>>");
		System.out.println("1. 학생등록(이름, 나이, 학년, 반 입력)");
		System.out.println("2. 직원등록(이름, 나이, 회사명 입력)");
		System.out.println("3. 뒤로가기");
		num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] != null) continue;
			else {
				if( num == 1 ) {
					pArr[i] = new Student(null, i, num, i);
				} else if( num == 2 ) {
					pArr[i] = new Employee(null, i, null);
				}
			}
		}
		
		switch(num) {
		case 1 : System.out.println("학생 등록 완료"); break;
		case 2 : System.out.println("직원 등록 완료"); break;
		case 3 : System.out.println("전 메뉴로 갑니다."); break;
		default : System.out.println("번호를 잘못 입력하셨습니다.");
		}
		
		} while (num != 3);
		
	}

	@Override
	public void selectAll() {
		
	}

	@Override
	public void selectStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person serchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}

}
