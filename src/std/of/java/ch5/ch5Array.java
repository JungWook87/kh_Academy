package std.of.java.ch5;
import java.util.*;

public class ch5Array {

	public void ex1() {
		// 배열
		// 같은 타입의 변수를 하나로 묶은 것
		
		int[] score = new int[5]; // 배열의 선언과 동시에 생성. 길이가 5인 int 배열
		int k = 1;
		
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70; // score[2] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4]; // int tmp = 80 + 90;
		
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d\n", i, score[i]);
		}
		
		System.out.printf("tmp:%d\n", tmp);
		//System.out.printf("score[%d]:%d\n", 7, score[7]); // index 범위를 벗어난 값
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		//at std.of.java.ch5.ch5Array.main(ch5Array.java:25)
	}
	
	public void ex2() {
		int[] score = new int[5];
		int sclength = score.length;
		
		System.out.println(sclength);
		
		for(int i=0; i<sclength; i++) {
			score[i] = 10*i;
			System.out.printf("score[%d]:%d\n", i, score[i]);
		}
	}
	
	public void ex3() {
		
		int[] score = new int[] {50, 60, 70, 80, 90};
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i]+",");
		}
		System.out.println();
		
		System.out.println("=======================");
		
		int[] socre = {60, 70, 80, 90, 100};
		for(int i=0; i<score.length; i++) {
			System.out.print(socre[i]+",");
		}
		System.out.println();
		
		System.out.println("=======================");
		
		System.out.println(Arrays.toString(score));
	}
	
	public void ex4() {
		
		int[] arr = {10, 20, 30};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(chArr));
		System.out.println(arr);
		System.out.println(chArr);
	}
}
