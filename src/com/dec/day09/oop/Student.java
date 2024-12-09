package com.dec.day09.oop;

class Student { // 학생 클래스
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int total() {
		return kor+eng+math;
	}
	
	public double average() {
		return this.total()/3.0; // this 키워드를 사용해 자신의 메소드를 활용할 수 있음
	}
}
