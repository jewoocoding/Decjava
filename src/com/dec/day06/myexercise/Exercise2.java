package com.dec.day06.myexercise;

public class Exercise2 {
	public static void main(String[] args) {
		// 10개의 랜덤값을 생성한 뒤 최대값 최소값 출력
		int[] arrs = new int[10]; // 10크기의 배열 생성
		
		int num = 0; // 난수를 저장할 변수 선언

		for(int i=0;i<arrs.length;i++) {
			num = (int)(Math.random()*10 +1); // 랜덤값을 배열에 저장
			arrs[i] = num;
		}
		
		int max = arrs[0], min = arrs[0]; // 최대, 최소값 초기화
		
		for(int i=0;i<arrs.length;i++) { // 배열 한번 훑기
			
			if(max < arrs[i]) { // max값보다 큰값이 있으면 max에 그 값을 넣음
				max = arrs[i];
			}
			if(min > arrs[i]) { // min값보다 작은값이 있으면 min에 그 값을 넣음
				min = arrs[i];
			}
		}
		
		for(int nums : arrs)
			System.out.print(nums+" ");
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
}
