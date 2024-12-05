package com.dec.day07.array;

public class Exam_DimArray {
	public static void main(String[] args) {
		// 2차원 배열
		// 배열에 각 행배열의 주소값을 저장
		
		int num = 0;
		int nums[] = new int[10];
		int [][] dimNums = new int[5][5];
		System.out.println("행의 길이 : "+dimNums.length);
		System.out.println("열의 길이 : "+dimNums[0].length); // 정방형 -> 모든 행의 열길이가 같음
		
		// 1  2  3  4  5
		// 6  7  8  9  10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		int count = 0;
		for(int i=0; i<dimNums.length;i++) { // 행 반복
			for(int j=0; j<dimNums[i].length;j++) { // 열 반복
				dimNums[i][j] = count+1;
				count++;
				// %2d -> 2번째 자리 까지 출력해 한자리 숫자가 뒤로 붙을 수 있도록함
				System.out.printf("%2d\t",dimNums[i][j]); 
//				if(count <10) {
//					System.out.print(dimNums[i][j]+"  ");	
//				}else {
//					System.out.print(dimNums[i][j]+" ");
//				}
			}
			System.out.println();
		}
				
		
	}
}
