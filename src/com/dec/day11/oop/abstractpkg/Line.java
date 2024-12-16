package com.dec.day11.oop.abstractpkg;

public class Line extends Shape { 
	// The type Line must implement the inherited abstract method Shape.draw()
	// -> 오버라이딩 또는 이 클래스를 추상메소드로 만들어 버리기
	
	// 추상메소드 오버라이딩
	@Override
	public void draw() {
		System.out.println("I'm Line");
	}
	
}
