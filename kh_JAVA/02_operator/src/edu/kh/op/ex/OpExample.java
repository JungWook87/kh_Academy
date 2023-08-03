package edu.kh.op.ex;

// 예제 코드 작성용 클래스
public class OpExample {
	
	// 기능 메소드(method) : 객체 지향 프로그래밍에서
	// 객체와 관련된 서브루틴 or 함수
	public void ex1() {
		// void : return 값이 없는 메소드에 작성
		System.out.println("OpExample 클래스에 ex1() 기능 수행");
	}
	
	// tip! : 하나의 메소드 안에는 하나의 기능만 정의해야 함
	public void ex2() {
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1:" +iNum1);
		System.out.println("iNum2:" +iNum2);
	}
	
	public void ex3() {
		
		// 전위연산 : ++3, --2 연산자가 앞쪽에 배치
		// -> 다른 연산보다 먼저 증감/감소
		
		int temp1 = 5;
		System.out.println(++temp1 + 5);
			//	=>	6 + 5 == 11
		
		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
		// 3 + 2 = 5
		// 계산이 끝난 후에 temp2가 1감소되어 temp2==2로 바뀜
		System.out.println(temp2);
	}
	
	public void ex4() {
		// 비교연산자 : >, <, >=, <=, ==, !=
		// - 비교 연산자의 결과는 항상 논리값(true/false)
		// - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽에 있어야 한다.
		
		int a = 10;
		int b = 20;
		
		System.out.println( a > b ); // false
		System.out.println( a < b ); // true
		System.out.println( a != b ); // true
		System.out.println( (a==b) == false ); // true
			// () 안부터 연산
			// false == false => true
		
		int c = 4;
		int d = 5;
		System.out.println( c + 1 <= d); //true
			// true인 이유 : 산술연산이 비교연산보다 우선순위가 높다.
		
		int temp = 732;
		System.out.println("temp는 짝수?" + (temp % 2 == 0 )); //false
	}
	
	public void ex5() {
		// 논리연산자 : &&(AND), ||(OR)
		
		// && : 둘다 true이면 true
		int a = 101;
		// a는 100 이상이면서 짝수인가?
		// a>=100 && a%2==0
		System.out.println( a >= 100); //true
		System.out.println( a % 2 == 0 ); //false
		System.out.println( (a >= 100) && (a % 2 == 0)); // false
		
		// || : 둘다 false 면 false (AND의 반대) 나머지 true
		int c = 10;
		// c는 10을 초과했거나 짝수인가?
		System.out.println( c > 10 ); // false
		System.out.println( c % 2 == 0 ); // true
		System.out.println(( c > 10 ) || ( c % 2 == 0 )); // true
	}
	
	public void ex6() {
		// 논리 부정 연산자 : !
		// 논리값을 반대로 바꾸는 연산자
		
		boolean bool1 = true;
		System.out.println(!bool1);
	}
	
	public void ex7() {
		// 복합 대입 연산자 : +=, -=, *=, /=, %=
		// -> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		System.out.println("a : "+a);
		
		a++; // a==11
		System.out.println("a++ : "+a);
		
		a += 4; // a = a + 4, 4씩 증가, a==15
		System.out.println("a += 4 : "+a);
		
		a -= 10;
		System.out.println("a -= 10 : "+a);
		
		a *= 3;
		System.out.println("a *= 3 : "+a);
		
		a /= 6;
		System.out.println("a /= 6 : "+a);
		
		a %= 2;
		System.out.println("a %= 2 : "+a);
	}
	
	public void ex8() {
		// 삼항 연산자
		// 조건식 ? 식1 : 식2
		// 조건식의 결과가 true면 식1이 수행, false면 식2가 수행
		
		int num = 30;
		String str1 = "num은 30보다 크다";
		String str2 = "num은 30 이하다";
		
		String result = ( num > 30 )? str1 : str2;
		System.out.println(result);
	}
}
