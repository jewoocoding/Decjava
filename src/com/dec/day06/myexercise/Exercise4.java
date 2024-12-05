package com.dec.day06.myexercise;

import java.util.Scanner;

public class Exercise4 {
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
		Scanner sc = new Scanner(System.in);
		
		
		int count = 0; // 총 몇개의 문자열을 입력받았는지 저장
		int lastIndex = 0;
		
		boolean answer = true;
		String[] output;
		System.out.print("배열의 크기를 입력하세요 : ");
		int leng = sc.nextInt();
		
		String[] input = new String[leng]; // 입력 받을 문자열 생성
		String[] temps = new String[leng+count]; // 반복될 때 저장할 배열 생성
		
		for(int i = 0; i < leng;i++) { // 배열에 입력받은 문자열 저장
			System.out.print((count+i+1)+"번째 문자열 : ");
			input[i] = sc.next();
		}
		
		// 얕은 복사를 활용해서 저장 
		
		do {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			switch(ch) {
				case 'y','Y' :
					// 원본에서 깊은 복사 코드
					// 새로운 배열이 만들어졌지만 다시 do~while이 되면서
					// 사라지지 않을까?
					// 새로운 배열 살릴 수 있는 방법? 얕은복사
					answer = true;
				break;
				case 'n','N' :
					answer = false;
				break;
				default : 
					System.out.println("잘못된 대답입니다.");
			}
			
			count += leng; // 입력받은 문자열 개수만큼 더함
			output = new String[count]; // 출력될 배열 생성
			
			for(int i=0;i<leng;i++) {
				output[i+lastIndex] = input[i];
			}
			
			
				
		}while(answer);
		
		
	}
}
