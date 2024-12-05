package com.dec.day05.array;

public class Exam_Array {
	public static void main(String[] args) {
		/*
		 * 배열의 선언
		 * 
		 * 배열의 생성
		 * 
		 * 배열의 초기화
		 * 
		 * 배열의 데이터 저장
		 * 
		 * 배열의 데이터 출력
		 */
		int [] nums; // 배열의 선언
		// new int[10]; -> 배열의 생성
		nums = new int[10]; // 배열의 생성과 초기화
		nums[0] = 11;
		nums[1] = 18;
		
		
		// System.out.println(nums[10]); //ArrayIndexOutOfBoundsException
		
		// for문으로 데이터 저장
		for(int i = 0; i < 10; i++)
			nums[i] = i+1;
		
		// for문으로 데이터 출력
		for(int i = 0; i < 10;i++)
			System.out.print(nums[i]+" "); // 배열데이터 출력

		System.out.println();
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]); // 데이터값을 넣기 전에는 0으로 초기화 되어있음
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
		
	}
}
