package edu.kh.op.practice;
import java.util.Scanner;

class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println();
		
		System.out.println("1인당 사탕 개수 : " + candy / people);
		System.out.println("남는 사탕 개수 : " + candy % people);
	}
	
	public void practice2() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int cla = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int num = sc.nextInt();
		
		System.out.println("성별(남학생/여학생) : 남학생");
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double point = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.", 
				grade, cla, num, name, point );
		}
	
	public void practice3() {
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		System.out.println();
		
		int total = kor + eng + mat;
		double ever = (kor + eng + mat)/3.0;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + ever);
	}
}
