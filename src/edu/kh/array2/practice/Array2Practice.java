package edu.kh.array2.practice;

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
		
		int[][] answer = new int[4][4];
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				int num = (int)(Math.random()*10+1);
				arr[i][j] = num;
			}
		}
		
		int[] sumC = new int[3];
		for(int i = 0; i < sumC.length; i++) {
			
		}
	}
}
