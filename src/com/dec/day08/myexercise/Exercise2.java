package com.dec.day08.myexercise;

import java.util.Scanner;

public class Exercise2 {
	/*
	 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 
	 * 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		ex.
		나이 : 19
		청소년
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : "); // 나이 입력 받음
		int age = sc.nextInt();
		
		String ageName = "";
		
		if(age <= 13) { 
			ageName = "어린이";
		}else if(age <= 19) {
			ageName = "청소년";
		}else {
			ageName = "성인";
		}
		System.out.println(ageName);
	}
}
