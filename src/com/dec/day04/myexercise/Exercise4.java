package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=input; i>0;i--) {
			for(int j=0; j<i-1;j++) {
				System.out.print(" ");
			}
			for(int k=i-1; k<input; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
