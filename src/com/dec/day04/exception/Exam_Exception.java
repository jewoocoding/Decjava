package com.dec.day04.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[] args) {
		/*
		 * 컴파일 오류 -> 빨간줄(오타) 
		 * 예외(Exception) : 실행 중 발생한 오류
		 */
		Scanner sc = new Scanner(System.in);
		
		// 예외가 발생할 수 있기 때문에 예외처리를 강제함.
		// -> Checked Exception
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 예외가 발생할 수 있으나 예외처리는 강제하지 않음.
		// -> UnChecked Exception
		try {
			int num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요~");
		}
		
		// default 값
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
