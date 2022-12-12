package std.of.java.ch5;

import java.util.Scanner;

public class ch5MultiArray {
	public void ex1() {
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;
		
		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);
		
		// 배열을 1~SIZE*SIZE 의 숫자로 초기화
		for(int i = 0 ; i < bingo.length; i++) {
			for(int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = i*SIZE + j + 1;
			}
		}
		
		// 배열에 저장된 값을 섞기.
		for(int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				// bingo[i][j]와 섞어준다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i = 0; i <  SIZE; i++) {
				for(int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			// 입력 받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer : 
				for(int i = 0; i < SIZE; i++) {
					for(int j = 0; j < SIZE; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer;
						}
					}	
				}
		} while(num != 0);
	}
}	
