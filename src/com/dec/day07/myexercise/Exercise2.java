package com.dec.day07.myexercise;

import java.util.Random;

public class Exercise2 {
	/*
	 * 로또 자동 생성 프로그램
	 * 6개 (1 ~ 45)
	 * 중복 X, 오름차순 정렬
	 */
	public static void main(String [] args) {
		
		int [] lottos = new int[6]; // 크기가 6인 배열 생성
		
		Random rand = new Random(); // Random 클래스 사용하기 위해 클래스 객체 생성
		
		for(int i=0; i< lottos.length;i++) {
			// 1 ~ 45 사이의 숫자
			lottos[i] = rand.nextInt(45)+1; // 랜덤값 생성하여 배열에 저장
			
			// 마치 삽입정렬처럼 그전에 있는 인덱스들과 비교함
			for(int j=i;j>0 ;j--) { // 선택한 인덱스(i) 전부터 비교해 같으면 다시 반복
				if(lottos[j-1] == lottos[i]) {
					i--; // 다시 반복하기 위해 i값을 하나 줄임
					break; // 반복문을 빠져 나옴 -> continue는 j의 for문 안에서 동작해서 의미가 없음
				}
			}
			
		}
		
		// 선택, 삽입, 버블, 퀵, 머지, ...
		// 선택 정렬
		for(int i = 0; i<lottos.length-1; i++) {
			for(int j=i; j<lottos.length; j++) {
				if(lottos[i] > lottos[j]) {
					int temp = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp;
				}
			}
		}
		
		// 버블 정렬
		for(int j=0;  j < lottos.length-1; j++)
		for(int i = 0; i < lottos.length-1-j; i++) {
			if(lottos[i] > lottos[i+1]) {
				int temp2 = lottos[i];
				lottos[i] = lottos[i+1];
				lottos[i+1] = temp2;
			}
		}
		
		for(int num : lottos)
			System.out.print(num+" ");
	}
	
}
