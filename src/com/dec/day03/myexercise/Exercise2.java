package com.dec.day03.myexercise;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int space = input-1;
		
		for(int i=1; i<= input; i++) { // row 출력
			
			for(int k = 0; k<space;k++) { // space 출력
				System.out.print(" ");
			}
			space--; // space는 첫번째 행에서 가장 많고 점점 줄기 때문에 감소시킴
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*"); // *출력
			}
			
			
			System.out.println();
		}
		
	}
}
