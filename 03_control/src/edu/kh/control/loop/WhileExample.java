package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in); // scanner를 클래스에 선언하면 사용하지 않는 메소드에서도
										 // 메모리를 차지하고 있어 메모리 낭비가 된다.
	/* while문
	 * - 별도의 초기, 증감식이 존재하지 않고
	 *   반복 종료 조건을 자유롭게 설정하는 반복문
	 *   
	 *   ** 확실히 언제 반복이 끝날지는 모르지만 
	 *   	언젠가 반복 조건이 false가 되는 경우 반복 종료
	 *   
	 *   [작성법]
	 *   while(조건식){
	 *   	조건식이 true일 동안 반복 수행될 구문
	 *   }
	 */
	
	public void ex1() {
		
		int input = 0;
		
		while(input != 9) { // input이 9가 아닐때(true)까지 반복. 9를 누르면 false.
			System.out.println("=====키오스크=====");
			System.out.println("=====메뉴선택=====");
			System.out.println("=====메뉴선택=====");
			System.out.println("1. 떢볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("떡볶이 주문 완료!"); break;
			case 2 : System.out.println("김 밥 주문 완료!"); break;
			case 3 : System.out.println("쫄 면 주문 완료!"); break;
			case 9 : System.out.println("키오스크를 종료합니다!"); break;
			default : System.out.println("잘못 입력했어요~!");
			}
		}
	}

	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// -> 0이 입력되지 않으면 계속 반복
		
		int input = 1;
		int sum = 0;
		
		while(input != 0) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
		}
		System.out.printf("합계 : %d", sum);
		
		/*while(true) {
			
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			sum += input;
			
			if(input == 0) {
				break;
			}
		}
		System.out.printf("합계 : %d", sum);*/
	}

	public void ex3() {
		// 1부터 입력한 값의 합
		// 단, 0을 초과한 숫자 입력
		// -> 0이하의 숫자를 입력할 시 "1이상의 숫자를 입력해주세요" 문구 출력
		// Ex) 입력값 : 5
		// -> 1 + 2 + 3 + 4 + 5 = 출력해야하는 값
		// ex) 입력값 : 10
		// -> 1 + 2 + 3 + ... + 10 = 출력해야하는 값
		
		int sum = 0;
		
		while(true) {
			System.out.print("입력값 : ");
			int n = sc.nextInt();
			
			if(n==0) {
				System.out.println("1이상의 숫자를 입력해주세요");
			} else {
				while(n>0) {
					sum += n;
					n--;
				}
				break;
			}
		}
		System.out.printf("합은 %d 입니다", sum);
		
		/*System.out.print("입력값 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		if(input > 0) {
			int i = 1;
			
			while(i <= input) {
				sum += i;
				i++;
			}
			
			System.out.printf("1부터 %d까지의 합은 %d 입니다", input, sum);
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}*/
	}

	public void ex4() {
		
		int input = 0;
		int sum = 0;
		
		// do ~ while문
		// -> 최소 한 번은 수행하는 반복문
		
		do {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			sum += input;
			
		} while(input != 0);
		
		System.out.println("합계 : " + sum);		
	}
}
