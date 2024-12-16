package com.dec.day12.wrapperpkg;

public class Exam_Wrapper {
	public static void main(String[] args) {
		
		// 기본형
		int num = 10;
		num = 1118;
		
		// 참조형
		Integer su = null;
		
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// su = new Integer(10); 
		su = Integer.valueOf(323); // 원칙 Integer <= Integer
		
		// 레퍼런스 변수이기 때문에 null체크가 가능함
		if(su != null) {
			su = 1225; // 오토-박싱(auto-boxing)
		}
		num = su.intValue(); // 원칙 int <= Integer
		num = su; // 오토-언박싱(auto-unboxing)
		
		Double du = Double.valueOf(11.23);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		
		// Wrapper 클래스를 쓰는 이유
		// 1. Null체크가 가능해짐, int -> 0, double -> 0.0, String -> null => 모두 다 널로 체크 가능
		// 2. 형변환 가능, String -> int, String -> boolean
		String openDate = "20241212";
		System.out.println(openDate+1); // String으로 동작
		int openDateNum = Integer.parseInt(openDate); // String 타입을 인티저로 변환
		System.out.println(openDateNum+1);
		
		System.out.println(Character.toLowerCase('A')); // 들어온 문자를 모두 소문자로 변환
		System.out.println(Character.toUpperCase('b')); // 들어온 문자를 모두 소문자로 변환
		char c1 = '5', c2 = 'F';
		if(Character.isDigit(c1)) { // 문자가 숫자인지 판별
			System.out.println("숫자입니다.");
		}
		if(Character.isAlphabetic(c2)) { // 문자가 알파벳인지 판별
			System.out.println("영문자입니다.");
		}
		
		// =============== 문자열로 바꾸기 ===================
		/*
		 * 1. String.valueOf(1);
		 * 2. +"" 붙이기
		 * 2. .toString()
		 */
		
		System.out.println(1); // integer 타입
		System.out.println(String.valueOf(1) instanceof String); // String 클래스 메소드 사용
		System.out.println(1+"" instanceof String); // +""를 붙여 문자열로 변환
		System.out.println(Integer.valueOf(1).toString() instanceof String); 
		// Integer클래스의 toString() 메소드 사용 
		
	}
}
