package com.dec.day2x.innerclass;

class Board {
	private String title;
	private String content;
	
	class Reply {
		
	}
	
	public void writeReply() {
		Reply reply = new Reply();
	}
}

class Creature {
	private int life = 50;
	
	private class Animal {
		// 내부클래스
		// Creature 안에서만 사용될 때 사용
		private String name = "호랑이";
		
		int getOuterField()  {
			return life;
		}
	}
	
	class Insect {
		// 내부클래스
		
	}
	
	public void exercise1() {
		Animal animal = new Animal();
		Insect insect = new Insect();
		System.out.println(animal.name);
		System.out.println(animal.getOuterField());
	}
}

public class Exam_InnerClass {
	/*
	 * 내부 클래스(Inner Class)란 하나의 클래스 내부에 선언된 또 다른 클래스.
	 * 내부의 정의된다는 점을 제외하고는 일반적인 클래스와 다르지 않음.
	 * 보통 두 클래스가 서로 긴밀한 관계가 있거나 하나의 클래스 또는 메소드에서만
	 * 사용되는 클래스일 때 사용되는 기법임.
	 * 1. 사용하는 이유
	 * - 논리적 그룹화
	 * - 캡슐화 강화
	 * - 유지보수성 향상
	 */
	public static void main(String[] args) {
		Creature creature = new Creature();
		creature.exercise1();
	}
}
