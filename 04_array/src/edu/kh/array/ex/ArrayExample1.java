package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	/* 배열(Array)
	 *  - 같은 자료형의 변수를 하나의 묶음으로 다루는 것(자료구조)
	 *  - 묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 *   (index는 0부터 시작하는 정수)
	 *   
	 * 배열의 특징
	 * 1) 한 가지 자료형만 저장 가능
	 * 2) 여러값 저장 가능
	 * 3) 한 번 크기를 지정하면 변경 불가능
	 *	   
	 */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 1-1. 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고 
		// 그 공간에 num 이라는 이름을 부여.
		
		// 1-2. 변수 대입
		num = 10;
		// 생생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3. 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-------------------------------------------------
		
		// 2-1. 배열 선언
		int[] arr;
		// Stack 영역에 in[](int배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소 값이(4byte)만을 저장할 수 있음.
		
		// 2-2. 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당)
					// 생성된 int[]에는 시작주소가 지정된다!! 매우중요!!
		
		// 2-3. 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0]~[2] int 자료형 변수이기 때문에 정수 값을 대입할 수 있다.
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 2-4. 배열 요소 값 읽어오기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
	}
	
	public void ex2() {
		// 배열 선언 및 할당
		
		int[] arr = new int[4];
		// 1) Stack 영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) Heap 영역에 int 자료형 4개 묶음으로 다루는 int[] 할당
		// 3) 생성된 int[]의 주소를 arr에 대입하여 참조하는 형태를 만듦
		
		// 배열 길이 : 배열명.length
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
		}
	}

	public void ex3() {
		
		Scanner sc = new Scanner(System.in);

		// 5명의 키(Cm)를 입력 받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		// 입력 받은 키 : 170.5 165.7 184.3 190.2 174.4
		// 평균 : 
		
		double[] height = new double[5];
		
		double sum = 0;
		String input = "";
		
		for(int i = 0; i < height.length; i++) {
			System.out.printf("%d번 키 입력 : ", i+1);
			height[i] = sc.nextDouble();
			
			sum += height[i];
			input += height[i] + " ";
		}
		
		double avg = sum / height.length;
		
		System.out.println("입력 받은 키 : " + input);
		System.out.println("평균 : " + avg + "Cm");
		
	}

	public void ex4() {
		// 입력 받은 인원 수 만큼의 점수를 입력 받아 배열에 저장
		// 입력이 완료되면 정수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력 받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 
		// 평균 : 소두 둘째자리까지
		// 최고점 : 
		// 최저점 : 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] score = new int[input];
		
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i + 1);
			score[i] = sc.nextInt();
			
			sum += score[i];
			max = Math.max(score[i], max);
			min = Math.min(score[i], min);
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
		
	}

	public void ex5() {

		char[] arr = new char[5];
		
		// char[] arr 이 참조하는 배열 요소에 A, B, C, D, E 대입하기
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (char)('A' + i);
			//System.out.printf("arr[%d] : %c\n", i, arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		// ** Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		// Arrays.toString(배열명) : 모든 요소 값 출력
		
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2)); // int의 기본값이 0이므로
		
		// 배열 선언과 동시에 초기화
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		// char[] 참조 변수 arr3을 선언하고
		// Heap 영역에 char 5칸짜리 char[]을 생성하고
		// 각각 'A', 'B', 'C', 'D', 'E' 로 초기화 후 주소를 arr3에 대입
		
		System.out.println(Arrays.toString(arr3));

	}

	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		// flag == false : 일치하는 값이 존재하지 않음
		// flag == true : 일치하는 값이 존재
		
		boolean flag = false; // 검사 전에는 없다고 가정
		
		// arr 배열 요소 순차 접근
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				
				flag = true; // 일치하는 값이 있으므로 true로 변경
			}
		}
		
		if(!flag) { // flag가 true 였다면 false로 바뀌고 if절을 수행하지 않음.
					//반대로 false였다면 true로 바뀌며 if절 수행함
			System.out.println("존재하지 않음");
		}
	}

	public void ex7() {
		// 입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음"
		String[] arr = {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		// equals() -> 배열명[i].equals(비교할 값)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {		// string에서 즉, 참조형에서 비교 할 때 == 는 같은 주소값을 보고 있지 않기 때문에
											// 일치하지 않는다고 나옴. 동명이인. 그러므로 순수 데이터 값을 비교하는 equals를 써줌
				System.out.println(input + "은 인덱스 " + i + "번에 있습니다.");

				flag = true;
			} 
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex8() {
		/* 1. 문자열을 입력 받아 한 글짜씩 잘라내어 char 배열에 순서대로 저장
		 * 2. 문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		 * 3. 단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
		 * 
		 * [사용 해야되는 기술, 기능]
		 * 1) 배열 검색
		 * 2) String.length() : 문자열 길이
		 * 		ex) "Hello".length() -> 5
		 * 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
		 * 		ex) "Hello".charAt(1) - > 'e'
		 * 4) count (숫자세기)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char[] chArr = input.toCharArray();
		
		int cnt = 0;
		
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		int ch = str.charAt(0);
		
		boolean flag = false;
				
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch ) {
				cnt ++;
				
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않습니다.");
		} else {
			System.out.println(cnt);
		}*/
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char[] chArr = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			chArr[i] = input.charAt(i);
		}
		
		System.out.print("검색할 문자 입력 : ");
		String str = sc.nextLine();			//char ch  = sc.nextLine().charAt(0);
		char ch = str.charAt(0);
		
		int cnt = 0;
		
		boolean flag = false;
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == ch) {
				cnt++;
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("존재하지 않습니다.");
		} else {
			System.out.println(cnt + "개 있음");
		}
	}
}
