package com.dec.day14.collection.student;

import java.util.List;
import java.util.Scanner;

// MVC 패턴의 View
public class StudentView implements ViewInterface {
	// 필드
	private Scanner sc;
	
	
	public void clearSc() {
		sc.next(); // InputMismatchException을 해결하기 위해 sc에 저장되어 있는 문자를 next()로 옮김
	}
	// 생성자
	public StudentView() {
		sc = new Scanner(System.in);
	}
	// 학생 정보 입력 페이지 출력
	@Override
	public Student inputStudent() {
		Student student = new Student();
		System.out.println("===== 학생 정보 입력 ======");
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("1차 점수 : ");
		student.setFirstScore(sc.nextInt());
		System.out.print("2차 점수 : ");
		student.setSecondScore(sc.nextInt());
		return student;
	}
	// 학생 정보 출력
	@Override
	public void displayStudents(List<Student> stdList) {
		for(Student student : stdList) {
			System.out.println("===== 학생 정보 출력 =====");
			System.out.println("이름 : "+student.getName());
			System.out.println("1차 점수 : "+student.getFirstScore());
			System.out.println("2차 점수 : "+student.getSecondScore());
		}
	}
	public void displayStudents(Student student) {
		String name = student.getName();
		System.out.println("===== 학생 정보 출력 =====");
		System.out.println("이름 : "+name);
		System.out.println("1차 점수 : "+student.getFirstScore());
		System.out.println("2차 점수 : "+student.getSecondScore());
	}
	
	// 메인메뉴 출력
	@Override
	public int printMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생정보 검색");
		System.out.println("3. 학생정보 전체 출력");
		System.out.println("4. 학생정보 수정");
		System.out.println("5. 학생정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	// 메세지 출력
	@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
		
	}
	// 수정/삭제할 학생 입력 화면
	@Override
	public String inputName(String category) {
		System.out.print(category+"할 학생 이름 : ");
		String name = sc.next();
		return name;
	}
	// 학생 수정 화면
	@Override
	public Student modifyStudent(Student student) {
		System.out.print("이름 수정 : ");
		student.setName(sc.next());
		System.out.print("1차 점수 수정 : ");
		student.setFirstScore(sc.nextInt());
		System.out.print("2차 점수 수정 : ");
		student.setSecondScore(sc.nextInt());
		return student;
	}
	
	// 재평가 대상 여부 확인 화면 출력
	public void retestPage(boolean retest) {
		if(retest) {
			System.out.println("재평가 대상입니다.");
		}else {
			System.out.println("재평가 대상이 아닙니다.");
		}
	}
}
