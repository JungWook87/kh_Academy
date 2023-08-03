package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {	// 클래스
	// 속성(필드)
	// 필드는 기본적으로 캡슐화 원칙에 의해 private이라는 접근제한자를 꼭 작성
	// 필드에 변수를 하나 작성하면, 클래스 안에서 어디에서든 사용 가능.
	
	private Scanner sc = new Scanner(System.in);
								// Sytem.in : 자바에서 기본적으로 지정해둔 입력장치(키보드)
	
	private Member memberInfo = null;		// 가입한 회원의 정보를 저장할 변수
	private Member loginMemeber = null;		// 로그인한 회원의 정보를 저장할 변수
	
	// 기능(생성자, 메서드)
	// ** 여러기능을 하나의 메소드에 모두 작성하지 말 것!
	// 되도록 하나의 기능만 수행하도록 작성
	// 메소드는 메소드당 딱 하나의 기능만 가지고 있는게 좋다.
	
	// 왜??
	// 기능별로 세분화 해놔야 필요한 기능만 호출하여 쓸 수 있다.
	
	/*public void today() {
		// 밥 먹는 행위
		// 일 하는 행위
	}
	public void eat() {}
	public void work() {}
	두가지를 나눠서 만들어야 필요한 행위 하나씩 불러서 쓸 수 있다.*/
	
	public MemberService() {}
	//public MemberService(Member a, Member b) {}
	// 기본생성자 미작성시 Run에서 에러
	
	// ** 메서드 작성법 **

	// [접근제한자]	[예약어]			반환형				메서드명([매개변수]) {}
	// public		static			기본자료형
	// protected	final			참조형(배열, 클래스)
	// (default)	abstract		void
	// private		static final
	
	// ** 반환형 void **
	// - 반환(return)이란?? 메서드 수행 후 호출부로 돌아가는 것
	// - 반환 값 : 메서드가 수행되면서 가져갈 결과 값
	// - 반환 형 : 반환 값의 자료형
	// -> void(텅빈, 없는, 무효의) : 반환 값이 없다.
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		// 일은 하는데 결과값이 없다.
		int menuNum = 0; // 지역변수
		
		do {
			System.out.println("======= 회원 정보 관리 프로그램 =======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >>> ");
			menuNum = sc.nextInt();		// 필드에 작성된 Scanner sc를 사용
			sc.nextLine();				// 입력 버퍼에 남은 개행문자 제거
			
			System.out.println();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				// 회원 정보 수정 메서드 수행 후 반환되는 결과를 result 변수에 저장 후 사용
				int result = updateMember(); // -1 or 1 or 0
				
				if(result == -1) {
					System.out.println("로그인 후 이용해주세요");
					System.out.println();
				} else if(result == 0) {
					System.out.println("회원 정보 수정 실패(비밀번호 불일치)");
					System.out.println();
				} else {
					System.out.println("회원 정보가 수정되었습니다");
					System.out.println();
				}
				break;
			case 0 : System.out.println("프로그램을 종료 합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다. 다시 입력 바랍니다.");
			}
		} while(menuNum != 0); // menuNum이 0 이면 종료
	}
	
	// 회원 가입 기능
	public String signUp() {
		System.out.println("***** 회원 가입 *****");
		System.out.println();
		
		System.out.print("ID : ");
		String memberId = sc.next();
		
		System.out.print("PW : ");
		String memberPw = sc.next();
		
		System.out.print("PW 확인 : ");
		String memberPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원 가입 실패
		if(memberPw.equals(memberPw2)) { 	// 일치하는 경우 true라서 실행
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			System.out.println();
			return "회원 가입 성공!!\n";
		} else {
			System.out.println();
			return "회원 가입 실패!!(비밀번호 불일치)\n";
		}
	}
	
	// 로그인 메서드(기능)
	public String login() {
		System.out.println("***** 로그인 *****");
		System.out.println();
		
		// 회원 가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인
		
		if(memberInfo == null) {
			return "회원 가입부터 진행하세요\n";
		}
		
		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		if( memberId.equals(memberInfo.getMemberId()) && 
			memberPw.equals(memberInfo.getMemberPw()) ) {
			
			loginMemeber = memberInfo;
			
			System.out.println();
			return loginMemeber.getMemberName()+"님 환영합니다\n";
		} else {
			System.out.println();
			return "아이디 또는 비밀번호가 일치하지 않습니다.\n";
		}
		
	}
	
	// 회원 정보 조회 기능
	// 아이디, 이름, 나이
	
	// CRUD ( C:Create R:Read U:update D:Delete )
	public String selectMember() {
		System.out.println("***** 회원 정보 조회 *****");
		System.out.println();
		
		// 손코딩
		// 1) 로그인 여부 확인 -> 필드 loginMemeber가 참조하는 객체가 있는지 확인
		// 2) 로그인이 되어있는 경우
		//	 회원 정보를 출력할 문자열을 만들어서 반환(return)
		//	 단, 비밀번호는 제외
		
		// 1) 로그인 여부 확인
		if(loginMemeber == null) {
			return "로그인부터 진행하세요\n";
		}
		
		String str = "이름 : " + loginMemeber.getMemberName();
		str += "\nID : " + loginMemeber.getMemberId();
		str += "\nAge : " + loginMemeber.getMemberAge();
		return str;
	}
	
	// 회원 정보 수정(update) 기능
	public int updateMember() {
		System.out.println("***** 회원 정보 수정 *****");
		System.out.println();
		
		// 1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1 반환
		if(loginMemeber == null) {
			return -1;
		}
		
		// 2) 수정할 회원 정보 입력 받기(이름, 나이)
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		sc.nextLine();	// sc.nextLine() 을 제외하고는 다른 입력메서드들은 개행을 제거해줄 필요가 있다.
		
		// 3) 비밀번호 입력 받아서
		//	  로그인한 회원의 비밀번호와 일치한지 확인
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		// 4) 비밀번호가 같은 경우
		//	  로그인한 회원의 이름, 나이 정보를 입력받은 값으로 변경 후
		//	  1 반환
		if( inputPw.equals( loginMemeber.getMemberPw() ) ) {
			loginMemeber.setMemberName(inputName);
			// 입력 받은 inputName을
			// loginMember가 참조하는 Member 객체의 필드 memberName에 대입
			loginMemeber.setMemberAge(inputAge);
			
			return 1;
		} else {
		// 5) 비밀번호가 다른 경우 0 반환
			return 0;
		}	
		
	}
	
}
