package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	/* 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 *  -> 행, 열 개념 추가
	 */
	
	public void ex1() {
		// 2차원 배열 선언
		
		int[][] arr; 
		// int 2차원 배열을 참조하는 참조 변수 선언
		// == int arr[][], int[] arr[]
		// note! (참조형 == 참조 변수 == 레퍼런스 변수 == 레퍼런스)
		
		// 2차원 배열 할당
		// -> new 자료형[행크기][열크기]
		
		arr = new int[2][3];
		// heap 영역에 int 2차원배열에 2행 3열 공간을 할당
		
		// 2차원 배열 초기화
		/* 1) 행, 열 인덱스를 이용해서 직접 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;*/
		
		// 2) 2중 for문을 이용한 초기화
		
		//배열 요소 초기화에 사용할 변수
		int num = 10;
		
		// * 배열 길이
		// -> 배열명.length는 변수가 직접 참조하고 있는 배열의 길이를 반환
		
		System.out.println(arr.length); // 직접 참고하는 곳은 2차원 배열의 행이므로 행길이 2가 출력
		
		System.out.println(arr[0].length); // arr[0]이 참조하고 있는 1차원 배열(열)의 길이 3이 출력
		
		for(int row = 0; row < arr.length; row++) {				// 행의 반복(0,1)
			for(int col = 0; col < arr[row].length; col++) {	// 열의 반복(0,1,2)
				arr[row][col] = num;
				num += 10;
			}
		}
		
		// 출력
		// Arrays.toString(배열명) : 참조하고 있는 1차원 배열 값을 문자열로 반환
		System.out.println(Arrays.toString(arr));
		
		// Arrays.deepToString(배열명)
		// - 참조하고 있는 배열의 데이터가 나오는 부분까지 파고들어가서 모든 값을 문자열로 반환
		System.out.println(Arrays.deepToString(arr));
	}

	public void ex2() {
		// 2차원 배열 선언과 동시에 초기화
		
		// 3행 3열짜리 정수형 2차원 배열 선언과 동시에 1~9까지 초기화
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(Arrays.deepToString(arr));
		System.out.println();
		
		// 행 별로 합 출력
		int[] sumRow = new int[arr.length];
		
		for(int i= 0; i < arr.length; i++) {
			int sum = 0;
			
			for(int j = 0; j <arr[i].length; j++) {
				sumRow[i] += arr[i][j]; 
			}
		}
		System.out.println(Arrays.toString(sumRow));
		System.out.println();
		
		//열 별로 합 출력

	}
}
