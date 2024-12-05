package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지
		 * 정수를 입력받고 -1이 입력되면
		 * 입력한 수의 합을 출력하시오.
		 * 값 : 1
		 * 값 : 2
		 * 값 : -1
		 * 합 : 3
		 */
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 누적합
		int input = 0; // 입력받을 값을 input에 저장
		
		while(input != -1) { // while이 -1이 되면 동작 멈춤
			System.out.print("값 : ");
			sum +=input; // 누적합
			input = sc.nextInt();
		}
		System.out.println("합 : " +sum);
		
		System.out.println();
		
		System.out.println("무한루프 사용");
		sum = 0;
		input = 0;
		while(true) { // 무한 반복
			System.out.print("값 : ");
			sum += input;
			input = sc.nextInt();
			if(input == -1) {
				System.out.print("합 : ");
				break; // 반복문 탈출
			}
		}
		System.out.println(sum);
		System.out.println();
		
		sum = 0;
		System.out.print("값 : ");
		int lastNum;
		while((lastNum = sc.nextInt()) != -1) {
			sum += lastNum;
			System.out.print("값 : ");
			lastNum = sc.nextInt();
		}
		System.out.println("합 : "+sum);
	}

}
