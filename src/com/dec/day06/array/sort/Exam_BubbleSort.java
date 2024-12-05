package com.dec.day06.array.sort;

public class Exam_BubbleSort {
	public static void main(String[] args) {
		/*
		 * 버블정렬이란?
		 * 인접한 두 개의 원소를 검사하여 정렬하는 방법.
		 * 구현이 쉽다는 장점, 이미 정렬된 데이터를 정렬할때 가장 빠름.
		 * 기본적으로 다른 정렬에 비새ㅓ 속도가 느린편이며 역순으로 정렬할 때 가장 느림.
		 */
		
		int[] arrs = {2, 5, 4, 1, 3}; // 배열 생성
		
		// 0의 자리에는 i
		// 1의 자리에는 i+1
		// i가 0부터 3까지 증가
//		for(int i=0; i<4; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
		
		for(int j=arrs.length-1; j>0; j--) { // 한번 반복할 때마다 맨 오른쪽에 최대값이 배치됨
			
			for(int i=0; i<j; i++) { // 0인덱스 부터 정렬되지 않은 인덱스 까지 비교
				
				if(arrs[i] > arrs[i+1]) { // 0인덱스부터 인접 인덱스와 비교하여 큰값을 오른쪽에 배치
					// 전자가 후자보다 클 때, value를 교환함
					int temp = arrs[i+1];
					arrs[i+1] = arrs[i];
					arrs[i] = temp;
				}
			}
		}
		
//		for(int i=0; i<4; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i=0; i<3; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i=0; i<2; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
//		
//		for(int i=0; i<1; i++) {
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
		
		for(int num : arrs)
			System.out.print(num+" "); 
		
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[0];
//			arrs[0] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[2];
//			arrs[2] = temp;
//		}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[3];
//			arrs[3] = temp;
//		}
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[3];
//			arrs[3] = arrs[4];
//			arrs[4] = temp;
//		}
		
	}
}
