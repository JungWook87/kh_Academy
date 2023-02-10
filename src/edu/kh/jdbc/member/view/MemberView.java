package edu.kh.jdbc.member.view;

import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.member.model.service.MemberService;
import edu.kh.jdbc.member.vo.Member;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in); 
	
	private Member loginMember = null;
	MemberService service = new MemberService();
	
	
	/*
	회원기능 (Member View, Service, DAO, member-query.xml)
	 * 
	 * 1. 내 정보 조회(   selectMyInfo()   )
	 * 2. 회원 목록 조회(아이디, 이름, 성별) (  selectAll()  )
	 * 3. 내 정보 수정(이름, 성별)   (  updateMember()  )
	 * 4. 비밀번호 변경(현재 비밀번호, 새 비밀번호, 새 비밀번호 확인)  
(  updatePw()  )
	 * 5. 회원 탈퇴  (  secession()  )
	*/

	public Member memberMenu(Member loginMember) {
		this.loginMember = loginMember;
		
		int input = 0;
		
		do {
			System.out.println("===== 회원 기능 =====");
			System.out.println("1. 내 정보 조회");
			System.out.println("2. 회원 목록 조회");
			System.out.println("3. 내 정보 수정");
			System.out.println("4. 비밀번호 변경");
			System.out.println("5. 회원 탈퇴");
			System.out.println("0. 이전 화면으로");
			
			System.out.print("번호 입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : selectMyInfo(loginMember); break;
			case 2 : selectAll(loginMember); break;
			case 3 : updateMember(loginMember); break;
			case 4 : updatePw(loginMember); break;
			case 5 : 
				loginMember = secession(loginMember);
				if(loginMember.getSecessionFlag().equals("Y")) {
					input = 0;
				}
				break;
			case 0 : 
				loginMember.setSecessionFlag("N");
				System.out.println("이전화면으로 돌아갑니다.");
				break;
			default : System.out.println("제시된 번호만 입력해 주세요.");
			}
			
		}while(input != 0);
		
		return loginMember;
	}


	/** 내 정보 조회
	 * @param loginMember
	 */
	private void selectMyInfo(Member loginMember) {
		
		Member mem = service.selectMyInfo(loginMember);
		
		System.out.println(mem.toString());
		
	}


	/** 회원 목록 조회
	 * @param loginMember
	 */
	private void selectAll(Member loginMember) {
		
		List<Member> memList = service.selectAll(loginMember);
		
		for(Member temp : memList) {
			System.out.println(temp);
		}
	}


	/** 내 정보 수정(이름, 성별)
	 * @param loginMember
	 */
	private void updateMember(Member loginMember) {
		
		System.out.println("===== 내 정보 수정 =====");
		
		System.out.print("이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("성별 입력 : ");
		String inputGender = sc.next().toUpperCase();
		
		int result = service.updateMember(loginMember, inputName, inputGender);
		
		if(result > 0) System.out.println("수정 성공");
		else System.out.println("수정 실패");
	}


	/** 비밀번호 변경(현재 비밀번호, 새 비밀번호, 새 비밀번호 확인) 
	 * @param loginMember
	 */
	private void updatePw(Member loginMember) {
		
		int result = 0;
		
		System.out.println("===== 비밀번호 변경 =====");
		
		System.out.print("현재 비밀번호 : ");
		String inputPw = sc.next();
		
		Member mem = service.selectMyInfo(loginMember);
		
		if(inputPw.equals(mem.getMemberPw())){
			System.out.print("변경할 비밀번호 : ");
			String pw1 = sc.next();

			System.out.print("비밀번호 확인 : ");
			String pw2 = sc.next();
			
			if(pw1.equals(pw2)) {
				result = service.updatePw(loginMember, pw1);
			}
			
			if(result > 0) System.out.println("변경 성공");
			else System.out.println("변경 실패");
			
		} else System.out.println("비밀 번호가 일치하지 않습니다.");
		
	}

	
	/** 회원 탈퇴
	 * @param loginMember
	 * @return mem
	 */
	private Member secession(Member loginMember) {
		Member mem = loginMember;
		
		System.out.println("===== 회원 탈퇴 =====");
		System.out.print("정말 탈퇴 하시겠습니까??(Y/N) : ");
		String input = sc.next().toUpperCase();
		
		if(input.equals("N")) {
			System.out.println("탈퇴를 중지합니다");
		}else {
			int result = service.secession(loginMember);
			if(result == 0) System.out.println("탈퇴에 실패 했습니다");
			else {
				System.out.println("탈퇴 했습니다");
				mem.setSecessionFlag("Y");
			}
		}
		
		return mem;
	}

}

// 선생님 방식
/*
 * 메인뷰에서 회원기능으로 매개변수 받아서 작성하였는데 메인뷰에 있는 static loginMemeber를 사용하면 다른 클래스에서 정보 수정해도 
 *  값이 수정되므로 로그아웃 문제 해결 가능
 * 
 * 회원 정보 조회 => DB로 가지 않고 getter로 정보 불러와 출력
 * 
 * DAO로 보내는 변수에 loginMember 객체를 다 보내지 않고, getter로 memberId만 추출하여 매개변수로 삼았다
 * 
 * 내정보 수정 =>
 * 성별 입력시 올바른 값이 들어올 때까지 while문으로 돌리기 
 * DB에서 정보 수정 후 성공여부 조건문 걸고 setter를 이용하여 loginMember 객체의 업데이트된 정보 수정. 이때에 setter 매개변수는 사용자 입력값으로
 * 
 * 비밀번호 변경
 * 새비밀번호 와 비밀번호 확인이 일치할 때 까지 돌려야 함으로 while. 변수 선언은 while문 밖에서 선언
 * 그리고 현재 비밀번호 확인 후 업데이트를 진행하는 게 아니라 현재비밀번호와 변경 비밀번호를 모두 DB로 보내고 DB 수정 구문에서 조건으로 회원NO와 현재비밀번호를 넘긴다
 * 
 * 회원 탈퇴
 * 현재 비밀번호 받기,
 * 탈퇴여부 묻기 y 또는 n 받을 때까지 반복문 돌기 if(y) else if(n) else(잘못입력)
 * 
 * 
 */

