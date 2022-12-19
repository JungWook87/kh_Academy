package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
		
		private Scanner sc = new Scanner(System.in);
		
		private SnackController scr = new SnackController();
		
		public void menu() {
			System.out.println("스낵류를 입력하세요.");
			
			System.out.print("종류 : ");
			String inputKind = sc.next();
			System.out.print("이름 : ");
			String inputName = sc.next();
			System.out.print("맛 : ");
			String inputFlavor = sc.next();
			System.out.print("개수 : ");
			int inputNumOf = sc.nextInt();
			System.out.print("가격 : ");
			int inputPrice = sc.nextInt();
			
			System.out.println(scr.saveData(inputKind, inputName, inputFlavor, inputNumOf, inputPrice));
			
			System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println(scr.confirmData());
				
			}
		}
}
