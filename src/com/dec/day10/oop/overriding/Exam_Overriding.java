package com.dec.day10.oop.overriding;

public class Exam_Overriding {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		shape = new Line(); // 업캐스팅
		shape.draw(); // 오버라이딩된 메소드 사용
		Line line = new Line(); // 자식클래스의 부모메소드 사용
		line.draw(); // 오버라이딩된 메소드 사용
		
		shape = new Rectangle(); // 업캐스팅
		shape.draw(); // 오버라이딩된 메소드 사용
		Rectangle rectangle = new Rectangle(); // 자식클래스의 부모메소드 사용
		rectangle.draw(); // 오버라이딩된 메소드 사용
		
		shape = new Circle(); // 업캐스팅
		shape.draw(); // 오버라이딩된 메소드 사용
		Circle circle = new Circle(); // 자식클래스의 부모메소드 사용
		circle.draw(); // 오버라이딩된 메소드 사용
	} 
}
