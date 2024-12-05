package com.dec.day06.myexercise;

public class Exercise1 {
	public static void main(String[] args) {
		System.out.println("로또 번호 출력");
		int[] lotto = new int[6]; // 크기가 6인 배열 생성
		
		int num = 0;
		int count = 0;
		

		while(true) { // 난수 생성
			num = (int)(Math.random()*45+1); // 1 ~ 45 사이의 난수 생성
			if(count < 6) {
				lotto[count] = num; // 난수 배열에 투입
				count++; // 몇 번 생성했는지 확인
			}
			
			for(int i = 0; i < count-1;i++) { // 내가 넣은 값들 과 모두 비교
				if(num == lotto[i]){ // 생성한 난수가 배열에 있으면 다시 반복
					count--; // 같은 값이 나왔을 시, 다시 반복하게 함
					System.out.println(count); // 몇번째 반복에서 같은 값이 나왔는지 출력
					break;
				}
			}
			
			if(count == 6) { // 6번 생성했다면 빠져 나옴
				break;
			}
		}
		
		// 선택 정렬
		for(int i=0; i<lotto.length;i++) { // 0인덱스 부터 선택해 정렬
			
			for(int j=i; j<lotto.length; j++) { // 정렬된값 이후부터 비교해 정렬
				
				if(lotto[i]>lotto[j]) { // 정렬할 인덱스보다 작으면 그 값을 정렬할 인덱스에 넣음
					// 교환 코드
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
				
			}
		}
		
		for(int value : lotto) // 배열 출력
			System.out.print(value+" ");
	}

}
