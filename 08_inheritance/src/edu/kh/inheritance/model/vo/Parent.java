package edu.kh.inheritance.model.vo;

public /*final*/ class Parent {
	 //The type Child cannot subclass the final class Parent
	
	/* ** final 클래스 **
	 * -> 마지막 클래스 라는 의미로 더이상 상속 불가!! 를 의미함
	 */
	
	public /*final*/ void method() {
		// Cannot override the final method from Parent
		
		System.out.println("테스트");
	}

}
