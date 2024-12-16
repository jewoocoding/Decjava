package com.dec.day13.oop;

// 저장하고 로드하는 기능 클래스
public class StudentManage {
	
	private Student [] students;
	private int index;
	
	public StudentManage() {
		// 필드의 초기화는 생성자에서
		students = new Student[3];
		index = 0;
	}
	
	// 학생객체를 학생배열에 넣는 메소드
	public void insertStudent(Student student) {
		students[index] = student;
		index++;

	}
	// 학생배열을 반환하는 메소드
	public Student[] getStudent() {
		return students;
	}
	
	public int getIndex() {
		return index;
	}
}
