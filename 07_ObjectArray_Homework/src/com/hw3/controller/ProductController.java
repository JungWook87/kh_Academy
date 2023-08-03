package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = null;	// = null;
	public static int count;				// 현재 추가된 객체 수
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];
	}
	
	public void mainMenu() {
		int num = 0;
		
		do {
			System.out.println("\n===== 제품 관리 메뉴 =====");
			
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("\n번호를 누르세요 >> ");
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 0 : System.out.println("\n프로그램 종료"); break;
			default : System.out.println("\n번호를 잘못 입력하였습니다.");
			}
			
		} while(num != 0);
	}
	
	public void productInput() {
		// 정보 받아 객체 생성 -> count++ 
		// 현재 카운트 인덱스에 주소 저장
		System.out.println("\n===== 제품 정보 추가 =====");
		
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		
		System.out.print("제품명 : ");
		String name = sc.next();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pld, name, price, tax );
		
		System.out.println("\n저장 완료~!!");
		
		
	}
	
	public void productPrint() {
		// 현재까지 기록된 도서 정보 모두 출력
		System.out.println("\n===== 제품 전체 조회 =====\n");
		
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].infomation());
		}
	}
}
