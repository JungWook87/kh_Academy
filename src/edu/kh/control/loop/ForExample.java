package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);
	
	/* for문
	 * - 끝이 정해져 있는(횟수가 정해져있는) 반복문
	 * - 조건에 따라 한번도 수행되지 않을 수 있음
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복 수행할 코드
	 *  }
	 *  
	 *  - 초기식 : for문을 제어하는 용도의 변수 선언
	 *  
	 *  - 조건식 : for문의 반복 여부를 지정하는 식 (다음 반복 진행해?)
	 *  		  보통 초기식에 사용된 변수를 이용하여 조건식을 작성함
	 *  
	 *  - 증감식 : 초기식에 사용된 변수를 
	 *  		  for문이 끝날 때 마다 증가 or 감소 시켜
	 *  		  조건식의 결과를 변하게 하는 식 
	 */
	
	public void ex1() {
		// 1~10 출력하기
		// -> 1부터 10까지 1씩 증가하며 출력
		// * 반복문은 조건식이 true일 때만 반복
		
		for(int i = 1; i <= 10; i++) {  // i는 index의 줄임말로 보통 씀. 
		//  1)초기식  2)조건식 4)증감식
			System.out.println("i : " + i);
			//3)반복 수행될 코드
		}
	}

	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		
		for(int i = 3; i < 8; i++) {
			System.out.println(i);
		}
	}

	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력 : " );
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("출력 : " + i);
		}
		
	}

	public void ex4() {
		// 1.0부터 입력받은 실수 까지 0.5씩 증가하며 출력
		
		System.out.print("입력 : ");
		double n = sc.nextDouble();
		
		for(double i = 1.0; i <= n; i += 0.5) {
			System.out.println("출력 : " + i);
		}
		
	}
	
	public void ex5() {
		// 영어 알파벳 A 부터 Z까지 한줄로 출력
		// ** char 자료형은? 유니코드
		
		char A = 'A'; 
		char Z = 'Z';
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println();
		
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
	}

	public void ex6() {
		// 응용문제 
		// 1부터 10까지 모든 정수의 합 구하기
		// -> 합계 : 55
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
					 // 0으로 시작하는 이유 : 아무것도 더하지 않음으로 정확히 결과를 도출 할 수 있기 때문에
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}

	public void ex7() {
		// 1부터 20씩까지 1씩 증가하면서 출력
		// 단, 5의 배수에( )를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 ...
		
		for(int i = 1; i <= 20; i++) {
			if(i%5==0) {
				//System.out.print("(" + i + ") ");
				System.out.printf("(%d) ", i);
			} else {
				System.out.print(i + " ");
			}
		}
	}

	public void ex8() {
		// 구구단 모두 출력하기
		
		for(int i = 2; i <= 9 ; i++) { // 2~9단 까지 차례대로 증가
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) { // 각 단에 곱해질 수, 1~9까지 차례대로 증가
				System.out.printf("%2d *%2d =%2d", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	public void ex9() {
		// 구구단 역순 출력
		// 9단 ~ 2단까지 역방향
		// 곱해지는 수는 1~9까지
		
		for(int dan = 9; dan >= 2; dan--) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d X %2d = %2d", dan, su, dan*su);
			}
			System.out.println();
		}
	}

	public void ex10() {
		// 12345를 5줄 출력
		
		for(int i = 0; i < 5; i++) { // 5바퀴 반복하는 for문
			for(int j = 1; j <= 5; j++) { // 12345 한 줄 출력하는 for문
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void ex11() {
		// 1
		// 12
		// 123
		// 1234
		//===========
		// 4321
		// 321
		// 21
		// 1
		
		int tmp = 1;
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 4) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			} else if(i == 5) {
				System.out.println("================");
			} else {
				for(int j = (i-(2*tmp)); j >= 1; j--) {
					System.out.print(j);
				}
				System.out.println();
				tmp++;
			}
		}
	}
}
