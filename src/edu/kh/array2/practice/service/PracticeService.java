package edu.kh.array2.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int num = 0;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr1[i][j] = students[num];
				num++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = students[num];
				num++;
			}
		}
		
		String result1 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result1 += arr1[i][j] + "\n";
				} else {
					result1 += arr1[i][j] + " "; 
				}
			}
		}
		
		String result2 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result2 += arr2[i][j] + "\n";
				} else {
					result2 += arr2[i][j] + " "; 
				}
			}
		}
		
		System.out.println("== 1분단 ==\n" + result1);
		System.out.println("== 2분단 ==\n" + result2);
	
		
	}

	public void practice8() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int num = 0;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr1[i][j] = students[num];
				num++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = students[num];
				num++;
			}
		}
		
		String result1 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result1 += arr1[i][j] + "\n";
				} else {
					result1 += arr1[i][j] + " "; 
				}
			}
		}
		
		String result2 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result2 += arr2[i][j] + "\n";
				} else {
					result2 += arr2[i][j] + " "; 
				}
			}
		}
		
		System.out.println("== 1분단 ==\n" + result1);
		System.out.println("== 2분단 ==\n" + result2);
		
		System.out.println("=============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.nextLine();
		
		int part = 0;
		int line = 0;
		String position = "";
		
		for(int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				if(arr1[i][j].equals(input)) {
					part = 1;
					line = i+1;
					position = (j == 0)? "왼쪽" : "오른쪽";
					break;
				}
			}
		}
			
		for(int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				if(arr2[i][j].equals(input)) {
					part = 2;
					line = i+1;
					position = (j == 0)? "왼쪽" : "오른쪽";
					break;
				}
			}
		}
		System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.", input, part, line, position);
	}

	public void practice9() {
		
		String[][] arr = new String[6][6];
		
		System.out.print("행 인덱스 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int num2 = sc.nextInt();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			String res = ""+ (i-1);
			arr[i][0] = res;
			arr[0][i] = res;
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(i-1 == num1 && j-1 == num2) {
					arr[i][j] = "X";
				}
			}
		}
		
		String print = "";
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j <arr[0].length; j++) {
				if(j == arr[0].length-1) {
					print += arr[i][j] + "\n";
				} else {
					print += arr[i][j] + " ";
				}
			}
		}
		
		System.out.println(print);
	}

	public void practice10() {
		
		
		String[][] arr = new String[6][6];

		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][j] = " ";
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			String res = ""+ (i-1);
			arr[i][0] = res;
			arr[0][i] = res;
		}
		
		while(true) {
		
			String print = "";
			
			System.out.print("행 인덱스 입력 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			
			if(num1 == 99) {
				System.out.println("\n프로그램 종료"); 
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
		
			for(int i = 0; i < 6; i++) {
				for(int j = 0; j < 6; j++) {
					if(i-1 == num1 && j-1 == num2) {
						arr[i][j] = "X";
					}
				}
			}
		
			for(int i =0; i < arr.length; i++) {
				for(int j = 0; j <arr[0].length; j++) {
					if(j == arr[0].length-1) {
						print += arr[i][j] + "\n";
					} else {
						print += arr[i][j] + " ";
					}
				}
			}
			
			System.out.println(print);
		}	
	}
}
