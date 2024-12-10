package com.dec.day10.oop.overriding.exercise;

class SuperClass {
	void paint() {
		this.draw(); // this의 역할은 SuperClass의 draw를 가리킴
		// but 동적바인딩으로 draw가 SubClass의 것으로 실행되기 때문에 SubClass의 draw가 실행됨
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw(); // super의 draw를 실행하라고 명시했기 때문에 부모클래스의 draw가 실행됨
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

public class Exercise_Overriding {
	public static void main(String[] args) {
		// 동적바인딩
		SuperClass ex = new SubClass();
		ex.paint();
		// 오버라이딩 되어있기 때문에 SubClass의 draw가 실행된다.
		// -> 그냥 외워
		// 객체내에 draw가 2개 있기 때문에 동적바인딩으로 자식클래스의 draw가 실행됨
	}
}
