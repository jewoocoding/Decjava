package com.dec.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String[] args) {
		
		int [] arrs = {1, 3, 2};
		
		int temp = arrs[1]; // 1인덱스 값을 temp에 저장
		arrs[1] = arrs[2]; // 2인덱스 값을 1인덱스에 저장
		arrs[2] = temp; // temp에 저장된 값을 2인덱스에 저장
		
		for(int num : arrs)
			System.out.print(num+" "); // 배열 출력
	}
	
}
