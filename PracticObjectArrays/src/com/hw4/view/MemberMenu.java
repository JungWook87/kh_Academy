package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	
	private MemberController mc = new MemberController() {
		
		@Override
		public Member[] sortIdDesc() {
			return null;
		}
		
		@Override
		public Member[] sortIdAsc() {
			return null;
		}
		
		@Override
		public Member[] sortGenderDesc() {
			return null;
		}
		
		@Override
		public Member[] sortAgeDesc() {
			return null;
		}
		
		@Override
		public Member[] sortAgeAsc() {
			return null;
		}
	};
	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		//반복문을 이용하여 메인메뉴를 반복적으로 시행
		// 각 메뉴별 서브메뉴 호출
		int input = 0;
		
		do {
			
			System.out.println("===== 회원 관리 메뉴 =====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호를 누르세요 >>>");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램을 종료 합니다."); break;
			default : System.out.println("번호를 잘못 누르셨습니다.");
			}
			
		}while(input != 0);
	}
	
	public void insertMember() {
		// 회원에 대한 정보를 입력받고 동일한 아이디가 없는 경우 
		// MemberController의 insertMember 메소드 실행
		
		if(mc.getMemberCount() == mc.SIZE ) {
			System.out.println("회원이 다 찼습니다.");
		} else {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			sc.nextLine();
			
			if(mc.checkId(id) != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			} else {
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				sc.nextLine();
				System.out.print("비밀번호 다시 입력 : ");
				String pw2 = sc.next();
				sc.nextLine();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				sc.nextLine();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.print("성별 입력 : ");
				char gender = sc.next().charAt(0);
				sc.nextLine();
				System.out.print("이메일 입력 : ");
				String email = sc.next();
				sc.nextLine();
				
				if(pw.equals(pw2)) {
					Member m = new Member(id, pw, name, age, gender, email);
					mc.insertMember(m);
					System.out.println("성공적으로 회원 등록이 되었습니다.");
				} else {
					System.out.println("비밀 번호 오류");
				}
			}
		}
	}
	
	public void searchMember() {
		//메뉴에서 2번 선택시 실행 -> 반복실행
		//각 서브메뉴에 해당하는 검색 내용을
//		입력 받고 MemberController의
//		searchMember 메소드 실행
		int input = 0;
		while(true) {
			
			System.out.println("===== 회원 정보 검색 =====");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			if(menu == 9 ) break;
			System.out.print("검색 내용 : ");
			String search = sc.next();
			sc.nextLine();
			
			if(mc.searchMember(menu, search) != null) {
				System.out.println(mc.searchMember(menu, search).information());
			} else {
				System.out.println("검색된 결과가 없습니다.");
			}
		}
	}
	
	public void updateMember() {
//		메인 메뉴에서 3번 선택시 실행되는
//		서브메뉴 → 반복실행
//		각 서브메뉴에 해당하는 수정할
//		내용을 입력 받고
//		MemberController의
//		updateMember 메소드 실행
	}
	
	public void deleteMember() {
//		메인 메뉴에서 4번 선택시 실행되는
//		메소드이며 삭제할 회원 아이디를
//		입력 받고 MemberController의
//		deleteMember 메소드 실행
	}
	
	public void printAllMember() {
//		메인 메뉴에서 5번 선택시 실행되는
//		메소드이며 MemberController의
//		getMem 메소드 실행의 결과 값을
//		반복문을 통해 출력
	}
	
	public void sortMember() {
//		메인 메뉴에서 6번 선택시 실행되는
//		서브메뉴 → 반복실행
//		각 서브메뉴에 해당하는
//		MemberController의 정렬
//		메소드들을 실행함으로써 그 결과
//		값으로 반복문을 통해 출력
	}
}
