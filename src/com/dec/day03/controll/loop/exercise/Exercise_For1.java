package com.dec.day03.controll.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String[] args) {
		/*
		 * 2단을 출력해보겠습니다.
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ...
		 */
		// sysout 적고 ctrl+spacebar -> System.out.println();
		
//		System.out.println("2단을 출력해보겠습니다.");
//		
//		for(int i = 1; i<10;i++)
//			System.out.println("2 * "+i+" = "+2*i);
		
//		System.out.println("2 * 1 = 2"); // 2 = 2*1
//		System.out.println("2 * 2 = 4"); // 4 = 2*2
//		System.out.println("2 * 3 = 6"); // 6 = 2*3
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18"); // 18 = 2*9
		
		/*
		 * 문제1
		 * 정수 하나를 입력받아서 그 수가 1~9사이의 수일때만
		 * 그 수의 구구단을 출력하세요
		 * 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다"를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		// if문을 사용하여 1~9사이의 양수인지 검사
		System.out.println("----------------if문 사용-------------------");
		if( dan>0 && dan <10) { // AND연산자 이용하여 1~9인지 검사
			for(int i =1; i<10; i++) {
				System.out.println(dan+" * "+i+" = "+i*dan); //구구단 출력
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다");
		}
		// switch문을 사용하여 1~9사이의 양수인지 검사
		System.out.println("---------------switch문 사용------------------");
		switch(dan) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9 :
				for(int i = 1; i< 10; i++)
					System.out.println(dan+" * "+i+" = "+i*dan);
				break;
			default:
				System.out.println("1~9사이의 양수를 입력하여야 합니다");
		}
		
	}

}
