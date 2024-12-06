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
				System.out.print("["); // '[' 출력
				for(int i=0; i<inputArray.length;i++) { // 입력된 배열 출력
					if(i == inputArray.length-1) {
						System.out.print(inputArray[i]+"]");
					}else {
						System.out.print(inputArray[i]+", ");
					}
				}
				answer = false; // 반복문으로 가지 않음
				break;
			default : 
				System.out.println("잘못된 문자입니다.");
				answer = false;
		}
		
		String[] temp = inputArray; // temp 배열변수가 처음 입력된 배열을 가리키게 함
		
		while(answer) { // answer가 참일 때 무한 반복
			
			
			System.out.print("더 입력하고 싶은 개수 : "); // 몇 개를 더 입력받을 지 입력받음
			input = sc.nextInt();
			
			String addArray[] = new String[input]; // 입력받은 크기의 배열 생성
			
			for(int i=0; i<addArray.length; i++) { // 문자열 입력받아서 배열에 저장
				System.out.print((count+i+1)+"번째 문자열 : ");
				addArray[i] = sc.next();
			}
			
			count += input; // 입력을 더 받은만큼 count값을 늘려서 전체 몇개를 입력받았는지 저장함
			
			String tempInWhile[] = new String[count]; // 입력받은 모든 문자열을 저장할 수 있는 배열 생성
			
			for(int i=0; i<temp.length;i++) { // 반복 전까지 입력받은 문자열들을 tempInWhile에 저장
				tempInWhile[i] = temp[i];
			}
			for(int i=0;i<addArray.length;i++) { // 이번 반복에 입력받은 문자열들을 뒤에 저장
				tempInWhile[i+temp.length] = addArray[i];
			}
			
			System.out.println("더 값을 입력하시겠습니까? : "); // 더 입력 받을 건지 사용자가 선택
			ch = sc.next().charAt(0);
			
			temp = tempInWhile; // 지금까지 모든 문자열을 저장한 배열을 temp가 가리키게 함
			
			switch(ch) {
				case 'y', 'Y' : 
					answer = true; // 다시반복
					break;
				case 'n', 'N' : // 배열 출력 후 종료
					System.out.print("[");
					for(int i=0; i<tempInWhile.length; i++) {
						if(i == tempInWhile.length-1) {
							System.out.print(tempInWhile[i]+"]");
						}else {
							System.out.print(tempInWhile[i]+", ");
						}
					}
					answer = false;
					break;
				default : 
					System.out.println("잘못된 문자입니다.");
					answer = false;
			}
			
		}
		

		
		
		
	}
}
