package com.dec.day03.controll.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String[] args) {
		
		for(int i=1; i<=9;i++) {
			for(int j=2; j<=9;j++) {
				System.out.print(j+" * "+i+" = "+j*i+"   ");
				if(i*j < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=9;i++) {
			for(int j=2; j<=9;j++) {
				// System.out.println("\t"); -> tap키 누른 효과
				System.out.print(j+" * "+i+" = "+j*i+"\t");
				
			}
			System.out.println();
		}
	}
}
