package com.dec.day03.myexercise;

public class Exercise3 {
	public static void main(String[] args) {
//		구구단을 출력하되(\t)
//		2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단 ...
//		// 2 * 1 = 2	3 * 1 = 3	        4 * 1 = 4
//		// 2 * 2 = 2	3 * 2 = 6	        4 * 2 = 8
//		// ...
//		// 2 * 9 = 18	3 * 9 = 27	4 * 9 = 36

		for(int j=1; j<=9; j++) {
				
			for(int k= 2; k<=9; k++) {
					
				System.out.print(k + " * "+j +" = "+k*j+"     ");
				if(k*j < 10) {
					System.out.print(" ");
				}
			}
				
			System.out.println();
		}
	}
}
