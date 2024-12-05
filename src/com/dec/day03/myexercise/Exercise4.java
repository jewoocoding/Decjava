package com.dec.day03.myexercise;

import java.util.Scanner;

public class Exercise4 {
//	while문을 이용하여 -1이 될때까지 정수 여러개를 입력받고 평균을 출력하시오.
//
//	정수를 입력하고 마지막에 -1을 입력하세요
//
//	10
//
//	20
//
//	3
//
//	20
//
//	10
//
//	1
//
//	정수의 개수는 5개이며 평균은 0.6입니다.
//
//	정수를 입력하고 마지막에 -1을 입력하세요
//
//	1
//
//	입력된 수가 없습니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요");
		double input = 0;
		double sum = 0;
		int count=0;
		double average = 0;
		
		while(input !=-1) {
			sum += input;
			input = sc.nextDouble();
			count++;
		}
		count--;
		average = sum/count;
		System.out.println("정수의 개수는 "+count+"개이며 평균은 "+average+"입니다.");
	}
}
