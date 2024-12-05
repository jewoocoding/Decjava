package com.dec.day04.myexercise;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		if(people > candy) {
			System.out.println("사탕이 부족합니다.");
		}else {
			System.out.println("1인당 사탕 개수 : "+candy/people);
			System.out.println("남는 사탕 개수 : "+candy%people);			
		}
		

	}

}
