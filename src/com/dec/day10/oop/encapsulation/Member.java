package com.dec.day10.oop.encapsulation;

public class Member {
	// 필드(멤버변수 선언)
	private String name; // 이름
	private int age; // 나이
	private String job; // 직업
	private String education; // 학력
	private long salary; // 연봉
	private boolean divorceYN; // 돌싱여부
	
	//메소드
	public Member() {} // 생성자
	// 필드에 접근하는 메소드
	// setter(set 메소드), 멤버변수값을 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setDivorceYN(boolean divorceYN) {
		this.divorceYN = divorceYN;
	}
	// getter(get 메소드), 멤버변수값을 반환
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getJob() {
		return this.job;
	}
	public String getEducation() {
		return this.education;
	}
	public long getSalary() {
		return this.salary;
	}
	public boolean getDivorceYN() {
		return this.divorceYN;
	}
	
	public void work() {}
	public void eat() {}
	
}
