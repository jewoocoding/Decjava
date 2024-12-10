package com.dec.day10.myexercise;

class Super {
	// 부모클래스
}
class Sub extends Super {
	// 자식클래스
}


public class MyTest {
	public static void main(String[] args) {
		Super s1 = new Sub(); // 업캐스팅
		Sub s2 = new Sub(); // 자식클래스 객체 생성
		Super s3 = new Super();
		Sub s4 = (Sub)s1; // 다운캐스팅 -> 업캐스팅된 객체에서만 사용가능
		// Sub s5 = (Sub)s3; // 부모클래스의 객체를 다운캐스팅 할 순 없음
		s2 = null; // 클래스에 null을 넣으면 객체가 사라짐
		
		System.out.println("업캐스팅된 부모클래스 참조변수 s1");
		if(s1 instanceof Sub)
			System.out.println("s1은 Sub의 객체입니다.");
		if(s1 instanceof Super)
			System.out.println("s1은 Super의 객체입니다.");
		System.out.println();
		
		
		System.out.println("자식클래스 참조변수 s2");
		if(s2 instanceof Sub)
			System.out.println("s2은 Sub의 객체입니다.");
		if(s2 instanceof Super)
			System.out.println("s2은 Super의 객체입니다.");
		System.out.println();
		
		System.out.println("부모클래스의 참조변수 s3");
		if(s3 instanceof Sub)
			System.out.println("s3은 Sub의 객체입니다.");
		if(s3 instanceof Super)
			System.out.println("s3은 Super의 객체입니다.");
		System.out.println();
		
		System.out.println("s1을 다운캐스팅한 자식클래스 참조변수 s4");
		if(s4 instanceof Sub)
			System.out.println("s4은 Sub의 객체입니다.");
		if(s4 instanceof Super)
			System.out.println("s4은 Super의 객체입니다.");
		
	}
}
