package com.dec.day13.myexercise;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실행할 문제 : ");
		int input = sc.nextInt();
		switch(input) {
			case 1 :
				ArrCount.practice1();
				break;
			case 2 :
				ArrCount.practice2();
				break;
			case 3 :
				ArrCount.practice3();
				break;
			case 4 :
				ArrCount.practice4();
				break;
			case 5 :
				ArrCount.practice5();
				break;
			case 6 :
				ArrCount.practice6();
				break;
			case 7 :
				ArrCount.practice7();
				break;
		}
	}
}
class ArrCount {
	static void practice1() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			for(int j=arrs[i].length-1;j>=0;j--) { // 열을 거꾸로 하여 인덱스에 값 저장
				arrs[i][j] = count;
				count++;
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}
	}
	static void practice2() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			for(int j=0;j<arrs.length;j++) {
				arrs[j][i] = count; // 열을 기준으로 count값 입력
				count++;
			}
		}
				
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice3() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			for(int j=arrs.length-1;j>=0;j--) {
				arrs[j][i] = count; // 열을 기준으로 count값 거꾸로 입력
				count++;
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice4() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			for(int j=0;j<arrs.length;j++) {
				arrs[i][j] = count; 
				count++;
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice5() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			switch(i%2) {
				case 0 : // 짝수 행
					for(int j=arrs.length-1;j>=0;j--) {
						arrs[i][j] = count; 
						count++;
					}
					break;
				default : // 홀수 행
					for(int j=0;j<arrs.length;j++) {
						arrs[i][j] = count; 
						count++;
					}
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice6() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			switch(i%2) {
			case 1 : // 홀수 열
				for(int j=arrs.length-1;j>=0;j--) {
					arrs[j][i] = count; 
					count++;
				}
				break;
			default : // 짝수 열
				for(int j=0;j<arrs.length;j++) {
					arrs[j][i] = count; 
					count++;
				}
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice7() {
		// 배열 생성
		int [][] arrs = new int[5][5];
		int count = 1; // 인덱스에 들어갈 숫자
		// 입력
		for(int i=0;i<arrs.length;i++) {
			switch(i%2) {
			case 0 : // 짝수 열
				for(int j=arrs.length-1;j>=0;j--) {
					arrs[j][i] = count; 
					count++;
				}
				break;
			default : // 홀수 열
				for(int j=0;j<arrs.length;j++) {
					arrs[j][i] = count; 
					count++;
				}
			}
		}
		
		// 출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+"\t");
			}
			System.out.println();
		}	
	}
	static void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
		int row = sc.nextInt();
		System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
		int column = sc.nextInt();
		
		int [][] arrs = new int[row][column];
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0;j<arrs[i].length;j++) {
				//char ch = (char)(int)()
			}
		}
	}
}

