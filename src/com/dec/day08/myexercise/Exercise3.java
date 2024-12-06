package com.dec.day08.myexercise;

import java.util.Scanner;

public class Exercise3 {
	/*
	 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.

		ex.
		주민번호를 입력하세요(- 포함) : 132456-2123456
		여자
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String input = sc.next();
		
		switch(input.charAt(7)) {
			case '1', '3' :
				System.out.println("남자");
				break;
			case '2', '4' :
				System.out.println("여자");
				break;
			default : 
				System.out.println("잘못입력하셨습니다.");
			
		}
	}
}
