package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/* NOTICE
		 * 
		 * double pi = 3.14....
         * double pi;
		 *	차이점 => 
		 *	double pi는 선언만
		 *	pi = 3.14 변수 초기화
		 *  char = 1byte+1byte //한글
		 * 
		 * 상수 = 변하지 않는 값
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		/* 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * */
		
		// 변수선언: 매모리에 값을 저장할 공간을 할당 하는 것
		// 변수 값 대입 : 변수에 값을 집어 넣는 것
		
		boolean booleanData;
		// 메모리에 논리 값(t/f)을 저장할 공간 1byte 할당하고
		// 할당된 공간을 booleanData라고 부르겠다
		
		booleanData = true;
		// = ; 대입연산자 ==> 오른쪽에 있는 값을 왼쪽에 대입
		System.out.println("booleanData: " + booleanData);
		
		byte byteNumber = 127;
		/* 메모리에 정수값을 저장할 공간 1byte 할당하고
		 * 할당된 공간을 byteNumber라고 부름
		 * 선언된 byteNumber 변수에 처음으로 127을 넣음
		 * --> 초기화 : 처음 변수에 값을 대입
		 * 
		 * 
		 * */
		System.out.println("byteNumber: " + byteNumber);
		
		short shortNumber = 32767; //변수 선언 및 초기화
		// 정수 자료형의 기본형(short, byte 옛날 코드들의 잔재)
		int intNumber = 2147483647; // 변수 선언 및 초기화
		// 자료형 변수형 = 리터럴;
		// 프로그래밍에서는 대입되는 데이터를 리터럴이라는 단어로도 표현
		
		// **리터럴 : 변수에 대입되거나 작성되는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000l; //소문자 대문자 상관x 숫자범위내에서는 l안써도 ㅇㅋ
		// The literal 10000000000 of type int is out of range
		// 100억 이라는 값은 범위를 벗어남
		// 뒤에 L을 붙여줌으로써 long 자료형인것을 나타냄
		
		float floatNumber = 1.2345f; // 소문자 대문자 상관x f안쓰면 double로 인식
		double doubleNumber = 3.141592;
		// d를 뒤에 쓸수는 있다 ==> 3.141592d;
		// 실수형은 float, double 두개밖에없어서
		// 자바는 double을 리터럴 안붙이고 쓰는애로 정함
		
		//문자형 리터럴 표기법 : ' ' (홀따옴표)
		// -> 문자 하나
		char ch = 'A'; //65
		char ch2 = 66; //B (유니코드)
		String str = "ssrsr"; 
		
		System.out.println(ch2);
		
		/* char 자료형에 숫자가 대입될 수 있는 이유
		 * -컴퓨터에는 문자표 존재
		 * 숫자에 지정된 문자모양 매핑
		 * 'B' 문자 그대로 대입되면 숫자 66으로 변환저장
		 * --> 변수에 66숫자 저장하는것이 가능 
		 * 
		 * */
		
		//변수 명명 규칙
		// 1. 대소문자 구분함
		// 2. 길이제한 없음
		int asdadasdasdasd;
		
		// 2. 예약어 사용 x
		// float double;
		
		// 3. 숫자 시작 안됨
		// char 1abc;
		
		// 4. 특수문자 _ , $ 만 사용가능 (아무튼 안씀)
		// String da_d; 문제는 없다만 안씀
		int int_number; // 카멜표기법써서 _ 안씀
						// _ 작성은 DB에서 사용
		
		// 5. 카멜표기법
		// -> 변수명 작성 시 여러 단어를 이어서 작성하는 경우
		// 		띄어쓰지 않고 후속단어 대문자 작성
		char helloBanna;
		
		// 6. 변수명은 언어 안가림(영어쓰셈 그냥)
		int 정수;
		
		// -----------------------------------------------------
		
		int number = 10;
		System.out.println("number: " + number); //10
		
		number = 20;
		System.out.println("number: " + number); //20
		
		/* 상수(항상 같은 수)
		 * - 변수의 한 종류
		 * - 한번 값 대입되면 다른 값 대입 불가
		 * -  자료형 앞에 final 키워드를 작성(마지막 대입되는 값)
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러 단어 작성시 "_" 사용
		 * 
		 * - 상수를 사용하는 경우 
		 *  1) 변하면 안되는 고정된 값
		 *  2) 특정한 값에 의미 부여하는 경우
		 *  
		 * 
		 * */
		
		final double PI_VALUE = 3.14;
		//PI_VALUE = 2.3; <대입불가>
		
	}
}
