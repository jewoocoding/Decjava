package com.dec.day01.printbasic;

public class Exam_PrintSample {
	
	public static void main(String[] args) {
//		줄바꿈을 하지 않음
		System.out.print("지금까지와는 다른 출력 명령어");
		System.out.println(); // 줄바꿈을 해줌(ln)
		System.out.println("Hello Java");
		System.out.println("지금까지 출력할 때 쓰던 명령어");
		
		// printf 출력 명령어
		// 형식문자
		// 정수 - %d
		// 실수 - %f
		// 문자열 - %s
		// 불린형 - %b
		// printf 출력 명령어
		// 개행 : \n
		System.out.printf("정수의 값: %d\n", 1234);
		// 기본적으로 6번째 자리까지 출력
		// %.2f -> 2번째 자리까지 출력
		System.out.printf("실수의 값 : %.2f\n", 5.2123123);
		System.out.printf("실수의 값 : %f", 5.2123123);
	}

}
