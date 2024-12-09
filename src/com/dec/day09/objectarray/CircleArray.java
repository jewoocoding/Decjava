package com.dec.day09.objectarray;

class Circle {
	int radius;
	
	// 기본 생성자
	public Circle() {
		radius = 0;
	}
	
	// 매개변수가 있는 생성자
	public Circle(int radius) {
		this.radius = radius; // this.객체의 필드변수 = 생성자의 매개변수
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		// 객체 하나 생성
//		Circle circle = new Circle();
//		circle.radius = 10;
		
		Circle circle = new Circle(10);
		
		// 객체 배열 생성
		Circle [] circles = new Circle[5];
		// 객체 배열의 0인덱스에 객체 하나 생성
		circles[0] = new Circle();
		circles[0].radius = 10;
		System.out.println(circles[0].getArea());
	}
}
