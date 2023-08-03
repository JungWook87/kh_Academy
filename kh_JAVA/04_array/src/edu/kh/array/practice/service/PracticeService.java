package edu.kh.array.practice.service;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		String num = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i + 1;
			
			num += arr[i] + " ";
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(num);
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}

	public void practice2() {
		int[] arr = new int[9];
		
		int sum = 0;
		int res = arr.length;
		String num = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = res;
			res--;
			
			num += arr[i] + " ";
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println(num);
		System.out.println("홀수 번째 인덱스 합 : " + sum);		
	}

	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		String num = "";
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			num += arr[i] + " ";
		}
		
		System.out.println(num);
		
	}

	public void practice4() {
		
		int[] arr = new int[5];
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			arr[i] = input;
			
			if(i == arr.length - 1) {
				System.out.print("검색할 값 : ");
				int check = sc.nextInt();
				
				for(int j = 0; j < arr.length; j++) {
					if(check == arr[j]) {
						System.out.println("인덱스 : " + j);
						flag = true;
					}
				}
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}

	public void practice5() {
		
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] ch = input.toCharArray();
		
		System.out.print("문자 : ");
		char check = sc.nextLine().charAt(0);
		
		String num = "";
		int cnt = 0;
		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == check) {
				num += i + " "; //  num = num + i + " "
				cnt++;
			}
		}
		
		System.out.printf("application에 %c가 존재하는 위치(인덱스) : %s\n", check, num);
		System.out.printf("%c 개수 : %d", check, cnt);
	}

	public void practice6() {
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		String str = "";
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int num = sc.nextInt();
			
			arr[i] = num;
			
			str += arr[i] + " ";
			
			sum += arr[i];
		}
		System.out.println(str);
		System.out.println("총 합 : " + sum);
		
		
	}

	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] ch = input.toCharArray();
		
		String str = "";
		
		for(int i = 0; i < ch.length; i++) {
			
			if(i < 8) {
				str += ch[i];
			} else {
				ch[i] = '*';
				str += ch[i];
			}
		}
		System.out.println(str);
	}

	public void practice8() {
		
		/* 1) 정수 입력
		 * 2) 3이상 참거짓 출력
		 * 3) 입력 값의 중간 구하기
		 * 4) 반복문 입력값 횟수 시행
		 * 5) 중간 값까지 오름차순 그후로 내림차순
		 * 6) 출력
		 */
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input % 2 ==0) {
				System.out.println("다시 입력하세요.");
			} else {
				int mid = (input - 1) / 2;					// 각종 변수들 초기화
				int[] arr = new int[input];
				int num = 1;
							
				for(int i = 0; i < arr.length; i++) {		// 배열 초기화
					if(i < mid) {
						arr[i] = num;
						num++;
					} else if(i == mid) {
						arr[i] = num;
					} else {
						num--;
						arr[i] = num; 
					}
				}
				
				String str = "";							// 출력구문
				for(int i = 0; i < arr.length; i++) {
					if(i == arr.length-1) {
						str += arr[i];
						flag = false;
					} else {
						str += arr[i] + ", ";
					}
				}
				System.out.println(str);
		}
	}
}

	public void practice9() {
		// 10개 값의 정수형 배열
		// 1~10사이 난수 발생.
		// 반복문..
		// 배열에 초기화
		// 출력
		
		int[] arr = new int[10];
		
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10);
			arr[i] = random + 1;
			
			str += arr[i] + " ";
		}
		System.out.println("발생한 난수 : " + str);
		
	}

	public void practice10() {
		// 10개 값 배열
		// 1~10 사이 난수 및 초기화
		// 배열 전체, 최대, 최소
		// 출력
		
		int[] arr = new int[10];
		
		String str = "";
		int max = 0;
		int min = 11;
		
		for(int i = 0; i < arr.length; i++) {
			
			int random = (int)(Math.random() * 10);
			
			arr[i] = random + 1;
			
			str += arr[i] + " ";
			max = (max > arr[i])? max : arr[i];
			min = (min > arr[i])? arr[i] : min;
		}
		
		System.out.println("발생한 난수 : " + str);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

	public void practice11() {
		// 10방 배열
		// 1~10 난수 * 10 
		// 중복 없이 초기화 *10
		// 출력 
		
		int[] arr = new int[10];
		
		String str = "";
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			boolean flag = true;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] == random) {
					i--;
					flag = false;
					break;
				}
			}
			
			if(flag) {
				str += arr[i] + " ";
			}
		}
		System.out.println(str);
	}

	public void practice12() {
		// 6개 출력 배열
		// 랜덤값 입력
		
		int[] ball = new int[45];
		int[] lotto = new int[6];
		
		for(int i = 0; i < ball.length; i++) {			// 공 45개에 1 ~ 45까지 초기화
			ball[i] = i + 1;
		}
		
		for(int i = 0; i < 6; i++) {					// 인덱스 값을 랜덤으로 하여 섞기
			
			int x = (int)(Math.random() * 45);
			
			int temp = ball[i];
			ball[i] = ball[x];
			ball[x] = temp;
		}
		
		for(int i = 0; i < lotto.length; i++) {			// 공 0~5까지를 로또에 복사하고, 오름차순 정렬
			lotto[i] = ball[i];
			if(i == 5) {
				Arrays.sort(lotto);
			}
		}
		
		String str = "";								// 출력
		for(int i = 0; i < lotto.length; i++) {
			str += lotto[i] + " ";
		}
		
		System.out.println(str);
		
	}

	public void practice13() {

		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		char[] ch = input.toCharArray();		// 문자열 문자형 배열화
		
		int cnt = 0;					
		
		for(int i = 0; i < ch.length; i++) {	// 중복 값 공백으로 변환	
			for(int j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					ch[i] = ' ';
				}
			}
		}
		
		for(int i = 0; i < ch.length; i++) {	// 공백 갯수 카운트
			if(ch[i] == ' ') {
				cnt++;
			}
		}
		
		char[] res = new char[ch.length-cnt];	// 새로운 배열 선언 및 ch배열에서 공백 갯수 뺀만큼 할당
		int num = 0;
		
		for(int i = 0; i < ch.length; i++) {	// 새로운 배열을 ch 값으로 초기화
			if(ch[i] == ' ') {
				continue;
			} else {
				res[num] = ch[i];
				num++;
			}
		}
		
		String str = "";
		
		for(int i = 0; i < res.length; i++){	// 출력 정리
			if(i == res.length-1) {
				str += res[i];
			} else {
				str += res[i] + ", ";
			}
		}
		
		System.out.println("문자열에 있는 문자 : " + str);
		System.out.println("문자 개수 : " + res.length);
	}

	public void practice14() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		boolean first = true;
		int num = 1;
		
		while(true) {
			
			if(first) {
				for(int i = 0; i < arr.length; i++) {
					System.out.printf("%d번째 문자열 : ", num);
					String str = sc.nextLine();
					arr[i] = str;
					num++;
				}
				first = false;
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char more = sc.nextLine().charAt(0);
			
			if(more == 'y' || more == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int input = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length + input];
				
				for(int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.printf("%d번째 문자열 : ", num);
						String str = sc.nextLine();
						newArr[i] = str;
						num++;
					}
				}
				arr = newArr;
				
			} else {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
