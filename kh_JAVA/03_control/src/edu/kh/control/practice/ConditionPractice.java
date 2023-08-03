package edu.kh.control.practice;
import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		
	}

	public void practice2() {
		
		System.out.print("국어점수 : ");
		
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		if(kor < 40 || math < 40 || eng < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		} else {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!"
					, kor, math, eng, sum, avg);
		}
	}

	public void practice3() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : System.out.printf("%d월은 31일까지 있습니다.", month); break;
		case 4, 6, 9, 11 : System.out.printf("%d월은 30일까지 있습니다.", month); break;
		case 2 : System.out.printf("%d월은 28일까지 있습니다.", month); break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
	}

	public void practice4() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		String result;
		
		if(BMI < 18.5) {
			result = "저체중";
		} else if(BMI < 23) {
			result = "정상체중";
		} else if(BMI < 25) {
			result = "과체중";
		} else if(BMI < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);
	}
	
	public void practice5(){
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt(); // 중간 고사 점수
		double mid100 = mid * (20.0/100.0); // 중간 고사 백분율
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt(); 
		double fin100 = fin * (30.0/100.0);
		
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		double task100 = task * (30.0/100.0);
		
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		double attrate = 100.0 - att*5.0;
		
		double sum = mid100 + fin100 + task100 + att;
		
		System.out.println("================= 결과 =================");
		
		if( attrate>=30) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", att);
		} else {
			System.out.println("중간 고사 점수(20) : " + mid100);
			System.out.println("기말 고사 점수(30) : " + fin100);
			System.out.println("과제 점수(30) : " + task100);
			System.out.println("출석 점수(20) : " + (double)att);
			System.out.println("총점 : " + sum);
			
			if(sum < 70) {
				System.out.println("Fail [점수 미달]");
			} else {
				System.out.println("PASS");
			}
		}
	}

}
