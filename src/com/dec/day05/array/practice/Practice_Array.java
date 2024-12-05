package com.dec.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값을 반복문을 이용하여 순서대로 배열에 저장
		 */
		System.out.println("1부터 10까지 배열로 출력");
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");			
		}
	}
	
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값을 반복문을 이용하여 거꾸로 배열에 저장
		 */
		System.out.println("1부터 10까지 배열로 거꾸로 출력");
		int arr[] = new int[10];
		for(int i=0; i<arr.length;i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0, count =10; i<arr.length;i++, count--) {
			arr[i] = count;
			System.out.print(arr[i]+" ");
		}
			
		
	}
	
	public void practice3() {
		/*
		 * 입력받은 양의 정수만큼 배열 크기 할당후 
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력
		 */
		System.out.println("입력받은 정수까지 1부터 배열로 출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		/*
		 * 길이가 5인 String배열 선언, 초기화, 귤 출력
		 */
		System.out.println("String배열 생성후 귤 출력");
		String arr[] = new String[5];
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		/*
		 * 문자열을 입력받아 문자 하나하나 배열에 넣고 
		 * 검색할 문자가 문자열에 몇개 있는지, 몇번째 인덱스에 있는지 출력
		 */
		System.out.println("문자열 입력후, 문자 검색해 정보출력");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.next();
		
		int count = 0;
		
		char arr[] = new char[input.length()];
		for(int i=0; i<arr.length;i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 : ");
		char inputChar = sc.next().charAt(0);
		
		System.out.print(input+"에 "+inputChar+"가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == inputChar) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(inputChar+" 개수 : "+count);
		
		
	}
	
	public void practice6() {
		/*
		 * 문자열 배열에 요일 입력 후
		 * 0 ~ 6 입력받아 출력 
		 */
		System.out.println("요일 출력");
		Scanner sc = new Scanner(System.in);
		
		String[] day = new String[7];
		day[0] = "월요일";
		day[1] = "화요일";
		day[2] = "수요일";
		day[3] = "목요일";
		day[4] = "금요일";
		day[5] = "토요일";
		day[6] = "일요일";
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		try {
			System.out.println(day[input]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {

		/*
		 * 사용자가 배열의 길이 지정 후 정수형 배열을 선언 및 할당
		 * 사용자가 직접 값 입력해서 초기화
		 * 배열 전체 값 나열, 인덱스들의 총합 출력
		 */
		System.out.println("배열길이 지정 후, 배열값입력, 나열 출력, 총합 출력");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int leng = sc.nextInt();
		// 입력한 값의 길이를 갖는 배열 생성
		int[] arr = new int[leng];
		
		// 각각의 인덱스에 사용자가 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int arrIndex = sc.nextInt();
			arr[i] = arrIndex;
		}
		
		// 배열 출력, 배열 누적합 출력
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
	}
	
	public void practice8() {
		/*
		 * 3이상인 홀수 자연수 입력받고 중간까지는 1씩 오름차순
		 * 중간부터는 1씩 내림차순으로 출력
		 */
		System.out.println("3 이상인 홀수 입력받고 정규분포모양으로 출력");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input%2 == 0) {
				System.out.println("다시 입력하세요.");
			}else {
				int[] arr = new int[input];
				for(int i=0; i<input; i++) {
					if(i < input/2) {
						arr[i] = i+1;
					}else {
						arr[i] = input-i;
					}
					if(i == input-1)
						System.out.print(arr[i]);
					else
						System.out.print(arr[i]+", ");
				}
				break;
			}			
		}
	}
	
	public void practice9() {
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색
		 * 치킨메뉴 정하고 있으면 배달가능 출력
		 */
		System.out.println("치킨주문");
		Scanner sc = new Scanner(System.in);
		
		String[] menu = new String[5];
		menu[0] = "후라이드";
		menu[1] = "양념";
		menu[2] = "간장";
		menu[3] = "마늘";
		menu[4] = "양파";
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String input = sc.next();
		
		for(int i=0; i< menu.length;i++) {
			if(input.equals(menu[i])) {
				System.out.println(input + "치킨 배달 가능");
				return;
			}
		}
		System.out.println(input +"치킨은 없는 메뉴입니다.");
		
	}
	
	public void practice10() {
		/*
		 * 주민번호 입력 받고 성별 이후 자리부터 *로 출력
		 */
		System.out.println("주민번호 입력후, 출력");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		char[] output = new char[arr.length];
		
		for(int i = 0; i<input.length(); i++) {
			arr[i] = input.charAt(i);
			if(i > 7) {
				output[i] = '*';
			}else {
				output[i] = arr[i];
			}
			System.out.print(output[i]);
		}
		
	}
	
	public void practice11() {
//		int lotto[] = new int[6];
//		
//		lotto[0] = (int)(Math.random()*45 +1);
//		System.out.print(lotto[0]+" ");
//		for(int i=1, num=4; i<lotto.length;i++, num--) {
//			//Math.random()*(최대 - 최소 +1) +1
//			lotto[i] = (int)(Math.random()*((50-num) - lotto[i-1]+1) +1);
//			if( lotto[i] <= lotto[i-1]) {
//				i--;
//				continue;
//			}
//			System.out.print(lotto[i]+" ");
//		}
//		System.out.println();
		
//		int lotto2[] = new int[6];
//		Random rand = new Random();
//		for(int i = 0; i < lotto2.length; i++)
//			lotto2[i] = rand.nextInt(50)+1;
//		for(int i=0; i<lotto2.length;i++) {
//			for(int j=i+1; j<lotto2.length;j++) {
//				if(lotto2[i] == lotto2[j]) {
//					lotto2[j] = rand.nextInt(50)+1;
//					j--;
//					continue;
//				}
//			}
//			for(int j=i+1; j<lotto2.length;j++) {
//				if(lotto2[i] > lotto2[j]) {
//					int temp = lotto2[i];
//					lotto2[i] = lotto2[j];
//					lotto2[j] = temp;
//				}
//			}
//		}
//		
//		for(int num : lotto2)
//			System.out.print(num +" ");
		
		// 로또 추첨 프로그램 (1 ~ 45)
		// 오름차순 정렬, 중복 X
		System.out.println("로또 번호 출력");
		int[] lotto = new int[6];
		
		int num = 0;
		int count = 0;
		

		while(true) { // 난수 생성
			num = (int)(Math.random()*45+1); // 1 ~ 45 사이의 난수 생성
			if(count < 6) 
				lotto[count] = num; // 난수 배열에 투입
			
			for(int i = 0; i<lotto.length;i++) {
				if(num == lotto[i]){ // 생성한 난수가 배열에 있으면 다시 반복
					break;
				}
			}
			count++; // 몇 번 생성했는지 확인
			
			if(count == 6) { // 6번 생성했다면 빠져 나옴
				break;
			}
		}
		
		for(int i=0; i<lotto.length;i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
				
			}
		}
		
		for(int value : lotto)
			System.out.print(value+" ");

	}
	
	public void practice12() {
		
		System.out.println("문자열 입력받아 종류별 문자 출력후, 몇 종류있는지 출력");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		for(int i=0; i< arr.length;i++)
			arr[i] = input.charAt(i);
		
		int count = 0;
		int same = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<arr.length; i++) {
			same = 0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					same++;
				}
			}
			if(same == 0) {
				count++;
				if(i == arr.length-1) {
					System.out.print(arr[i]);
				}else {
					System.out.print(arr[i]+", ");
				}
			}
		}
		System.out.println();
		System.out.println("문자 개수 : "+count);
		
	}
}
