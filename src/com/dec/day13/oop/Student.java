package com.dec.day13.oop;

public class Student { // 학생 클래스
	// 필드
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	// 메소드
	// 생성자
	public Student() {}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public double average() {
		return this.total()/3.0; // this 키워드를 사용해 자신의 메소드를 활용할 수 있음
	}
	// getter/setter
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
}
