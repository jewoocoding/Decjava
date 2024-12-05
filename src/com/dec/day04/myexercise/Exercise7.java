package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		/*
		 * 		*
		 * 	   ***
		 * 	  *****
		 *     ***
		 *      *
		 *  출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0;i<input;i++) {
			if(i < input/2) { // 사각형의 상체(피라미드)
				for(int k=input-1; k>i;k--) // 행이 내려갈수록 space가 적어지게
					System.out.print(" ");
				for(int j=0; j<2*i+1; j++) { // 행이 내려갈수록 *이 많아지게
					System.out.print("*");
				}				
			}else { // 사각형의 하체(역 피라미드)
				for(int k=0; k<i;k++) // 행이 내려갈수록 space가 많아지게
					System.out.print(" ");
				for(int j=2*input-1; j>2*i; j--) // 행이 내려갈수록 *이 적어지게
					System.out.print("*");
			}
			System.out.println();
		}



	}

}
