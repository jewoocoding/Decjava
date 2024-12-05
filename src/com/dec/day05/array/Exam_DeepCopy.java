package com.dec.day05.array;

public class Exam_DeepCopy {
	public static void main(String[] args) {
		// 깊은 복사 (Deep Copy)
		// 배열을 하나 생성하여 인덱스값을 복사
		int origins[] = {24, 11, 18, 25, 5, 2};
		int copied[] = new int[origins.length];
		
		// 복사하는 코드 (깊은 복사)
		for(int i=0; i<copied.length;i++)
			copied[i] = origins[i];
		
//		int k = 0;
//		for(int value : origins) {
//			copied[k] = value;
//			k++;
//		}
		
		copied[0] = 25;
		origins[3] = 26;
		for(int i=0; i<copied.length;i++)
			System.out.print(copied[i]+" ");
		System.out.println();
		
		for(int num : copied) // for-each문 사용
			System.out.print(num+" ");
		System.out.println();
		
		for(int i=0; i<origins.length;i++)
			System.out.print(origins[i]+" ");
		System.out.println();
		
		for(int num : origins) { // for-each문 사용
			System.out.print(num + " ");
		}
	}
}
