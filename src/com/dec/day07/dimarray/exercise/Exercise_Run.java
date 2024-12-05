package com.dec.day07.dimarray.exercise;

import java.util.Scanner;

// 실행용 클래스
public class Exercise_Run {
	public static void main(String[] args) {
		
		Exercise_DimArray exercise = new Exercise_DimArray();
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.print("실행할 클래스 입력 : ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : 
				exercise.practice1();
				break;
			case 2 : 
				exercise.practice2();
				break;
			case 3 : 
				exercise.practice3();
				break;
			case 4 : 
				exercise.practice4();
				break;
			default : 
				System.out.println("잘못된 번호를 입력하셨습니다.");
				return;
			}			
		}
	}
}
