package com.dec.day10.oop.overriding;

public class Line extends Shape {
	
	@Override // 오버라이딩 되었다는 표시 (annotation)
	public void draw() {
		System.out.println("Line");
	}
}
