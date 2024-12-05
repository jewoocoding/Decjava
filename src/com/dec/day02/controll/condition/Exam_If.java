package com.dec.day02.controll.condition;

import java.util.Scanner;

public class Exam_If {
	public static void main(String[] args) {
		/*
		 * 제어문 - 조건문
		 * 문법
		 * if( 조건식) { 실행문장; }
		 * else { 실행문장2; }
		 */
		
		// 예제. 입력받은 정수가 0보다 큰지 판별하는
		// 프로그램을 작성하여라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		if(input > 0) {
			System.out.println("크다.");
		} else {
			System.out.println("크지 않다.");
		}
		
		// 예제2. 정수를 입력받아 짝수인지 홀수인지 판별하는 프로그램을 작성하시오
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		// 예제3. 입력받은 정수가 양의 정수인지, 음의 정수인지 아니면 0인지
		// 판별하는 프로그램을 작성하시오.
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		
		// 삼항연산자로 작성해보기
		// 중첩 삼항연산, 중첩 if와 유사
		String result = (input == 0) ? "0입니다." : (input > 0) ? "양의 정수입니다." : "음의 정수입니다.";
		System.out.println(result);
		
		if(input > 0) {
			System.out.println("양의 정수입니다.");
		} else {
			if(input == 0) {
				System.out.println("0입니다.");
				System.out.println("다시 입력해주세용");
			}else {
				System.out.println("음의 정수입니다.");				
			}
		}
		
		if(input == 0) {
			System.out.println("0입니다.");
		}else {
			if(input > 0) {
				System.out.println("양의 정수입니다.");
			}else {
				System.out.println("음의 정수입니다.");
			}
		}
		
		if(input > 0) {
			System.out.println("양의 정수입니다.");
		}else if(input == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음의 정수입니다.");
		}
	}

}
