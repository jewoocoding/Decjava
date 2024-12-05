package com.dec.day02.controll.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	/*
	 * 문제2
	 * 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
	 * 주문하시겠어요? 가격을 알려드립니다.
	 * (에스프레소, 카푸치노, 카페라떼, 아메리카노)
	 * 메뉴를 입력해주세요 : 에스프레소
	 * 2500원입니다.
	 * 메뉴를 입력해주세요 : 자바칩프라프치노
	 * 없는 메뉴입니다.
	 */
	// 메모리구조 : Stack / Heap / Static
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		// order는 Stack에 저장됨
		// 문자열을 초기화하면
		// 문자열은 상수풀에 저장되고 order는 저장된 주소값을 가리킨다.
		// Stack에 저장된 order와 상수풀에 저장된 입력된 값은 같은 주소를 가리킨다.
		// but 콘솔창에서 입력받으면 Heap에 저장되기 때문에 주소값이 다르다.
		String order = sc.next();
		
		// 문자열비교 -> identifier.equals(); -> 문자열 내용을 비교함
		// ==은 객체가 저장된 주소값을 비교하는 것
		if(order.equals("에스프레소")) {
			System.out.println("3000원입니다.");
		}else if(order.equals("카푸치노")){
			System.out.println("4500원입니다.");
		}else if(order.equals("카페라떼")){
			System.out.println("3500원입니다.");
		}else if(order.equals("아메리카노")){
			System.out.println("2000원입니다.");
		}else {
			System.out.println("없는 메뉴입니다.");
		}
		
		// 상수풀에 "hello"가 저장됨 -> msg1과 msg2는 같은 주소값을 가리킴
		String msg1 = "hello";
		String msg2 = "hello";
		// msg3의 "hello"는 Heap에 저장되어 msg1, msg2와 다른 주소값을 가리킨다.
		String msg3 = new String("hello");
		if(msg1 == msg2) {
			System.out.println("같다.");
		}
	}

}
