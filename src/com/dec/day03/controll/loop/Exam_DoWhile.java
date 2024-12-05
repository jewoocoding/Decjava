package com.dec.day03.controll.loop;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String[] args) {
		/*
		 * 제어문 - 반복문
		 * 3. do ~ while
		 * do {
		 * 	실행문장;
		 * 	증감식;
		 * }while(조건식);
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0, sum = 0;
		
		do {
			System.out.print("값 : ");
			input = sc.nextInt();
			if(input == -1) break;
			sum += input;
		}while(input != -1);
		System.out.println("합 : "+sum);
	}
}
