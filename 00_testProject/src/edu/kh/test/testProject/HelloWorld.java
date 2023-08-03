package edu.kh.test.testProject;
	// package(관련된 코드들의 묶음) 명명 규칙
	// 1.최소 3레벨 이상
	// 2.프로젝트 주소의 기반(거꾸로)

// : 한 줄 주석
/* : 범위 주석
 * : 주석안의 코드는 컴파일 되지 않는다.
 */


public class HelloWorld {
	
	public static void main(String[] args) {
		// 실행 구문(메인메소드가 있어야 프로젝트 실행 가능)
		
		System.out.println("Hello World~!"); // 영문
		System.out.println("아침은 드셨나요?"); // 한글
		System.out.println("123456"); // 숫자
		
		// " "(쌍따옴표): 문자열을 나타냄
		// ==> 안에 작성된 텍스트(코드)는 단순 문자열로 인식
		
		System.out.println("1 + 2");
		System.out.println(1 + 2); //자바는 사칙연산의 규칙을 따른다.
		// " " 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		// ""(문자열) + 숫자 함께 작성
		System.out.println("14 * 19 = " + 266);
		// 숫자 + 숫자 = 실제 덧셈연산
		// 문자열 + 숫자 or 문자열 + 문자열은 이어쓰기가 된다.
		System.out.println("14 * 19 = " + 14 * 19);
		
		// notice!
		// 자바는 사칙연산의 우선수위를 그대로 따른다.
		// ex) 우선계산을 원하면 () 사용
		
		System.out.println("안녕? 날 보고있니?");
	}
}
