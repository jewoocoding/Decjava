package com.dec.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator1 {
	public static void main(String[] args) {
		/*
		 * 정수 하나를 입력받아서 짝수인지 판별하는
		 * 프로그램을 작성하여라.
		 * 정수 하나 입력 : 4
		 * 짝수 여부 : true
		 * 
		 * 정수 하나 입력 : 3
		 * 짝수 여부 : false
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		// 짝수 판별 : %, num % 2 == 0
		boolean result = (input%2) == 0;
		System.out.println("짝수 여부 : "+ result);
	}

}
