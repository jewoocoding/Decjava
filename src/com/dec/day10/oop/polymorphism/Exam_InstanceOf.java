package com.dec.day10.oop.polymorphism;

class Car {}
class Sonata extends Car {}
class Genesis extends Car {}
class Audi extends Car {}

public class Exam_InstanceOf {
	
	static void print(Car car) {
		if(car instanceof Sonata) {
			System.out.println("소나타 점프!!");
		}
		if(car instanceof Genesis) {
			System.out.println("제네시스 킥!!");
		}
		if(car instanceof Audi) {
			System.out.println("아우디 펀치!!");
		}
	}
	// 업캐스팅을 이용하면 하나만 작성해도 됨
//	static void print(Genesis car) {
//	}
//	static void print(Sonata car) {
//	}
//	static void print(Audi car) {
//	}
	
	public static void main(String[] args) {
		
		print(new Car());
		// 업캐스팅
		print(new Sonata()); 
		print(new Genesis());
		print(new Audi());
	}
}
