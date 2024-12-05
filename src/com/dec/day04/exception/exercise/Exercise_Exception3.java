package com.dec.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception3 {
	public static void main(String[] args) {
		/*
		 * 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라
		 * 사용자가 정수가 아닌 문자를 입력할 때 발생하는 
		 * InputMismatchException 예외를 처리하여 다시 입력받도록 하여라.
		 * 정수 3개를 입력하세요.
		 * 11 2 3
		 * 합은 16
		 * 
		 * 정수 3개를 입력하세요.
		 * 11 a
		 * 정수를 입력해주세요
		 * 2 3
		 * 합은 16
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		
		System.out.println("정수 3개를 입력하세요.");
		for(int i = 0; i < 3; i++) { // 3번 입력 받음
			try {
				num = sc.nextInt(); // 입력
				sum += num; // 입력된 정수를 sum에 더함
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력해주세요."); // 문자를 입력했을 때
				sc.next();
				i--; // 3개를 입력받기 위해 i를 하나 줄여서 의미없는 반복을 없앰
			}
		}
		System.out.println("합은 "+sum);
	}
}