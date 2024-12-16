package com.dec.day14.collection.student;

// Value Object
// VO 
// 값을 저장하는 객체를 생성하는 클래스
public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 메소드
	// 생성자
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// getter/setter/toString -> VO의 기본 세팅
	public String getName() {
		return name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
}
