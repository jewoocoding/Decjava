package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int j=input; j>0;j--) {
			for(int i =0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
