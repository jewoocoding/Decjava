package com.dec.day04.typetrans.exercise;

import java.util.Scanner;

public class Exercise_TypeTrans {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, count = 0;
		
		System.out.print("정수 입력 : "); // 처음으로 -1을 입력했을 때 sum에 -1을 더하지 않게 
		int input = sc.nextInt();
		
		while(input != -1) { // -1을 입력하기 전 까지
			sum += input; // 입력된 값을 sum에 더함
			count++; // 몇번 입력했는지 카운트
			System.out.print("정수 입력 : "); // 입력 받기
			input = sc.nextInt();
		}
		
		if( count == 0) {
			System.out.println("입력된 값이 없습니다."); // 한번도 입력되지 않았을 경우
		}else {
			System.out.println("합 : "+sum);
			System.out.println("평균 : "+ (double)sum/count);
		}
	}

}
