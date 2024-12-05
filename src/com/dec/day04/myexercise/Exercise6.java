package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		// 단보다 작거나 같은 경우까지만 출력하는 프로그램
		for(int i=2;i<=9;i++) {
			System.out.println("==== "+i+"단 출력 ====");
			for(int j=1;j<=i;j++)
				System.out.println(i+" * "+j+" = "+i*j);
		}


	}

}
