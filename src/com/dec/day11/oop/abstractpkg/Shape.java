package com.dec.day11.oop.abstractpkg;

public abstract class Shape { // 추상클래스
	
	// The abstract method draw in type Shape can only be defined by an abstract class
	public abstract void draw(); // 추상메소드 -> 없어도 추상클래스임
	// 추상메소드가 있으면 오버라이딩이 강제됨
	
//	public void draw() {
//		System.out.println("I'm Shape");
//	}
}
