package edu.kh.variable.ex2;
import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in);
		// import를 안해오면 오류 발생.
		// Scanner를 만들어서 쓰고 싶은데 설계도가 없음
		// 그래서 import를 해오라는 에러 발생! ==> import 해오면 오류 해결
		
		/*System.out.print("값을 입력하시오: ");
		int input1 = sc.nextInt(); // 입력 받은 정수를 input1이라는 변수에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		System.out.println(input1);
		
		System.out.println("실수만 입력하시오: ");
		double input2 = sc.nextDouble();
		System.out.println(input2); */
		
		// 안녕? 반가워! 밥먹을래?
		/*System.out.print("입력1: ");
		String input3 = sc.next();
		// next() : 다음 입력된 한 단어를 읽어옴
		System.out.println(input3);
		
		System.out.print("입력2: ");
		String input4 = sc.next();
		System.out.println(input4); // 순차적 입력하면 안녕? 이 사라지고 반가워!만 출력됨
									// String input4 = input3 + sc.next();
									// 로 코드를 작성하면 안녕?반가워!가 출력됨
		*/
		System.out.print("입력3: ");
		String input5 = sc.nextLine(); // nextLine으로 하면 한단어가 아니라 문자열을 읽어온다.
		System.out.println(input5);
	
	}
}
