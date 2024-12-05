package com.dec.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 */
		
		int arrs[] = {2, 5,  4, 1, 3}; // 배열 생성
		
		for(int i =1; i<arrs.length; i++) { // 1인덱스부터 선택
			
			for(int j = i; j>0; j--) { // 선택한 인덱스 앞에 있는 값들과 비교
				
				if(arrs[j-1] > arrs[j]) { // 앞에 있는 값들(정렬되어있음)보다 작으면 앞으로 보냄
					// 앞의 값과 교환
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;
				}
			}
		}
		
		for(int num : arrs)
			System.out.print(num+" "); // 배열 출력
		
		System.out.println();
		
		
//		// #1
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// #2
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] =arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// #3
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] =arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		// #4
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
//		}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] =arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}

	}
}
