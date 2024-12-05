package com.dec.day03.controll.loop;

public class Exam_While {
	public static void main(String[] args) {
		/*
		 * 제어문 - 반복문
		 * 2. while
		 * 문법
		 * 초기식;
		 * while(조건식) { 실행문장;증감식; }
		 * 
		 * for(초기식;조건식;증감식) { 실행문장; }
		 */
		// for문으로 1부터 10까지 출력해보세요
		for(int i =0;i<10;i++)
			System.out.println(i+1);
		
		// while문 사용
		int i = 0; // 초기식
		while(i<10) { // 조건식
			System.out.println(i+1); // 실행문장
			i++; //증감식
		}
	}
}
