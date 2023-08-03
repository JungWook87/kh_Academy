package std.of.java.ch5;

public class ch5StringArray {

	public void ex1(){
		String[] name1 = new String[3];
		name1[0] = new String("Kim");
		name1[1] = new String("Park");
		name1[2] = new String("Lee");

		String[] name2 = new String[3];
		name2[0] = "Kim";
		name2[1] = "Park";
		name2[2] = "Lee";

		String[] name3 = {"Kim", "Park", "Lee"};
	
		String[] name4 = new String[] {"Kim", "Park", "Lee"};
	
		for(String str : name4) {					// 향상된 for문, 기능 : 배열을 읽을수만 있다.
			System.out.println(str);
		}
	}

	public void ex2() {
		/*
		//char 변수명 = 문자열변수.charAt(int index)
		String str = "ABCDE";
		char ch = str.charAt(3);
		System.out.println(ch);  // 0-A, 1-B, 2-C, 3-D, 4-E
		System.out.println("================");
		
		//int 변수명  = 문자열변수.length
		int length = str.length();
		System.out.println(length); //문자열 길이 반환
		System.out.println("================");
		
		//String 변수명 = 문자열변수.substring(시작, 끝)
		String tmp = str.substring(2, 4);
		System.out.println(tmp);  //2~3, 끝범위는 포함되지 않음
		System.out.println("================");
		
		//문자열 비교, 대소문자 비교
		String equ = "abc";
		System.out.println(equ.equals("abc"));
		System.out.println(equ.equals("Abc"));
		System.out.println("================");
		
		//문자열을 문자배열로 반환
		char[] charStr = {'a', 'b', 'c', 'd', 'e'};
		String strCh = new String(charStr);
		char[] temp = strCh.toCharArray();
		
		System.out.println(charStr);
		System.out.println(strCh);
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);*/
		
		String big = "AGE";
		char[] small = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		String result = "";
		
		for(int i = 0; i < big.length(); i++) {
			result += small[big.charAt(i)-'A'];
		}
		System.out.println("big : " + big);
		System.out.println("small : " + result);
 	}
}
