package com.dec.day15.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface {
	//필드
	private Scanner sc;
	
	//메소드
	public StudentView() {
		sc = new Scanner(System.in);
	}
	
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
	
	@Override
	public Student inputStudent() {
		Student student = new Student();
		System.out.println("===== 학생 정보 입력 =====");
		System.out.print("이름 : ");
		student.setName(sc.next());
		System.out.print("1차 점수 : ");
		student.setFirstScore(sc.nextInt());
		System.out.print("2차 점수 : ");
		student.setSecondScore(sc.nextInt());
		return student;
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		System.out.println("===== 학생 전체 정보 출력 =====");
		for(Student std : stdList)
			System.out.printf("%s학생의 1차 점수는 %d, 2차 점수는 %d입니다.\n"
					,std.getName(), std.getFirstScore(), std.getSecondScore());
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

	@Override
	public String inputName(String category) {
		System.out.print(category+"할 학생 이름 : ");
		String name = sc.next();
		return name;
	}

	@Override
	public Student modifyStudent(Student student) {
		System.out.println("===== 학생 정보 수정 =====");
		System.out.print("수정할 1차 점수 : ");
		student.setFirstScore(sc.nextInt());
		System.out.print("수정할 2차 점수 : ");
		student.setSecondScore(sc.nextInt());
		return student;
	}

}
