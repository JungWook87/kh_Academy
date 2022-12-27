package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		char[][] arr = new char[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j <arr[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}
			System.out.println();
		}
		
	}

	public void practice2() {
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num;
				System.out.printf("%2d ", num);
				num++;
			}
			
			System.out.println();
		}
	}

	public void practice3() {
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = num;
				System.out.printf("%2d ", num);
				num--;
			}
			
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {				// 3*3 2차배열 초기화
			for(int j = 0; j < arr[0].length-1; j++) {
				int num = (int)(Math.random()*10+1);
				arr[i][j] = num;
			}
		}
		
		int[] sumC = new int[3];							// 열의 합
		for(int i = 0; i < sumC.length; i++) {
			for(int j = 0; j < sumC.length; j++) {
				sumC[i] += arr[j][i];
			}
		}
		
		int[] sumR = new int[3];							// 행의 합
		for(int i = 0; i < sumR.length; i++) {
			for(int j = 0; j < sumR.length; j++) {
				sumR[i] += arr[i][j];
			}
		}
		
		for(int i= 0; i < 3; i++) {							// 행과 열 끝에 합 대입
			arr[i][3] = sumR[i];
			arr[3][i] = sumC[i];
			arr[3][3] += sumR[i];
		}
				
		for(int i = 0; i < 4; i++) {						// 출력
			for(int j = 0; j < 4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			
			System.out.print("행 크기 : ");
			num1 = sc.nextInt();
			
			if (num1 >= 1 && num1 <= 10) {
				
				System.out.print("열 크기 : ");
				num2 = sc.nextInt();
				
				if(num2 >= 1 && num2 <= 10) {
					break;
				} else {
					System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				}
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
		
		char[][] arr = new char[num1][num2];
		
		for(int i =0; i <arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				int random =(int)(Math.random() * 26) + 65;
				
				arr[i][j] = (char)random;
			}
		}
		
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[0].length; j++) {
				if(j == arr[0].length - 1) {
					result += arr[i][j] + "\n";
				} else {
					result += arr[i][j] + " ";
				}
			}
		}
		
		System.out.println(result);
	}

	public void practice6() {
		
		System.out.print("행의 크기 : ");
		int num = sc.nextInt();
		
		char a = 'a';
		String result = "";		
		
		char[][] arr = new char[num][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("열의 크기 : ");
			int num2 = sc.nextInt();
			
			arr[i] = new char[num2];
			
			for(int j = 0; j < num2; j++) {
				
				arr[i][j] = a;
				
				if(j == num2-1) {
					result += a + "\n";
				} else {
					result += a + " ";
				}
				
				a++;
			}
		}
		
		System.out.println(result);
		
	}



}