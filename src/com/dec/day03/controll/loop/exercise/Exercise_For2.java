package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	public static void main(String[] args) {
		/*
		 * 문제 2-1
		 * 1부터 10까지의 덧셈을 구하는 프로그램을 작성하여라.
		 * 
		 * 문제 2-2
		 * 1부터 10까지 덧셈을 표시하고 합도 구하는 프로그램을 작성하여라.
		 */
		
		// 덧셈할 변수 선언
		// 연산은 두 개의 항이 필요하므로 sum을 선언하여 i와 더해줌
		int sum = 0;
		
		System.out.println("문제 2-1");
		
		for(int i=1;i<=10;i++) {
			sum +=i; // i 들을 모두 더해 sum에 저장, 누적합
			// a = a + b -> a += b
			/*
			 * sum = 1;
			 * sum = 1+2; -> sum = sum +2;
			 * sum = 1+2+3; -> sum = sum +3;
			 * sum = 1+2+3+4; -> sum = sum +4;
			 * 
			 * sum = 1+2+3+4+5+6+7+8+9+10; sum = sum +10;
			 */
		}
		System.out.println(sum); // 합산 출력
		
		sum = 0; // sum 초기화 
		
		System.out.println("문제 2-2");
		
		for(int i=1;i<=10;i++) {
			sum += i; // i들을 더해 sum에 저장
			// switch 사용
			// 10뒤에 =이 오게, 조건문 사용
			switch(i) {
			case 10 : 
				System.out.print(i+" = ");
				break;
			default : 
				System.out.print(i+" + ");				
			}
		}
		
		System.out.println(sum);
		
		System.out.println();
		
		sum =0;
		System.out.print("정수 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			sum += i; // i들을 더해 sum에 저장
			// switch 사용
			// 10뒤에 =이 오게, 조건문 사용
			if(i == num) {
				System.out.print(i+" = ");
			}else {
				System.out.print(i+" + ");
			}
		}
		System.out.println(sum);
		
	}

}
