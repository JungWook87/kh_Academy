package edu.kh.control.condition;
import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문.
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 * 
	 * [작성법]
	 * 
	 * switch(조건식){
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * case 결과값3 : 수행코드3; break;
	 * ...
	 * default : case를 모두 만족하지 않을 경우 수행하는 코드(==else)
	 *  
	 */
	
	public void ex1() {
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		String result;
		
		switch(num) {
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색";
		}
		
		System.out.println(result);
	}

	public void ex2() {
		
		// 봄 : 3,4,5
		// 여름 : 6,7,8
		// 가을 : 9,10,11
		// 겨울 : 12,1,2
		
		System.out.print("달 입력 : ");
		
		int month = sc.nextInt();
		
		String season;
		
		switch(month) {
		case 3, 4, 5 : season = "봄"; break;
		case 6, 7, 8 : season = "여름"; break;
		case 9, 10, 11 : season = "가을"; break;
		case 12, 1, 2 : season = "겨울"; break;
		default : season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
	}

	public void ex3() {
		
		// 연산자(+ - * / %)
		// 정수 1 : 5
		// 정수 2 : 10
		// 연산자  : *
		// 계산결과 : 5 * 10 = 50
		
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
	
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
	
		System.out.print("연산자 입력 : ");
		String op = sc.next();

		switch(op) {
		case "+" : System.out.printf("계산결과 : %d + %d = %d", num1, num2, num1+num2); break;
		case "-" : System.out.printf("계산결과 : %d - %d = %d", num1, num2, num1-num2); break;
		case "*" : System.out.printf("계산결과 : %d * %d = %d", num1, num2, num1*num2); break;
		case "/" :
			if(num2==0) {
				System.out.println("계산 불가"); break;
			} else {
				System.out.printf("계산결과 : %d / %d = %d", num1, num2, num1/num2); break;
			}
		default : System.out.printf("계산결과 : %d % %d = %d", num1, num2, num1%num2); 	
		}
	}
}
