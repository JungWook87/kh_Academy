package edu.kh.array2.practice.service;

public class PracticeService {
	
	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int num = 0;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr1[i][j] = students[num];
				num++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = students[num];
				num++;
			}
		}
		
		String result1 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result1 += arr1[i][j] + "\n";
				} else {
					result1 += arr1[i][j] + " "; 
				}
			}
		}
		
		String result2 = "";
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if(j == 1) {
					result2 += arr2[i][j] + "\n";
				} else {
					result2 += arr2[i][j] + " "; 
				}
			}
		}
		
		System.out.println("== 1분단 ==\n" + result1);
		System.out.println("== 2분단 ==\n" + result2);
	
		
	}

	public void pracitce8() {
		
	}



}
