package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		int i = 1;
		
		if(n == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			while(n>0) {
				System.out.print(i + " ");
				i++;
				n--;
			}
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			while(n>0) {
				System.out.print(n + " ");
				n--;
			}
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("정수를 하나 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		String s = "";
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			
			if(i == n) {
				s += i + " = ";
			} else {
				s += i + " + ";
			}
		}
		System.out.printf("%s%d", s, sum);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}	

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		} else {
			for(int i = num; i <= 9; i++) {
				System.out.printf("===== %d단 =====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		}
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = num-1; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = (num-i); j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			for(int j = 1; j <= i - 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i == 1 || i == num) {
				for(int j = 1; j <= num; j++) {
					System.out.print("*");
				}
			} else {
				for(int j =1; j <= num; j++) {
					if(j == 1 || j == num) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(i % 6 == 0) {
				cnt++;
			}
		}
		
		System.out.println();
		
		System.out.println("cnt : " + cnt);

	}
}