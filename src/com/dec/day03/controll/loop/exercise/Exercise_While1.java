package com.dec.day03.controll.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		/*
		 * 문제 1-1
		 * while문을 이용하여 1 ~ 10까지의 수를 더한 값을 출력하시오.
		 * 문제 1.2
		 * while문을 이용하여 1 ~ 100사이의 홀수의 합을 출력하시오.
		 */
		System.out.println("문제 1-1");
		int sum=0; // 누적합 변수 선언
		int i = 1; // 초기식
		
		while(i<=10) { // 1부터 10까지 반복
			
			sum += i; // i들의 합을 sum에 저장
			if(i != 10) {
				System.out.print(i +"+");
			}else {
				System.out.print(i+"=");
			}
			i++; // 증감식
			
		}
		System.out.println(sum); // 1 ~ 10까지의 합 출력
		
		System.out.println("문제 1-2");
		
		sum = 0; // 누적합을 저장할 변수 초기화
		i = 1; // 초기식 초기화
		
		// #1
		while(i<=100) { // i가 100이 될 때까지 반복
			
			if(i%2 == 1) { // 홀수일때만 동작
				sum += i; // i가 홀수일 때의 합을 sum에 저장
				if(i != 99)
					System.out.print(i+"+");
				else
					System.out.print(i+"=");
			}
			
			i++; // 증감식
		}
		System.out.println(sum); // 1~100까지의 홀수의 합 출력
		// #2
		sum = 0;
		i = 1;
		while(i<=100) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
	}
}
