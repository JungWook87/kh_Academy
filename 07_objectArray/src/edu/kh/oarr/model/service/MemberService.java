package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	private Scanner sc = new Scanner(System.in);
	
	// Member 5칸짜리 객체 배열 선언 및 할당
	private Member[] memberArr = new Member[5];
	
	// 현재 로그인한 회원의 정보를 저장할 변수 선언
	
	private Member loginMember = null;
	
	public MemberService() { // 기본생성자
		// memberARr 배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user01", "111", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "222", "고길동", 25, "경기");
		memberArr[2] = new Member("user03", "333", "홍길순", 25, "인천");
		
	}
	
	// 메뉴 출력용 메서드
	public void displayMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("\n===== 회원 정보 관리 프로그램 v2 =====");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 검색(지역)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("\n메뉴 입력 >>> ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login());  break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : System.out.println(update());break;
			case 5 : System.out.println(searching()); break;
			case 0 : System.out.println("\n프로그램을 종료 합니다."); break;
			default : System.out.println("\n번호를 잘못 입력 하셨습니다.");
			}
			
		} while(menuNum != 0);
	}
	
	// 1) 회원가입
	public String signUp() {
		System.out.println("\n===== 회원 가입 =====");
		
		// 객체 배열(memberArr)에 가입한 회원 정보를 저장할 예정
		// -> 새로운 회원 정보를 저장할 공간이 있는지 확인하고
		//	  빈 공간의 인덱스 번호를 얻어오기 -> 새로운 매서드 작성
		
		int index = emptyIndex(); // memberArr 배열에서 비어있는 인덱스를 반환 받음
		
		System.out.println("현재 회원 수 : " + index);
		
		if(index == -1) { // 비어있는 인덱스가 없을 경우 -> 회원 가입 불가
			return "회원 가입이 불가능 합니다.(인원 수 초과)";
		}
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] != null) {
				if(memberArr[i].getMemberId().equals(memberId)) {
					return "\n이미 존재하는 아이디 입니다.";
				}
			}
		}
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("지역 : ");
		String memberRegion = sc.next();
		
		
		if(memberPw.equals(memberPw2)) {
			// 멤버 객체를 생성해서 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, memberRegion);
			
			return "\n회원 가입 성공!!";
			
		} else {
			
			return "\n회원 가입 실패(비밀번호 불일치)";
			
		}
	}
	
	// memberArr의 비어있는 인덱스 번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없으면 -1 반환
	public int emptyIndex() {
		// 멤버 배열을 0번부터 배열의 끝까지 접근해서 참조하는 값이 null인 경우
		// 인덱스를 반환하기
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				return i;
			} 
		}
		// for문을 수행했지만 return이 되지 않은 경우 해당 위치 코드가 수행!
		// for문에서 return 되지 않았다는 뜻은 배열에 빈칸이 없다는 뜻
		return -1;
	}
	
	// 2) 로그인
	public String login() {
		System.out.println("\n===== 로그인 =====");
		System.out.println();
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		// 1) memberArr 배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
		for(int i = 0; i < memberArr.length; i++) {
			
			// 회원 정보가 있을 경우
			if(memberArr[i] != null) {
				
				// 2) 회원정보(memberArr[i])에 아이디, 비밀번호와 
				//    입력받은 아이디, 비밀번호가 같은지 확인
				if(memberArr[i].getMemberId().equals(id)) {
					
					if(memberArr[i].getMemberPw().equals(pw)) {
						
						// 3) 로그인 회원 정보 객체(Member)를 참조하는 변수 loginMember에
						//    현재 접근 중인 memberArr[i] 요소에 저장된 주소를 얕은 복사
						loginMember = memberArr[i];
						
						return "\n환영합니다." + memberArr[i].getMemberName() + "님";
					
					} else {
						
						return "\n비밀번호가 틀렸습니다.";
					
					}
				}
			}
		}
		// 4) 로그인 성공 혹은 실패에 따른 결과값 반환
		return "\n아이디가 존재하지 않습니다.";
	}

	// 3) 회원정보조회
	public String selectMember() {
		
		System.out.println("\n===== 회원 정보 조회 =====");
		System.out.println();
		
		// 1) 로그인여부
		if(loginMember == null) {
			return "\n로그인 먼저 해주세요.";
		}
		
		// 2) 아이디, 이름, 나이, 지역
		String str ="";
		str = "\n현재 회원님의";
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "이름 : " + loginMember.getMemberName();
		str += "나이 : " + loginMember.getMeberAge() + "세";
		str += "거주지역 : " + loginMember.getRegion();
		str += "\n입니다.";

		return str;
	}
	
	// 4) 회원정보수정
	public String update() {
		
		System.out.println("\n===== 회원 정보 수정 =====");
		System.out.println();
		
		// 1) 로그인 여부
		if(loginMember == null) {
			return "\n로그인 먼저 해주세요.";
		}
		
		// 2) 수정내용 기입
		System.out.println("\n현재 회원님의");
		
		System.out.println("이름 : " + loginMember.getMemberName());
		System.out.print("변경할 이름 : ");
		String name = sc.next();
		
		System.out.println("나이 : " + loginMember.getMeberAge());
		System.out.print("변경할 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("거주지역 : " + loginMember.getRegion());
		System.out.print("변경할 거주지역 : ");
		String region = sc.next();
		
		// 3) 비밀번호 확인
		System.out.print("비밀번호를 입력해주세요 >>> ");
		String pw = sc.next();
		
		// 4) 성공시 이름 나이 지역 수정 후 완료 리턴
		if(loginMember.getMemberPw().equals(pw)) {
			
			loginMember.setMemberName(name);
			loginMember.setMeberAge(age);
			loginMember.setRegion(region);
			
			return "\n회원 정보 수정 완료!!";
		}
		// 5) 실패 리턴
		return "\n회원 정보 수정 실패 (비밀번호 불일치)";
	}
	
	// 5) 회원검색(지역)
	public String searching() {
		
		System.out.println("\n===== 회원 지역 검색 =====");
		
		// 1) 지역검색
		System.out.print("\n지역을 입력해 주세요 >>");
		String region = sc.next();
		
		boolean flag = false;
		String str = region + "에 사는 회원은 " ;
		
		// 2) 배열의 값 유무 확인
		for(int i = 0; i < memberArr.length; i++) {
			
			// 3) 값이 있으면 입력받은 지역과 일치여부 확인
			// 4) 일치하면 이름 더해주며 출력
			if(memberArr[i] != null) {
				if(memberArr[i].getRegion().equals(region)) {
					str += "\n" + "아이디 : " + memberArr[i].getMemberId() + ", " + "이름 : " +  memberArr[i].getMemberName() + " ";
					flag = true;
				}
			}
		}
		
		if(!flag) {
			System.out.println();
			return "일치하는 회원이 없습니다.";
		} else {
			System.out.println();
			return str;
		}
	}
}
