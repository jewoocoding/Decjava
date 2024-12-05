package com.dec.day02.operator;

public class Exam_comparison {
	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * >, <, >=, <= 대소비교
		 * ==, != 동등비교
		 */
		int num1 = 50;
		int num2 = 30;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		boolean result;
		result = (num1 > num2);
		System.out.println("num1 > num2 : "+result);
		result = num1 < num2;
		System.out.println("num1 < num2 : "+result);
		result = num1 == num2;
		System.out.println("num1 == num2 : "+result);
		result = num1 != num2;
		System.out.println("num1 != num2 : "+result);
		// num1의 값이 1과 10사이의 수인지 판별하는 프로그램을 작성하여라.
		// 1 <= num1 <= 10 -> 1 <= num1 && num1 <= 10
	}

}
