package com.dec.day06.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		/*
		 * 선택정렬이란?
		 * 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		 * 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬.
		 * 데이터의 양이 많을 때 급격한 성능 저하를 보임.
		 */
		int arrs[] = {2, 5, 4, 1, 3};
		
		int temp = 0, min = 0; // temp, min 값 초기화
		
		// index 0값 선택정렬
		min = 0; // 최소값을 0인덱스 값으로 설정
		for(int i = 1; i<arrs.length;i++) { // 최소값을 넣을 자리를 제외한 나머지값들 반복하며 비교
			if (arrs[min] > arrs[i]) // 최소값(추정)을 넣은 값보다 작은 경우 그 값이 있는 인덱스를 min이 가리키게 함
				min = i;
		}
		// min에 있는 값과 0인덱스값을 교환함
		temp = arrs[0];
		arrs[0] = arrs[min];
		arrs[min] = temp;
		
		// 두번째로 작은 값 정렬
		// index 1값 선택정렬
		min = 1; // 1인덱스를 최소값이라고 가정
		for(int i = 2; i<arrs.length;i++) { // 나머지 값들과 비교
			if (arrs[min] > arrs[i]) // 가장 작은 값의 인덱스를 가리키게 함
				min = i;
		}
		// 1인덱스에 두번째로 작은 값을 넣음
		temp = arrs[1];
		arrs[1] = arrs[min];
		arrs[min] = temp;
		
		// 배열 출력
		for(int num : arrs)
			System.out.print(num+" ");
		
		System.out.println();
		
		System.out.println("새로 정렬");
		
		min = 0; temp = 0; // min, temp 초기화
		for (int i = 0; i< arrs.length;i++) { // 앞에서 부터 정렬
			min =i; // 정렬할 인덱스를 가리키게 함
			for(int j=i; j<arrs.length; j++) { // 정렬할 인덱스부터 비교 시작
				// 더 작은 값을 min이 가리키게 함
				if (arrs[min] > arrs[j]) 
					min = j;
			}
			// 가장 작은 값을 가리키는 min인덱스와 i인덱스를 교환
			temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
			// debug를 위한 코드
			System.out.println((i+1)+"번째 반복");
			for(int num : arrs)
				System.out.print(num+" ");
			System.out.println();
		}
		
		System.out.println("최종");
		for(int num : arrs) // 정렬된 배열 출력
			System.out.print(num+" ");
//		if(arrs[0] > arrs[1]) {
//			// 인덱스 값을 기억하는 코드
//			min = 1;
//		}
//		if(arrs[0] > arrs[2]) {
//			min = 2;
//		}
//		if(arrs[0] > arrs[3]) {
//			min = 3;
//		}
//		if(arrs[0] > arrs[4]) {
//			min = 4;
//		}
		
	}
}
