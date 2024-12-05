package com.dec.day03.controll.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
		/*
		 * 2 ~ 9단 구구단을 출력하시오.
		 */
		
		// 중첩 for문
		for(int j=2; j<=9;j++) {
			System.out.println("===="+j+"단 출력====");
			for(int i=1;i<10;i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}
		}
		
//		for(int i=1;i<10;i++) {
//			System.out.println("3 * "+i+" = "+3*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("4 * "+i+" = "+4*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("5 * "+i+" = "+5*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("6 * "+i+" = "+6*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("7 * "+i+" = "+7*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("8 * "+i+" = "+8*i);			
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println("9 * "+i+" = "+9*i);			
//		}
		
		
	}
}
