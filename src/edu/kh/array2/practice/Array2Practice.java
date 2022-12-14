package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Random;

public class Array2Practice {
	
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
}