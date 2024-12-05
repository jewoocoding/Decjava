package com.dec.day07.dimarray.exercise;

// 기능용 클래스
public class Exercise_DimArray {
	
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		
		int nums[][] = new int[5][5]; // 2차원 배열 생성
		int count = 1; // 배열에 넣을 숫자 
		
		for(int i =0; i<nums.length;i++) { // 0행부터 시작
			for(int j=nums[i].length-1; j>=0;j--) { // 각 열에 역순으로 접근
				nums[i][j] = count; // count 값을 배열에 넣음
				count++; // 숫자를 점점 크게 하여 넣음
			}
		}
		
		// 배열 출력 코드
		for(int i=0; i< nums.length; i++) {
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21		
		
		int nums[][] = new int[5][5]; // 2차원 배열 생성
		int count = 1; // 배열에 넣을 숫자 
		
		for(int i =0; i<nums[0].length;i++) { // 0열부터 시작 -> 정방형이기 때문에 열부터 접근 가능
			for(int j=nums.length-1; j>=0;j--) { // 각 행에 역순으로 접근
				nums[j][i] = count; // count 값을 배열에 넣음
				count++; // 숫자를 점점 크게 하여 넣음
			}
		}
		
		// 배열 출력 코드
		for(int i=0; i< nums.length; i++) {
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int nums[][] = new int[5][5]; // 2차원 배열 생성
		int count = 1; // 배열에 넣을 숫자 
		
		for(int i =0; i<nums[0].length;i++) { // 0열부터 시작 -> 정방형이기 때문에 열부터 접근 가능
			for(int j=0; j<nums.length;j++) { // 각 행에 차례대로 숫자를 넣음
				nums[j][i] = count; // count 값을 배열에 넣음
				count++; // 숫자를 점점 크게 하여 넣음
			}
		}
		
		// 배열 출력 코드
		for(int i=0; i< nums.length; i++) {
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int nums[][] = new int[5][5]; // 2차원 배열 생성
		int count = 1; // 배열에 넣을 숫자 
		
		for(int i =0; i<nums.length;i++) { // 0행부터 시작
			if(i%2 ==0) { // 짝수 행일 때
				for(int j=0; j<nums[i].length;j++) { // 각 열에 차례대로 숫자를 넣음
					nums[i][j] = count; // count 값을 배열에 넣음
					count++; // 숫자를 점점 크게 하여 넣음
				}
			}else { // 홀수 행일 때
				for(int j=nums[i].length-1; j >= 0;j--) { // 각 열에 거꾸로 숫자를 넣음
					nums[i][j] = count; // count 값을 배열에 넣음
					count++; // 숫자를 점점 크게 하여 넣음
				}
			}
		}
		
		// 배열 출력 코드
		for(int i=0; i< nums.length; i++) {
			for(int j=0; j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		}
	}

//	arrs[4][0] = 1;
//	arrs[3][0] = 2;
//	arrs[2][0] = 3;
//	arrs[1][0] = 4;
//	arrs[0][0] = 5;
//	
//	arrs[4][1] = 6;
//	arrs[3][1] = 7;
//	arrs[2][1] = 8;
//	arrs[1][1] = 9;
//	arrs[0][1] = 10;
//	
//	arrs[4][2] = 11;
//	arrs[3][2] = 12;
//	arrs[2][2] = 13;
//	arrs[1][2] = 14;
//	arrs[0][2] = 15;
//	
//	arrs[4][3] = 16;
//	arrs[3][3] = 17;
//	arrs[2][3] = 18;
//	arrs[1][3] = 19;
//	arrs[0][3] = 20;
//	
//	arrs[4][4] = 21;
//	arrs[3][4] = 22;
//	arrs[2][4] = 23;
//	arrs[1][4] = 24;
//	arrs[0][4] = 25;




}
