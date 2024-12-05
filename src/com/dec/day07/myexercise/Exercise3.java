package com.dec.day07.myexercise;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 
		 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요. 
		 * 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하면서 
		 * 다시 사용자가 값을 입력하도록 하세요.

			Hint. ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
			ex) 2, 3, 5, 7, 11 …
			
			ex.
			숫자 : 5 
			소수입니다. 
			
			숫자 : 9 
			소수가 아닙니다. 
			
			숫자 : 0
			잘못 입력하셨습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : "); 
			int input = sc.nextInt(); // 숫자 입력 받음
			
			if(input < 2) { // 2보다 작은 값을 입력받을 시 다시 반복
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}else {
				int count = 0; // 몇 번 나누어 떨어지는지 확인
				for(int i=1; i<input ;i++) { 
					if(input % i == 0) { // 1부터 입력한 값까지 반복해 나머지를 구해봄
						count++; // 나누어 떨어지는 수가 몇개인지 셈
					}
				}
				switch(count) {
				case 1 : // 나누어 떨어지는 수가 자신과 1밖에 없으면 소수
					System.out.println("소수입니다.");
					break;
				default : 
					System.out.println("소수가 아닙니다.");
				}
			}	
		}
	}
}
