package com.dec.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 O, X
	 * 매개변수 O, X
	 * 
	 * 리턴형 X, 매개변수 X
	 * 리턴형 O, 매개변수 X
	 * 리턴형 X, 매개변수 O
	 * 리턴형 O, 매개변수 O
	 */
	
	public void Exam1() {
		System.out.println("1. 리턴형도 없고 매개변수도 없는 메소드입니다.");
	}
	
	public int Exam2() {
		System.out.println("2. 리턴형이 int이고 매개변수는 없는 메소드입니다.");
		int output = 1;
		System.out.println("리턴값 : "+output);
		return output; // 1을 리턴
	}
	
	public void Exam3(int ...num) {
		System.out.println("3. 리턴형이 없고 매개변수를 가변인자 int로 받는 메소드입니다.");
		for(int n : num) // 입력받은 값들을 출력
			System.out.print(n+" ");
		System.out.println();
	}
	
	public int Exam4(int num1, int num2) {
		System.out.println("4. 리턴형이 int이고 매개변수로 int자료형 변수 2개를 입력받아 더한값을 리턴해주는 메소드입니다.");
		int add = num1 + num2; // 입력받은 2개의 정수를 더함
		System.out.println("리턴값 : "+ add); 
		return add; // 더한 값을 반환
	}
	
	public int sum(int ...numbers) { // 가변인자 사용 메소드
		int sum =0;
		for(int num: numbers) { // 입력받은 값들을 모두 더함
			sum += num;
		}
		return sum; // 더한 값들을 리턴
	}

}
