package edu.kh.oop.cls.model.vo;

public class User {
	// 필드
	// == 속성
	
	// 아이디, 비밀번호, 이름, 나이, 성별  -> 추상화 진행

	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	// 생성자
	// 기본생성자, [접근제한자] 클래스명(){}
	public User() {
		//기능
		System.out.println("기본 생성자로 User 객체 생성");		

		// 필드 초기화 진행됨 + 기능
		userId = "user01";
		userPw = "pass01";
		userName = "김정욱";
		userAge = 20;
		userGender = 'M';
		
	}
	
	// 매개변수 생성자
	// ** 사용되는 기술, 변수 : 매개변수, Overloading(오버로딩), this
	
	// ** 매개변수 : 생성자나 매서드 호출 시() 안에 작성되어 전달되어지는 값을 저장하는 변수
	//	-> 전달 받은 값을 저장하고 있는 매개체(지니고있는) 역할의 변수
	
	public User(String userId, String userPw) {
					   // test    // pw1234
		this.userId = userId;
		this.userPw = userPw;
	}
	
	// 메서드
	// 캡슐화로 인한 간접 접근 기능(getter/setter)
	public String getUserId() { // userId의 getter
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public char getUserGender() {
		return userGender;
	}


	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	
	// getter/setter 자동완성
	// alt + shift + s -> Generate Getters and Setters
}
