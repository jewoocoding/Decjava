package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {
	/*
	 * 문제3
	 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
	 * 더해지는 숫자를 표시해주세요.
	 * 정수 하나 입력 : 5
	 * 1+2+3+4+5=15
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력해주세요 : ");
		int input = sc.nextInt(); // 정수입력받음
		int sum = 0; // 정수들의 합을 저장할 변수
		
		if(input < 1) {
			System.out.println("1보다 큰 수를 입력해주세요."); // 1보다 작으면 다시입력
		}else {
			for(int i=1;i<=input;i++) { // 입력받은 수만큼 반복
				sum += i; // 1부터 input까지 누적합을 sum 에 저장
				
				if(i == input) {
					System.out.print(i+"="); // 마지막 수에서 =을 출력
				}else {
					System.out.print(i+"+"); // 숫자 뒤에 +를 출력				
				}
			}
			System.out.println(sum);
		}
	}
}
