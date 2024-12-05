package com.dec.day05.array.practice;

import java.util.Scanner;

import com.dec.day05.array.exercise.Exercise_Array1;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Practice_Array prac1 = new Practice_Array();
		while(true) {
			System.out.print("실행할 연습문제 번호 입력(13 : 프로그램 종료) : ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 : 
				prac1.practice1(); 
				break;
			case 2 : 
				prac1.practice2(); 
				break;
			case 3 : 
				prac1.practice3(); 
				break;
			case 4 : 
				prac1.practice4(); 
				break;
			case 5 : 
				prac1.practice5(); 
				break;
			case 6 : 
				prac1.practice6(); 
				break;
			case 7 : 
				prac1.practice7(); 
				break;
			case 8 : 
				prac1.practice8(); 
				break;
			case 9 : 
				prac1.practice9(); 
				break;
			case 10 : 
				prac1.practice10(); 
				break;
			case 11 : 
				prac1.practice11(); 
				break;
			case 12 : 
				prac1.practice12(); 
				break;
			case 13 : 
				return;
			default : 
				System.out.println("없는 번호 입니다.");	
			}
		}

	}
}
