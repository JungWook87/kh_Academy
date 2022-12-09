package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
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
		
		int n = sc.nextInt();
		int clone = 0;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
	}
}
