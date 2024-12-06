package com.dec.day08.oop;

import java.util.Scanner;

public class Ractangle {
	private double width; // 동일한 클래스 내에서만 사용 가능
	double height;
	
	public double getArea() { // 사각형의 면적을 구하는 메소드
		return width*height; // 사각형의 면적 리턴
	}
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(); // 접근가능
		pizza.radius = 23; // 접근가능(default 멤버변수)
		
		Scanner sc = new Scanner(System.in); 
		Ractangle rec = new Ractangle(); // Ractangle 객체 생성
		
		System.out.print(">> "); // 2개의 값 입력받아 각각 Ractangle 객체의 멤버변수에 저장
		rec.height = sc.nextDouble();
		rec.width = sc.nextDouble();
		
		System.out.println("사각형의 면적은 "+rec.getArea()); // 넓이를 구하는 메소드 사용
	}
	
}
