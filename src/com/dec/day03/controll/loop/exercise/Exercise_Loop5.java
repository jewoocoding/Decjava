package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {
	/*
	 * 문제5
	 * 사용자로부터 입력받은 숫자의 구구단을 출력하세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇단을 출력할 것인지 입력해주세요( 2 ~ 9 ) : ");
		int dan = sc.nextInt(); // 단수를 입력받음
		
		if(dan < 2 || dan >9) {
			System.out.println("2에서 9사이의 값을 입력해주세요."); // 2 ~ 9가 아니면 출력
		}else {
			for(int i=1; i<= 9;i++) {
				System.out.println(dan+" * "+ i+" = "+dan*i); // 구구단 출력
			}			
		}
	}
}
