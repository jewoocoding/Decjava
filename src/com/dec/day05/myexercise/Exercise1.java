package com.dec.day05.myexercise;

import java.util.Scanner;

public class Exercise1 {
	/*
	 * 모텔 관리 프로그램
	 * 모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 1
		몇번방에 입실하시겠습니까?
		3
		3번방에 입실하셨습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 1
		몇번방에 입실하시겠습니까?
		1
		1번방에 입실하셨습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 3
		1번방에는 현재 손님이 있습니다
		2번방이 현재 비어있습니다
		3번방에는 현재 손님이 있습니다
		4번방이 현재 비어있습니다
		5번방이 현재 비어있습니다
		6번방이 현재 비어있습니다
		7번방이 현재 비어있습니다
		8번방이 현재 비어있습니다
		9번방이 현재 비어있습니다
		10번방이 현재 비어있습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 2
		몇번방에서 퇴실하시겠습니까? 1
		1번방에서 퇴실하셨습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 2
		몇번방에서 퇴실하시겠습니까? 1
		1번방은 현재 빈 방입니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 3
		1번방이 현재 비어있습니다
		2번방이 현재 비어있습니다
		3번방에는 현재 손님이 있습니다
		4번방이 현재 비어있습니다
		5번방이 현재 비어있습니다
		6번방이 현재 비어있습니다
		7번방이 현재 비어있습니다
		8번방이 현재 비어있습니다
		9번방이 현재 비어있습니다
		10번방이 현재 비어있습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 5
		잘못 선택 하셨습니다
		모텔 관리 프로그램 v1.0
		1.입실     2.퇴실     3.방보기      4.종료
		선택 > 4
		프로그램을 종료합니다
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int motel[] = new int[10];
		finish:
		while(true) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.println("1.입실   2.퇴실   3.방보기   4.종료");
			System.out.print("선택 > ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					System.out.println("몇번방에 입실하시겠습니까?");
					choice = sc.nextInt();
					motel[choice-1] = 1;
					System.out.println(choice+"번방에 입실하셨습니다");
					break;
				case 2 : 
					System.out.println("몇번방에서 퇴실하시겠습니까?");
					choice = sc.nextInt();
					if( motel[choice-1] == 0) {
						System.out.println(choice+"번방은 현재 빈방입니다.");
					}else {
						System.out.println(choice+"번방에서 퇴실하셨습니다");
						motel[choice-1] = 0;
					}
					break;
				case 3 : 
					for(int i =0; i<motel.length;i++) {
						if(motel[i]==0) {
							System.out.println((i+1)+"번방이 현재 비어있습니다");
						}else {
							System.out.println((i+1)+"번방에는 현재 손님이 있습니다");
						}
					}
					break;
				case 4 : 
					System.out.println("프로그램을 종료합니다");
					break finish;
				default :
					System.out.println("잘못 선택 하셨습니다");
			}
		}
		
	}
}
