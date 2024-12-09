package com.dec.day09.myexercise.academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
	public void plus() {
		int [] num = new int [2];
		for(int i=0; i<num.length; i++) {
			num[i] = inputNumber(i);
		}
		System.out.println("두 수의 합은 : "+(num[0]+num[1]));
	}
	
	public int inputNumber(int i) {
		Scanner sc = new Scanner(System.in);
		int inputNum;
		while(true) {
			try {
				System.out.print((i+1)+"번째 정수 입력 : ");
				inputNum = sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력");
				sc.next(); // 입력받은 문자열을 삭제하기 위한 코드
			}
		}
		return inputNum;
	}
	public static void main(String[] args) {
		Exercise1 ex = new Exercise1();
		ex.plus();
		
	}
	
}


