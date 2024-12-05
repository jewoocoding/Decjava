package com.dec.day07.myexercise;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고 
		 * 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요. 
		 * 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 
		 * 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요. 
		 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
			ex.
			배열의 크기를 입력하세요 : 3
			1번째 문자열 : 자바의 정석
			2번째 문자열 : 알고리즘
			3번째 문자열 : C프로그래밍
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 2
			4번째 문자열 : 인간관계
			5번째 문자열 : 자기계발
			더 값을 입력하시겠습니까?(Y/N) : y
			더 입력하고 싶은 개수 : 1
			6번째 문자열 : 영단어600
			더 값을 입력하시겠습니까?(Y/N) : n
			[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
		 */
		
		// 얕은 복사 활용해서 해보기
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 문자열 몇개 입력했는지 저장하는 변수
		boolean answer = true; // 더 반복할 지 정하는 변수
		
		System.out.print("배열의 크기를 입력하세요 : "); // 첫번째 배열 크기 입력
		int input = sc.nextInt();
		
		String [] inputArray = new String[input]; // 첫번째 배열 생성
		
		for(int i=0; i< input; i++) {
			System.out.print((i+1 + count)+"번째 문자열 : "); // 첫번째 배열의 내용 입력
			inputArray[i] = sc.next();
		}
		
		count += input; // 문자열을 몇 개 입력 했는지 저장
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : "); // 더 입력할 지 물어봄
		char ch = sc.next().charAt(0);
		
		switch(ch) {
			case 'y', 'Y' : 
				answer = true; // 무한 반복문으로
				break;
			case 'n', 'N' :
				System.out.print("[");
				for(int i=0; i<inputArray.length;i++) {
					if(i == inputArray.length-1) {
						System.out.print(inputArray[i]);
					}else {
						System.out.println(inputArray[i]+", ");
					}
				}
				answer = false; // 바로 입력한 것만 출력
				break;
			default : 
				System.out.println("잘못된 문자입니다.");
				answer = false;
		}
		
		String[] outputArray = new String[input]; //
		
		for(int i=0; i< input;i++) {
			outputArray[i]=inputArray[i];
		}
		
		
		String[] temp = outputArray;
		
		while(answer) {
			
			
			System.out.print("더 입력하고 싶은 개수 : ");
			input = sc.nextInt();
			
			String addArray[] = new String[input];
			
			for(int i=0; i<addArray.length; i++) {
				System.out.println((count+i+1)+"번째 문자열 : ");
				addArray[i] = sc.next();
			}
			
			count += input;
			
			String tempInWhile[] = new String[count];
			
			for(int i=0; i<temp.length;i++) {
				tempInWhile[i] = temp[i];
			}
			for(int i=0;i<addArray.length;i++) {
				tempInWhile[i+temp.length] = addArray[i];
			}
			
			System.out.println("더 값을 입력하시겠습니까? : ");
			ch = sc.next().charAt(0);
			
			switch(ch) {
				case 'y', 'Y' : 
					temp = tempInWhile;
					answer = true;
					break;
				case 'n', 'N' :
					String [] outputArrayInWhile = tempInWhile;
					answer = false;
					break;
				default : 
					System.out.println("잘못된 문자입니다.");
					answer = false;
			}
			
		}
		
		for(String s : outputArray )
			System.out.print(s+" ");
		
		
		
		
	}
}
