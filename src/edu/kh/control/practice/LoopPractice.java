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

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	}
}
