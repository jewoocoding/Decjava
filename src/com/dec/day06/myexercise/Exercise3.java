package com.dec.day06.myexercise;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		// 값 5개 입력받아 정렬
		Scanner sc = new Scanner(System.in);
		
		int [] arrs = new int[5]; // 크기가 5인 배열 생성
		
		for(int i =0; i< arrs.length;i++) { // 정수 입력받아 배열에 저장
			System.out.print((i+1)+"번째 정수 입력 : ");
			int input = sc.nextInt();
			arrs[i] = input;
		}
		
		// 버블 정렬
		for(int j=arrs.length-1; j>0;j--) { // 모든 값을 비교해 마지막에 넣고,
			//  정렬된 인덱스 제외하고 앞의 값들을 정렬
			for(int i=0; i<j;i++) { // 0부터 j까지 반복해서 비교
				
				if(arrs[i] > arrs[i+1]) { // 인접한 값들을 비교해 큰값을 뒤로 보냄
					int temp = arrs[i];
					arrs[i] = arrs[i+1];
					arrs[i+1] = temp;
				}
			}
		}
		
		System.out.print("정렬된 결과 : ");
		for(int num : arrs) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("정렬 후 첫번째 수와 마지막수의 합 : "+(arrs[0]+arrs[4]));
		
		for(int i =0; i< arrs.length;i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			int input = sc.nextInt();
			arrs[i] = input;
		}
		
		// 선택 정렬
		int min = 0; // 포인터 설정
		for(int i=0; i< arrs.length;i++) { // 앞의 인덱스부터 정렬
			min = i; // 정렬된 값 제외하고 바로 다음값에 포인터 설정
			for(int j=i+1;j<arrs.length;j++) { // 포인터 다음 값부터 비교 시작
				if(arrs[min] > arrs[j]) // 가장 작은 값에 포인터를 설정함
					min = j;
			}
			int temp = arrs[i]; // 정렬할 위치와 포인터가 가리키고 있는 위치의 값 교환
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		
		for(int num : arrs) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		
	}
}
