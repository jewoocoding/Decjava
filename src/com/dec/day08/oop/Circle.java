package com.dec.day08.oop;

public class Circle {

	final double PI = 3.14;
	public double radius;
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		
		// 참조변수 선언 = 객체
		Circle circle = new Circle();
		
		// circle.radius = 4.2;
		
		System.out.println("원의 면적 : "+circle.getArea()); // 멤버변수 초기화를 안 해주면 0으로 자동 초기화
		
		Circle donut = new Circle();
		
		donut.radius = 2;
		System.out.println("도넛의 넓이 : "+donut.getArea());
		
	}

}
