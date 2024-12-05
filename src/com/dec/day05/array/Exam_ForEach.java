package com.dec.day05.array;

public class Exam_ForEach {
	public static void main(String[] args) {
		int [] nums = {24, 12, 25, 1, 2};
//		for(int i=0; i < nums.length; i++)
//			System.out.println(nums[i]);
		
		for(int num : nums) { // for each 문
			System.out.print(num+" ");
		}
		System.out.println();
		int sum = 0;
		for(int num : nums) { // type은 기존의 type과 똑같아야 함 
			sum += num;
		}
		System.out.println("합은 : "+sum);
		
		String [] fruits = {"딸기", "체리", "자두", "사과", "포도", "용과"};
		
		for(int i=0;i<fruits.length;i++)
			System.out.print(fruits[i]+ " ");
		System.out.println();
		for(String name : fruits)
			System.out.print(name + " ");
	}
}
