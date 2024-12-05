package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {
	/*
	 * 문제2
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 정수 입력 : 5
	 * 출력 : 5 4 3 2 1
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해 주세요 : ");
		int input = sc.nextInt(); // 입력받기
		
		if(input < 1) {
			System.out.println("1보다 큰 수를 입력해주세요."); // input이 1보다 작으면 출력
		}else {
			for(int i = input; i >= 1; i--) { // input부터 1까지 출력
				System.out.print(i+" "); 
			}
		}
		
	}
}
