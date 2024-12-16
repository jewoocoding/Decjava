package com.dec.day13.oop;

import java.util.Scanner;

// 메뉴, 메시지, 데이터 입력, 출력하는 기능 클래스
public class StudentView {
	private Scanner sc;
	
	public StudentView() {
		// 생성자에서 Scanner 객체 만들어서 사용
		this.sc = new Scanner(System.in);
	}
	
	// 학생정보를 입력받는 메소드
	public Student inputStudentData() {
		Student student = new Student();
		System.out.println("===== 성적 입력 ======");
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("국어 : ");
		student.setKor(sc.nextInt());
		System.out.print("영어 : ");
		student.setEng(sc.nextInt());
		System.out.print("수학 : ");
		student.setMath(sc.nextInt());
		return student;
	}
	// 메인메뉴 출력하는 메소드
	public int mainMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	// 메세지를 띄우는 메소드
	public void displayMessage(String message) {
		System.out.println(message);
	}
	// 학생정보를 출력하는 메소드
	public void printStudentData(Student student) {
		System.out.println("===== 성적 출력 =====");
		System.out.println("이름 : "+student.getName());
		System.out.println("국어 : "+student.getKor());
		System.out.println("영어 : "+student.getEng());
		System.out.println("수학 : "+student.getMath());
		System.out.println("총점 : "+student.total());
		System.out.println("평균 : "+student.average());
	}
	
}
