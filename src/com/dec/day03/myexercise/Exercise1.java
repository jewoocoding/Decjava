package com.dec.day03.myexercise;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//
//		정수 입력 : 5
//
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input;i++) { // 박스의 row(행)반복
			for(int j=0; j<input; j++) { // 박스의 column(열)반복
				
				if(i == 0 || i ==input-1) { //박스의 첫번째, 마지막 행에서 동작
					System.out.print("*");					
				}else { // 박스 중간에서 동작
					if(j == 0 || j == input-1) { // 박스 한 행에서 첫번째 열과 마지막열에 *			
						System.out.print("*");					
					}else {
						System.out.print(" "); // 박스 중간에는 space
					}
				}
				
			}
			System.out.println();
		}
	}
}
