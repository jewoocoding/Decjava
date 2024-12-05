package com.dec.day04.recap;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int korean = -1, english = -1, math = -1, sum = -1; // 국영수점수, 합계 변수 선언 및 초기화
		
		// 무한반복을 하기 위한 반복문
		// 1. for(;;) {}
		// 2. while(true) {}
		
		while(true) {	// 메인메뉴가 계속 출력되도록 반복 
			// 메인메뉴 출력
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> "); // 화면 선택
			int input = sc.nextInt();
			
			switch(input) {
				case 1 :
					/*
					 * 지역변수 : case 1 : 에서 변수를 선언하면 case 2 : 에서 사용을 못 함
					 * 지역변수의 기준 : 중괄호 {} but switch문에서는 case 안이 지역변수의 기준이 됨
					 */
					sum = 0; // 총점 초기화
					System.out.println("===== 성적 입력 ====="); // 성적입력 페이지
					System.out.print("국어 : ");
					korean = sc.nextInt();
					System.out.print("영어 : ");
					english = sc.nextInt();
					System.out.print("수학 : ");
					math = sc.nextInt();
					sum = korean + math + english; // 총점 계산
					if((korean < 0 || english < 0) || math <0) {
						System.out.println("0보다 큰 값을 입력해주세요.");
					}
					break;
				case 2 : 
					if((korean < 0 || english < 0) || math <0) {
						System.out.println("성적이 입력되지 않았습니다.");
					}else {
						System.out.println("===== 성적 출력 =====");
						System.out.println("국어 : "+korean);
						System.out.println("영어 : "+english);
						System.out.println("수학 : "+math);
						System.out.println("총점 : "+sum); 
						System.out.println("평균 : "+(double)sum/3); // 평균을 실수로 형변환하여 계산					
					}
					break;
				case 3 : 
					System.out.println("프로그램이 종료되었습니다.");
					return; // 프로그램 종료
				default :
					System.out.println("메뉴에 있는 번호를 선택해주세요");
			}
		}
		
	}

}
