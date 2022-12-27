package com.hw4.controller;

import com.hw4.model.vo.Member;

public abstract class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	public int getMemberCount() {
//		현재 회원 수를 나타내는
//		memberCount 변수값을 반환해주는
//		메소드
		return memberCount;
	}
	
	public Member[] getMem() {
//		현재 회원 객체 배열의 주소 값을
//		반환해주는 메소드
		return null;
	}
	
	public Member checkId(String userId) {
//		전달 받은 아이디가 mem 배열에
//		존재하는 경우 해당 아이디의 회원
//		정보를 반환해주는 메소드
//		(없을 경우 null 반환)
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getName().equals(userId)) {
				return mem[i];
			}else {
				return null;
			}
		}
		return null;
	}
	
	public void insertMember(Member m) {
//		전달 받은 회원 정보를 mem 배열에
//		추가해주는 메소드로 회원 등록 시
//		memberCount 1 증가
		mem[memberCount] = m;
		memberCount++;
	}
	
	public Member searchMember(int menu, String search) {
//		매개변수로 전달받은 menu에 따라
//		1인 경우 전달받은 search 문자열을
//		아이디로 검색, 2인 경우 이름으로
//		검색, 3인 경우 이메일로 검색하고 그
//		결과인 회원 객체 주소 값을 반환
		if( menu == 1 ) {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getUserId().equals(search)) {
					return mem[i];
				} else {
					return null;
				}
			}
		} else if( menu == 2 ) {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getName().equals(search)) {
					return mem[i];
				} else {
					return null;
				}
			}	
		} else {
			for(int i = 0; i < memberCount; i++) {
				if(mem[i].getEmail().equals(search)) {
					return mem[i];
				} else {
					return null;
				}
			}
		}
		return null;
	}
	
	public void updateMember(Member m, int menu, String update) {
//		전달받은 menu에 따라 전달받은
//		회원 m을 setter 메소드를 이용하여
//		menu가 1인 경우 비밀번호 수정,
//		2인 경우 이름 수정, 3인 경우
//		이메일을 수정하는 메소드
	}
	
	public void deleteMember(String userId) {
//		전달받은 아이디를 이용하여 검색 후
//		존재하는 경우 삭제해주는 메소드로
//		삭제 후 다음 인덱스 객체들의
//		정보를 한 칸씩 앞으로 이동시킴
//		(memberCount 1감소)
	}
	
	public abstract Member[] sortIdAsc();
//	객체배열을 아이디별 오름차순
//	정렬한 후 주소 값 반환
	
	public abstract Member[] sortIdDesc();
//	객체배열을 아이디별 내림차순
//	정렬한 후 주소 값 반환
	
	public abstract Member[] sortAgeAsc();
//	객체배열을 나이별 오름차순 정렬한
//	후 주소 값 반환
	
	public abstract Member[] sortAgeDesc();
//	객체배열을 나이별 내림차순 정렬한
//	후 주소 값 반환
	
	public abstract Member[] sortGenderDesc();
//	객체배열을 성별로 내림차순 정렬
//	(남여순) 한 후 주소 값 반환
}
