package com.dec.day05.recap;

import java.util.Scanner;

public class StudentAppArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[3];
		/*
		 * 				kor		,	eng		,  math
		 * scores  <-  scores[0], scores[1], scores[2] 
		 */
		// int kor = 0, eng = 0, math = 0;
		finish: // 프로그램 종료시 이쪽으로 오게 됨
		while(true) {
			
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1 :
				System.out.println("===== 성적 입력 =====");
				System.out.print("국어 : ");
				scores[0] = sc.nextInt();
				System.out.print("영어 : ");
				scores[1] = sc.nextInt();
				System.out.print("수학 : ");
				scores[2] = sc.nextInt();
				break;
			case 2 : 
				System.out.println("===== 성적 출력 =====");
				System.out.println("국어 : "+scores[0]);
				System.out.println("영어 : "+scores[1]);
				System.out.println("수학 : "+scores[2]);
				System.out.println("총점 : "+(scores[0] + scores[1] + scores[2]));
				System.out.println("평균 : "+(scores[0]+scores[1]+scores[2])/(double)scores.length);
				break;
			case 3 : 
				System.out.println("프로그램이 종료되었습니다.");
				// return; // main 메소드 종료
				break finish; // break; -> switch가 깨짐
				// break 후 finish로 이동
			default : 
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
				break; 
				
			}
		}
	}
}
