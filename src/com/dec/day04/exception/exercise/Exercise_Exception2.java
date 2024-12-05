package com.dec.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String [] args) {
		/*
		 * 두 개의 정수를 입력받아 나눈 후 
		 * 그 결과를 출력하는 프로그램을 작성하여라.
		 */
		/*
		 * 1. try ~ catch
		 * 2. 무한반복
		 * 3. 알맞은 예외, 메세지 그리고 코드 작성
		 * 4. 테스트
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int num1 = 0, num2 = 0;
		
		while(true) {
			System.out.println("나눗셈 프로그램 실행");
			try {
				System.out.print("첫번째 정수 입력 : ");
				num1 = sc.nextInt(); // nextInt()는 문자를 처리하지 못 하기 때문에 문자가 계속 들어감
				System.out.print("두번째 정수 입력 : ");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) { // import해서 사용해야함
				System.out.println("정수를 입력해주세요.");
				sc.next(); // 무한으로 반복하지 않게 sc값을 초기화함
				// 입력한 문자가 sc.next() 안에 들어감 -> 반복하지 않음
				continue;
			}
			
			result = num1 / num2;
			System.out.println("결과 : " + result);
			
		}
	}
}