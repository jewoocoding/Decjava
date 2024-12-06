package com.dec.day08.myexercise;

import java.util.Scanner;

public class Exercise1 {
	/*
	 * 고객 요구사항
		1. 가위 바위 보 중 하나의 문자열을 입력 받고, 
		난수를 발생시켜 랜덤하게 가위 바위 보 문자열을 생성한다.
		2. 랜덤한 가위 바위 보 문자열과 입력한 문자열이 같으면 
		아래 실행 결과처럼 비겼다고 출력하고 가위 바위 보 게임을 반복한다.
		3.   입력한 가위 바위 보 문자열이 랜덤한 가위 바위 보 문자열과 
		비교하여 가위 바위 보 게임의 룰 대로 이긴 경우 이겼다고 출력, 진 경우 졌다고 출력 후 종료
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		
		while(true) { // 반복
			
			System.out.print("가위 바위 보 중 한개를 입력하세요 : "); // 가위,바위,보 입력받음
			String input = sc.next();
			
			System.out.println("당신은 "+input+"을 냈습니다.");
			
			
			int com = (int)(Math.random()*3+1); // 1~3사이의 난수 발생시킴
			String comChoice = ""; // 컴퓨터가 무엇을 낼지 저장할 변수
			
			switch(com) {
				case 1 : // 난수가 1이면 가위
					comChoice = "가위";
					break;
				case 2 : // 난수가 2면 바위
					comChoice = "바위";
					break;
				default : // 난수가 3이면 보
					comChoice = "보";
			}
			
			System.out.println("컴퓨터는 "+comChoice+"를 냈습니다.");
			
			if(input.equals(comChoice)) { // 값이 같을 때 
				System.out.println("비겼습니다. 다시 시작합니다.");
			}else { // 값이 다를 때
				switch(input) { 
					case "가위" : // 사용자가 가위를 냈을 때
						switch(comChoice) { // 컴퓨터와 비교
							case "바위" :
								System.out.println("당신이 졌습니다!");
								break;
							case "보" :
								System.out.println("당신이 이겼습니다!");
								break;
							default : 
						}
						break;
					case "바위" : // 사용자가 바위를 냈을 때
						switch(comChoice) { // 컴퓨터와 비교
						case "보" :
							System.out.println("당신이 졌습니다!");
							break;
						case "가위" :
							System.out.println("당신이 이겼습니다!");
							break;
						default : 
					}
						break;
					case "보" : // 사용자가 보를 냈을 때
						switch(comChoice) { // 컴퓨터와 비교
						case "가위" :
							System.out.println("당신이 졌습니다!");
							break;
						case "바위" :
							System.out.println("당신이 이겼습니다!");
							break;
						default : 
					}
						break;
					default :
				}
				return;
			}
			
		}
	}
}
