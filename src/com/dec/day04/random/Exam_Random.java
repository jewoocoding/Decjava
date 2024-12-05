package com.dec.day04.random;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random(); // Random 클래스 사용
		
		// rand.nextInt(n);
		// n을 넘겨주면 rand.nextInt(n)의 결과값은 0 ~ n-1 사이의 랜덤한 수를 리턴함.
		// for(int i=0; i<10;i++)
		// 		System.out.print(rand.nextInt(10)+" "); // 10이면 0 ~ 9 사이의 랜덤한 수
		// 1 ~ 10 사이의 랜덤한 수를 출력하는 프로그램을 작성하여라.
//		for(int i =0; i<50;i++) {
//			System.out.print((rand.nextInt(10)+1)+" ");		
//		}
		// 25 ~ 35 사이의 랜덤한 수를 출력하는 프로그램을 작성하여라.
//		for(int i=0;i<50;i++)
//			System.out.print((rand.nextInt(11)+25)+" ");
		
		System.out.println((int)(Math.random()*10)); // 0 ~ 1까지의 랜덤한 값 출력
		
		// Math.random()*(최대-최소+1) + 최소 -> 최소 ~ 최대 사이의 난수
		// 1 ~ 10 사이의 난수를 
		// Math.random()*(10-1+1) +1
		System.out.println((int)(Math.random()*10+1));
	}

}
