package com.dec.day08.oop;

import java.util.Random;

class StaticSample {
	
	public int num; // non-static
	public void normalMethod() {} // non-static
	
	public static int input; // static
	public static void staticMethod() {} // static
	
}

public class Exam_static {
	/*
	 * main 메소드
	 * 접근지정자 : public
	 * 예약어 : static
	 * 반환타입 : void
	 * 매개변수 : String 배열
	 */
	public static void main(String[] args) { 
		
		// non-static -> 객체를 생성해야 사용가능
		StaticSample sample = new StaticSample();
		sample.num = 11;
		sample.normalMethod();
		
		// 객체를 만들지 않고 사용 가능
		StaticSample.input = 10; 
		StaticSample.staticMethod();
		
		Random rand = new Random(); 
		rand.nextInt(10); // Random클래스의 non-static 메소드 nextInt()
		
		int num = (int)(Math.random()*10+1); // Math클래스의 static 변수 random
		
	}
	
}
