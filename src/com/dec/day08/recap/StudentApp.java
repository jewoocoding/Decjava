package com.dec.day08.recap;

import java.util.Scanner;

// 배열은 같은 자료형끼리만 저장이 가능하지만 
// 클래스는 다양한 자료형들을 저장할 수 있다.
class Student { 
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	public int total() {
		return kor+eng+math;
	}
	
	public double average() {
		return (kor+eng+math)/3.0;
	}
	
	
}

public class StudentApp {
	/*
	 * 성적 입력 프로그램 (클래스 사용 버전)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student(); // Student 객체 생성
		
		end: // break end;를 만났을 때, 반복문을 빠져나오고 이쪽으로 옴
			 // 빠져나올 반복문 앞에 적어야 함
		while(true) {
			// 메인메뉴 출력
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> "); // 화면 선택
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : // 성적 입력 화면
					// Student 객체의 멤버변수에 값들 저장
					System.out.println("===== 성적 입력 =====");
					
					System.out.print("이름 : ");
					student.name = sc.next(); 
					
					System.out.print("국어 : ");
					student.kor = sc.nextInt();
					
					System.out.print("영어 : ");
					student.eng = sc.nextInt();
					
					System.out.print("수학 : ");
					student.math = sc.nextInt();
					
					break;
				case 2 :
					// Student 객체의 멤버변수를 사용하여 출력
					System.out.println("===== 성적 출력 =====");
					System.out.println("이름 : "+student.name);
					System.out.println("국어 : "+student.kor);
					System.out.println("영어 : "+student.eng);
					System.out.println("수학 : "+student.math);
					System.out.println("총점 : "+student.total());
					System.out.println("평균 : "+student.average());
					break ;
				case 3 : 
					//종료
					System.out.println("프로그램이 종료되었습니다.");
					break end; // 무한반복을 빠져 나와 end: 로 간다.
				default : 
					System.out.println("잘못된 번호를 입력하셨습니다.");
			}
			
			
		}
		
		
		
	}
}
