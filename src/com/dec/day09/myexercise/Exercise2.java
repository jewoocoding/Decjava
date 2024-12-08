package com.dec.day09.myexercise;

import java.util.Scanner;

public class Exercise2 {
	/*
	 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 
	 * 소수의 개수를 출력하세요. 
	 * 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

		ex.
		숫자 : 11
		2 3 5 7 11
		2부터 11까지 소수의 개수는 5개입니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : "); // 숫자 입력 받기
		int input = sc.nextInt();
		int count = 0; // 소수의 개수 세는 변수
		
		if(input <2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 2; i <= input; i++) { // 입력받은 수까지의 숫자들을 소수인지 판별
				int countInFor = 0; // 나누어 떨어지는 수가 몇개인지 세는 변수
				for(int j =1;j<i;j++ ) { // 숫자가 소수인지 판별
					if(i%j == 0) { // 확인할 숫자 i의 나누어 떨어지는 수가 몇개인지 판별
						countInFor++;
					}
				}
				
				if(countInFor == 1 ) { // i가 소수라면 출력후 개수셈 
					System.out.print(i+" ");
					count++;
				}
			}
			System.out.println();
			System.out.println("2부터 "+input+"까지의 소수의 개수는 "+count+"개입니다.");
		}
		
		
	}

}
