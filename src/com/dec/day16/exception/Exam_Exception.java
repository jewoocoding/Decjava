package com.dec.day16.exception;

import com.dec.day16.exception.exercise.ZeroNotDivideException;

public class Exam_Exception {
	/*
	 * 1. 예외처리란 무엇인가?
	 * - 프로그램이 비정상실행 되는 것을 막기위해 코드안에서 처리하는 것
	 * 2. 예외의 종류는 무엇이 있는가?
	 * - Checked Exception과 Unchecked Exception이 있다
	 * 3. Checked/Unchecked Exception의 차이는 무엇인가?
	 * - Checked Exception은 반드시 예외를 처리해줘야 하는 예외 상황이며 IOException이 슈퍼클래스이다.
	 * - Unchecked Exception은 예외처리를 강제하지 않는 예외 상황이며 RunTimeException이 슈퍼클래스이다.
	 * 4. 예외의 최고 조상 클래스는 무엇인가?
	 * - Exception : 서브클래스로 IOExceptin, RunTimeException을 둠.
	 * 5. 예외처리 방법
	 * - try ~ catch문 사용하여 발생한 곳에서 직접 처리
	 * - throws를 사용하여 예외 회피
	 */
	public static void main(String[] args) {
		// 여기서도 예외처리 가능
		try {
			
			int result = divNum(10, 0);
//		} catch (ArithmeticException e) {
		} catch (ZeroNotDivideException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	// Unchecked Exception이라서 throws ArithmeticException이 생략돼도 자동으로 실행됨
	// -> throws를 통해 당장 처리하지 않고 호출되는 곳에서 처리하도록 함
//	public static int divNum(int data1, int data2) throws ArithmeticException {
	public static int divNum(int data1, int data2) throws ZeroNotDivideException {
		/*
		 * 나누기를 할 때에는 0으로 나눌 때의 경우를 대비해야함.
		 * 자바에서는 try ~ catch 예외처리임. 아래의 try ~ catch문 참고
		 * 그런데 0으로 나눌 때의 경우를 대비하는 것을 회피할 수 있는 방법이 있음.
		 * 밑에 코드 처럼 try ~ catch로 감싸지 않고 throws로 발생할 수 있는 예외를 회피함.
		 * -> 그래서 try ~ catch를 안 써도 됨.
		 * throws를 통해 예외 회피를 하면
		 * 예외가 발생할 수 있는 메소드를 호출하는 메소드가 try ~ catch(예외 처리)를 해줘야 함.
		 */
		
		if(data2 == 0) {
			throw new ZeroNotDivideException("ZeroNotDivide");
		}
		
		// 여기서 예외 발생 가능
		int result = data1 / data2;
//		try {
//			result = data1 / data2;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		return result;
	}
}
