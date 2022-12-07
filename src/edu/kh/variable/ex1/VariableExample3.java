package edu.kh.variable.ex1;

public class VariableExample3 {

	public static void main(String[] args) {
		
		/* 형변환 (Casting) : 값의 자료형을 변환하는 것(boolean 제외)
		 * 
		 *  ** 형변환이 필요한 이유
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능
		 * 다른 자료형끼리 연산시 오류
		 * --> 이런 상황을 해결하기 위한 것이 형변환
		 * 
		 * [자동 / 강제]형변환 존재
		 * 
		 * */
		
		//자동 형변환
		// - [값의 범위]가 큰자료형과[값의 범위]가 작은자료형 연산 시
		// 작은 자료형 -> 큰 자료형
		// 컴파일러에 의해 자동적으로 변환되는 것

		int num1 = 10;
		double num2 = 3.5;
		System.out.println(num1 + num2);
		// 원래 에러나야되는데 컴파일러가 자동형변환해줌
		
		int i1 = 3;
		double d1 = i1; // double은 실수만 저장될 수 있는 자료형
						// 정수가 대입되는 연산이 수행되면
		
		System.out.println(i1); //3
		System.out.println("d1= "  + d1); //3.0
		
		System.out.println(d1 + num2); // double + double = 6.5
		
		//char 문자형 자료형
		//char 자료형은 문자형이지만 실제 저장하는 값은
		// 0부터 65000사이에 있는 숫자
		char ch = 'V';
		int i3 = ch; // int 변수 = char값
					 // int 자동형변환
		
		System.out.println(i3);
		
		char ch1 = '하';
		int i4 = ch1;
		System.out.println(i4);
		
		
	}
}
