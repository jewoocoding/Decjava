package com.dec.day10.oop.encapsulation;

class CircleVO {
	// 필드
	private int radius;
	
	// 기본생성자
	public CircleVO() {}
	// 매개변수 있는 생성자
	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	// 메소드
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	// 멤버변수에 접근하는 메소드
	public void setRadius(int radius) {
		this.radius  = radius;
	}
}

public class Circle {
	
	public static void main(String[] args) {
		CircleVO circle = new CircleVO();
		circle.setRadius(10);
		// CircleVO circle = new CircleVO(10);
		// circle.radius = 10;
		System.out.println("넓이 : "+circle.getArea());
	}
}
