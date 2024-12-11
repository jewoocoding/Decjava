package com.dec.day11.oop.abstractpkg.exercise;

public class Run {
	public static void main(String[] args) {
		// 추상클래스 레퍼런스를 업캐스팅하여 사용
		// Cannot instantiate the type Calculator
		// 추상클래스는 인스턴스 생성불가
//		Calculator cal = new Calculator();
		int[] arr = {1, 2, 3, 4, 5};
		
		// 추상클래스 레퍼런스 사용
		Calculator cal1 = new MyCalculator();
		
		System.out.println(cal1.add(2, 3));
		System.out.println(cal1.subtract(5, 2));
		System.out.println(cal1.average(arr));
		
		// 자식클래스(구현클래스) 레퍼런스 사용
		MyCalculator cal2 = new MyCalculator();
		
		System.out.println(cal2.add(2, 3));
		System.out.println(cal2.subtract(5, 2));
		System.out.println(cal2.average(arr));
		
	}
}
