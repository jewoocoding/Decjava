package com.dec.day2x.enumex;

public class Exam_ColorEnum {
	// enum을 사용하면 새로운 타입지정 가능
	public enum Color {
		RED, GREEN, BLUE
	}
	
	public static void main(String[] args) {
		Color myColor = Color.RED;
		// myColor = Color.YELLOW; -> 예외처리가 필요없음
		// -> 타입의 안정성 보장
		// String color = "YELLOW";
		printColor(myColor);
	}
	
	static void printColor(Color color) {
		switch(color) {
		case RED:
			System.out.println("빨강");
			break;
		case GREEN:
			System.out.println("초록");
			break;
		case BLUE:
			System.out.println("파랑");
			break;
		}
	}
}
