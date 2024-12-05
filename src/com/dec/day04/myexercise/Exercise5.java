package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		// 짝수 구구단만 출력
		for(int i=1; i<=9; i++) {
			if( i % 2 == 0) {
				System.out.println("===== "+i+"단 출력 ====");
				for(int j=1; j<=9;j++) {
					System.out.println(i+" * "+j+" = "+i*j);
				}	
			}else {
				continue;
			}
		}

	}

}
