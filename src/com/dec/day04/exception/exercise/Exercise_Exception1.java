package com.dec.day04.exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아 나눈 후
		 * 그 결과를 출력하는 프로그램을 작성하여라.
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * while(true){}
		 * for(;;){}
		 */
		while(true) {
			int result = 0;
			try {
				System.out.print("첫번째 정수 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				int num2 = sc.nextInt();
				result = num1 / num2;
			// 멀티 catch절이 가능함.(catch 절을 여러번 쓸 수 있음)
			} catch (ArithmeticException e) {
				// e.printStackTrace();
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			} catch (InputMismatchException e) { // import해서 사용해야함
				System.out.println("정수를 입력해주세요.");
				sc.next(); // 무한으로 반복하지 않게 sc값을 초기화함
				// 입력한 문자가 sc.next() 안에 들어감 -> 반복하지 않음
				continue;
			}
			System.out.println("결과 : "+result);
		}

	}
}
