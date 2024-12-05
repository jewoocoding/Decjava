package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {
	/*
	 * 문제4
	 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	 * 첫번째 입력 : 2
	 * 두번째 입력 : 10
	 * 출력 : 2 3 4 5 6 7 8 9 10
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int num2 = sc.nextInt();
		
		if(num1 <1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요"); // 1보다 작은 수를 입력시 출력
		}else {
			System.out.print("출력 : ");
			if(num1 > num2) { // 첫번째 값이  두번째 값보다 클 경우
				for(int i=num1;i>=num2;i--) { // num1부터 num2까지 거꾸로 출력
					System.out.print(i+" ");
				}
			}else { // 두번째 값이 첫번째 값보다 클 경우
				for(int i=num1;i<=num2;i++) { // num1부터 num2까지 출력
					System.out.print(i+" ");
				}				
			}
		}
		
		
	}
}
