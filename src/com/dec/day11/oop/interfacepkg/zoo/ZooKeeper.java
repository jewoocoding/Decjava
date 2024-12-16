package com.dec.day11.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	// 매개변수(parameter)를 인터페이스의 reference로 받음
	// 클래스들의 다형성 실현
	public void feed(FoodInterface animal) {
		System.out.println("feed "+animal.favoriteFood());
	}
	
//	public void feed(Bear bear) {
//		System.out.println("feed honey");
//	}
//	public void feed(Camel camel) {
//		System.out.println("feed cactus");
//	}
//	public void feed(Deer deer) {
//		System.out.println("feed acorn");
//	}
}
