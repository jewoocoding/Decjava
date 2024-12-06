package com.dec.day08.recap;

import java.util.Scanner;

// 구조적 프로그래밍 -> top-down 방식 구조를 설계하고 기능들은 나중에 구현
public class StudentApp2 {
	/*
	 * 성적 입력 프로그램 (클래스 사용 버전)
	 */
	// 필드(멤버변수)
	static Scanner sc = new Scanner(System.in);
	static Student student = new Student(); // Student 객체 생성
	// static int choice = 0;
	
	public static void main(String[] args) {
		
		
		end: // break end;를 만났을 때, 반복문을 빠져나오고 이쪽으로 옴
			 // 빠져나올 반복문 앞에 적어야 함
		while(true) {
			// 메인메뉴 출력 -> 메소드화
			
			switch(printMenu()) {
				case 1 : // 성적 입력 화면
					inputStudentData();
					break;
				case 2 :
					printStudentData();
					break ;
				case 3 : 
					// 종료
					displayMessage();
					// System.out.println("프로그램이 종료되었습니다.");
					break end; // 무한반복을 빠져 나와 end: 로 간다.
				default : 
					displayMessage();
					// System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}

	}
	
	static int printMenu() { // static을 붙여줘야지 static 메소드 안에서 쓸 수 있음
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> "); // 화면 선택
		int choice = sc.nextInt();
		return choice;
	}
	static void inputStudentData() {
		System.out.println("===== 정보 입력 =====");
		
		System.out.print("이름 : ");
		student.name = sc.next(); 
		
		System.out.print("국어 : ");
		student.kor = sc.nextInt();
		
		System.out.print("영어 : ");
		student.eng = sc.nextInt();
		
		System.out.print("수학 : ");
		student.math = sc.nextInt();
	}
	static void printStudentData() {
		System.out.println("===== 정보 출력 =====");
		System.out.println("이름 : "+student.name);
		System.out.println("국어 : "+student.kor);
		System.out.println("영어 : "+student.eng);
		System.out.println("수학 : "+student.math);
		System.out.println("총점 : "+student.total());
		System.out.println("평균 : "+student.average());
	}
	static void displayMessage() {
		
	}
}
