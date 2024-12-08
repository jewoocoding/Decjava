package com.dec.day09.myexercise;

import java.util.Scanner;

public class Exercise4 {
	/*
	 * 주제 : 5개의 정수를 입력후 입력한 값들이 오름차순 정렬로 표현 되도록 구현하시오
	 * ex1)
		1번째 정수 입력 : 7
		2번째 정수 입력 : 4
		3번째 정수 입력 : 8
		4번째 정수 입력 : 5
		5번째 정수 입력 : 1
		정렬된 결과 : 1 4 5 7 8
		정렬 후 첫번째 수와 마지막수의 합 : 9
		
		ex2)
		1번째 정수 입력 : 5
		2번째 정수 입력 : 4
		3번째 정수 입력 : 3
		4번째 정수 입력 : 2
		5번째 정수 입력 : 1
		정렬된 결과 : 1 2 3 4 5
		정렬 후 첫번째 수와 마지막수의 합 : 6
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input[] = new int[5]; // 입력받은 수를 저장할 배열 생성
		
		for(int i=0;i<input.length;i++) { // 배열의 크기 만큼 입력 받음
			System.out.print((i+1)+"번째 정수 입력 : ");
			input[i] = sc.nextInt();
		}
		
		// 버블정렬
		for(int i = input.length-1; i>0; i--) { // 맨뒤에 가장 큰수를 더함
			for(int j = 0; j< i; j++) { // 0인덱스부터 비교 시작
				if(input[j] > input[j+1]) { // 전인덱스가 후인덱스 보다크면 교환
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		System.out.print("정렬된 결과 : "); // 정렬 결과 출력
		for(int num : input) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("정렬 후 첫번째 수와 마지막 수의 합 : "+(input[0]+input[4]));
		
	}
}
