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

	public void ex5() {
		/*int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}	
		
			System.out.println("[변경전]");
			System.out.println("arr.length : " + arr.length);
			System.out.println(Arrays.toString(arr));
		
		int[] temp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}	
				
			arr = temp;
			System.out.println("[변경후]");
			System.out.println("arr.length : "+ arr.length);
			System.out.println(Arrays.toString(arr));
			
			System.out.println("==========================");
			
			int[] arr1 = new int[]{1, 2, 3, 4, 5};
			int[] newarr1 = new int[arr1.length*2];
			
			System.arraycopy(arr1, 0, newarr1, 0, arr1.length);
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(newarr1));
			*/
		
		char[] abc = {'a', 'b', 'c', 'd'};
		char[] num = {'1', '2', '3', '4', '5', '6'};
		System.out.println(abc);
		System.out.println(num);
		
		char[] abcnum = new char[abc.length + num.length];
		
		System.arraycopy(abc, 0, abcnum, 0, abc.length);
		System.arraycopy(num, 0, abcnum, abc.length, num.length);
		
		System.out.println(abcnum);
		
		System.out.println("=====================");
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.arraycopy(abc, 0, abcnum, 6, abc.length);
		
		System.out.println(num);
		System.out.println(abcnum);
			
	}	

	public void ex6() {
		int sum = 0;
		float avg = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

	public void ex7() {
		int[] score = {10, 20, 30, 90, 50};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			max = (max>score[i])? max : score[i];
			min = (min>score[i])? score[i] : min;
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	
	public void ex8() {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = i;
		}
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10); // Math.random() : 0.0~0.9 사이의 double 값을 랜덤하게 지정한다.
			int tmp = num[0];
			num[0] = num[n];
			num[n] = tmp;
		}
		
		System.out.println(Arrays.toString(num));
	}

	public void ex9() {
		//Math.random()
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] check = new int[num];
		
		for(int i = 0; i < 50; i++) {
			int a = (int) (Math.random() * num);  				// (int)Math.random() * num : 0~(num-1) 범위까지의 숫자가 형성
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 50; i++) {
			int a = (int)((Math.random() * (num - 3)) + 3);		// (int)Math.random() * ((num - 최소값) + 최소값) : 최소값~(num-1) 범위까지 숫자 형성 
			System.out.print(a + " ");							// 원리 num 5 최소값 1로 가정 : 5-1 = 4로 즉 0~3까지 랜덤출력, 거기에다가 1을 더해주니 1~4까지 랜덤출력
		}
		
		System.out.println();
		
		for(int i = 0; i < 50; i++) {
			int a = (int)(Math.random() * num + 1);				//(int)Math.random() * num + 최소값 : 최소값~num-1+최소값
			System.out.print(a + " ");							// num 5 라고 하면 0~4까지 거기에다가 최소값이 더해지므로 최소값~4+최소값
		}														// 만약 0부터 입력값까지 랜덤출력을 원하면 ()사용 산술 연산자에 의해 (num+1)이 계산되어 6으로 계산 0~5까지 랜출
	}

	public void ex10() {
		
		int[] numArr = new int[5];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*5+1);
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("==============");
		
		for(int i= 0; i < numArr.length - 1; i++) {
			boolean changed = false;
			
			for(int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					
					changed = true;
				}
			}
			
			if (!changed) break;
			
			System.out.println(Arrays.toString(numArr));
		}
	}

	public void ex11() {
		
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("================");
		
		int[] cnt = new int[numArr.length];
		
		for(int i = 0; i < numArr.length; i++) {			// for(int i = 0; i < numArr.length; i++){
			for(int j = 0; j < numArr.length; j++) {		// cnt(numArr[i])++
				if(numArr[j] == i) {						// 즉, numArr[0]의 값이 4라면 cnt(4)가 ++가 됨.(배열에서 초기화 안하면 0으로 셋팅됨)
					cnt[i]++;
				}
			}
			
			System.out.println(i +"의 개수 : " + cnt[i]);
		}
	}
}
