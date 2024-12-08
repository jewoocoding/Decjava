package com.dec.day09.myexercise;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 
		 * 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

			ex.
			문자열 : application
			문자 : i
			application에 i가 존재하는 위치(인덱스) : 4 8
			i 개수 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : "); // 문자열 입력받기
		String inputString = sc.next();
		
		char[] arrs = new char[inputString.length()]; // 문자열의 문자들을 저장할 배열 선언
		
		for(int i =0; i<arrs.length;i++) { // 입력받은 문자열을 배열에 깊은 복사
			arrs[i] = inputString.charAt(i);
		}
		
		System.out.print("문자 : "); // 문자하나를 입력받음
		char inputChar = sc.next().charAt(0);
		
		int count = 0; // 입력받은 문자가 몇번 있는지 셀 변수 선언
		
		System.out.print(inputString+"에 "+inputChar+"가 존재하는 위치(인덱스) : ");
		for(int i=0;i<arrs.length;i++) {
			if(inputChar == arrs[i]) { 
				System.out.print(i+" "); // 입력받은 문자와 같은 문자가 있는 위치를 출력
				count++; // 몇번 같았는지 셈
			}
		}
		System.out.println();
		System.out.println(inputChar+"의 개수 : "+count);
		
		
		
	}
}
