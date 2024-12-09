package com.dec.day09.recap;

import java.util.Scanner;

class Student { 
	// static 메소드 안에서는 static 변수와 메소드만 사용할 수 있기 때문에 static을 붙여줌
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	
	public static int total() {
		return kor+eng+math;
	}
	
	public static double average() {
		return total()/3.0; // static이기 때문에 this도 필요없음
	}
	
}

public class StudentAppGuJo {
	
	static Scanner sc = new Scanner(System.in);
	// static변수와 메소드를 사용하기 때문에 객체생성이 필요없어짐
	// Student student = new Student();
	
	public static void main(String[] args) { // 구조적프로그래밍으로 메인메소드를 보기 쉽게함
		// 프로그램이 한눈에 파악됨
	
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1 : 
					inputStudentData();
					break;
				case 2 : 
					printStudentData();
					break;
				case 3 : 
					displayMessage("프로그램이 종료되었습니다.");
					break end;
				default :
					displayMessage("잘못된 번호를 입력하셨습니다.");
			}
		}
	}
	
	static int printMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> "); // 화면 선택
		int choice = sc.nextInt();
		return choice;
	}
	
	static void inputStudentData() {
		System.out.println("===== 성적 입력 =====");
		System.out.print("이름 : ");
		Student.name = sc.next(); 
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
	}
	
	static void printStudentData() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("이름 : "+Student.name);
		System.out.println("국어 : "+Student.kor);
		System.out.println("영어 : "+Student.eng);
		System.out.println("수학 : "+Student.math);
		System.out.println("총점 : "+Student.total());
		System.out.println("평균 : "+Student.average());
	}
	
	static void displayMessage(String message) {
		System.out.println(message);
	}
}
