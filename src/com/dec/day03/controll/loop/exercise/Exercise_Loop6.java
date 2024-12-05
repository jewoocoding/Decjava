package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {
	/*
	 * 문제6
	 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
	 * 단을 입력하세요 : 5
	 * 5단부터 9단까지 출력
	 * 단을 입력하세요 : 10
	 * 9 이하의 숫자만 입력해주세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		if(dan < 2 || dan > 9) {
			
			System.out.println("9이하의 숫자만 입력해주세요"); // 9이상일 경우 출력
			
		}else {
			for(int i = dan; i<=9; i++) { // dan부터 9단까지 반복
				
				System.out.println("===="+i+"단 출력====");
				
				for(int j=1; j<=9; j++) { // 단 내용 출력
					System.out.println(i+" * "+j+" = "+i*j);
				}
				
			}
			
		}
		
	}
	
}
