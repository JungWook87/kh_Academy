package edu.kh.oarr.model.vo;

public class Member {
	
	// 필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int meberAge;
	private String region; // 지역(서울, 경기, 충북, 전남..)
	
	// 생성자
	// 생성자 규칙 
	// 1. 생성자명과 클래스명이 동일해야 한다
	// 2. 반환형이 없다
	public Member() {} // 기본생성자
	
	// 매개변수 생성자
	public Member(String memberId, String memberPw, String memberName, int meberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.meberAge = meberAge;
		this.region = region;
	}

	// 메서드
	// getter / setter
	
	/* 다 접근 가능하도록 public
	 * String 자료형 돌려보내겠다
	 * 매개변수가 없어서 중복된 이름의 memberId가 없기 때문에 memberId라고만 써도 ok
	 */
	public String getMemberId() {
		return memberId;
	}
	
	/* setter는 말 그대로 셋팅하는 애
	 * 무서을 셋팅할지 전달받아올 아이가 필요합니다!! => 매개변수
	 * setter는 보통 반환 값이 없다 => void
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		// return;
		// 모든 메서드는 종료 시 호출한 곳으로 돌아가기 return 구문이 작성되어야 하지만
		// 단, void일 경우 생략 가능하다. -> 생략 시 컴파일러가 자동 추가 
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMeberAge() {
		return meberAge;
	}

	public void setMeberAge(int meberAge) {
		this.meberAge = meberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
