package com.dec.day2x.enumex;

public class Exam_Enum3 {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		
		// 열거형 상수의 이름과 한글 이름 출력
		System.out.println(spring);
		System.out.println(spring.getSeason());
		System.out.println();
		// 모든 열거형 상수의 이름과 한글이름 출력
		for(Season season : Season.values()) {
			System.out.println("현재 계정 : "+season + ", 한글 이름 : "+season.getSeason());
		}
		
		// Season summer = new Season("여름"); -> 이거 아님
		// -> 생성자는 enum값과 스트링을 연결해주는 역할인듯
	}
}
