package com.dec.day09.oop;

import java.util.Scanner;

public class StudentApp {
	
	Scanner sc = new Scanner(System.in);
	Student [] students = new Student[3]; // 학생 3명을 저장할 배열 선언
	
	public void startProgram() {
		System.out.println("프로그램 실행");
//		for(int i=0; i<students.length;i++) { // Student 배열에 학생객체 생성
//			students[i] = new Student();
//		}
		end:
		while(true) {
			int choice = printMenu(); // 메뉴 출력
			switch(choice) { 
				case 1 : 
					for(int i=0;i<students.length;i++) { // 3명의 학생정보 입력
						students[i] = inputStudentData();						
					}
					break;
				case 2 :
					for(Student student : students)
						printStudentData(student);
					break;
				case 3 : 
					displayMessage("프로그램이 종료되었습니다.");
					break end; // 종료
				default :
					displayMessage("잘못된 번호를 입력하셨습니다.");
			}
		}
	}

	private void displayMessage(String message) {
		System.out.println(message);
	}

	private void printStudentData(Student student) { // 매개변수로 받은 객체를 출력
		System.out.println("===== 성적 출력 =====");
		System.out.println("이름 : "+student.name);
		System.out.println("국어 : "+student.kor);
		System.out.println("영어 : "+student.eng);
		System.out.println("수학 : "+student.math);
		System.out.println("총점 : "+student.total());
		System.out.println("평균 : "+student.average());
		
	}

	private Student inputStudentData() { // 객체생성하여 그 객체를 리턴함
		
		System.out.println("===== 성적 입력 =====");
		Student student = new Student(); // 객체 생성
		System.out.print("이름 : ");
		student.name = sc.next(); 
		System.out.print("국어 : ");
		student.kor = sc.nextInt();
		System.out.print("영어 : ");
		student.eng = sc.nextInt();
		System.out.print("수학 : ");
		student.math = sc.nextInt();
		return student;
	}

	private int printMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> "); // 화면 선택
		int choice = sc.nextInt();
		return choice;
	}
}
