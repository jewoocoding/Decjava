package com.dec.day05.array;

public class Exam_HallowCopy {
	public static void main(String[] args) {
//		int [] arrs = new int[6];
//		arrs[0] = 24;
//		arrs[1] = 11;
//		arrs[2] = 18;
//		arrs[3] = 25;
//		arrs[4] = 5;
//		arrs[5] = 2;
		int [] dates = {24, 11, 18, 25, 5, 2};
		int [] copied = dates;
		copied[0] = 25; // 원본도 같이 바뀜
		dates[3] = 26; // 복사본도 같이 바뀜
		
		for(int i=0; i< copied.length; i++) {
			System.out.print(copied[i]+ " ");
		}
		System.out.println();
		for(int i=0; i< copied.length; i++) {
			System.out.print(dates[i]+ " ");
		}	
		System.out.println();
		System.out.println(dates.hashCode()); // hashCode : 고유의 값
		System.out.println(copied.hashCode()); // 얕은 복사로 hashCode가 같게 나옴
	}
}
