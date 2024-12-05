package com.dec.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[] args) {
		/*
		 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		 * 입력받고 평균을 구하는 프로그램을 작성하라.
		 * 단, 배열의 크기는 5이다.	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계 변수 선언 및 초기화
		
		// 배열이름.length -> 배열의 길이 접근가능 메소드
		int[] arr = new int[5]; // 배열 선언, 생성, 초기화
		System.out.println(arr.length+"개의 정수를 입력해주세요.");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i] = sc.nextInt(); // 정수를 입력받아 i번째 index에 저장
			sum += arr[i]; // 배열의 모든 index값을 sum에 더함
		}
		
		double average = (double)sum/(arr.length); // 평균 구하기
		System.out.println("평균은 "+average+"입니다.");
		
	}
}
