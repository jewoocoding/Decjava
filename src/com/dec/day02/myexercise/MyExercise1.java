package com.dec.day02.myexercise;

import java.util.Scanner;

public class MyExercise1 {
	public static void main(String[] args) {
		/*
		 * ======= 메뉴 ========
		 * 1. 성적입력
		 * 2. 성적확인
		 * 3. 종료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int input, koreanScore, mathScore, englishScore, sum;
		double average;
		input = 0;
		koreanScore = 0;
		mathScore = 0;
		englishScore = 0;
		
		while(true) {
						
			System.out.println("===== 메인 메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			input = sc.nextInt();
			System.out.println();
			
			switch(input) {
				case 1 : {
					System.out.println("===== 성적입력 =====");
					System.out.print("국어 : ");
					koreanScore = sc.nextInt();
					System.out.print("수학 : ");
					mathScore = sc.nextInt();
					System.out.print("영어 : ");
					englishScore = sc.nextInt();
					System.out.println();
					boolean score = (koreanScore >= 0) && (koreanScore < 100) && 
									(koreanScore >= 0) && (koreanScore < 100) &&
									(koreanScore >= 0) && (koreanScore < 100);
					
					if(!score) {
						System.out.println("다시 입력해주세요!");
						break;
					}
					
					break;
				}
				case 2 : {
					
					sum = koreanScore + mathScore + englishScore;
					average = sum / 3;
					System.out.println("===== 성적출력 =====");
					System.out.println("국어 : "+koreanScore); 
					System.out.println("수학 : "+mathScore); 
					System.out.println("영어 : "+englishScore);
					System.out.println("총점 : "+sum);
					System.out.println("평균 : "+average);					
					System.out.println();
					break;
				}
				case 3 : {
					break;
				}
			}
			if(input == 3) {
				break;
			}
		}
		
	}

}
