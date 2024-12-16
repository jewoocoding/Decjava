package com.dec.day14.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;
import java.util.spi.LocaleServiceProvider;

public class Exam_MapCollection {
	public static void main(String [] args) {
		/*
		 * 전화번호부에서 지역번호를 검색하면 지역을 출력해주는 프로그램을 작성해주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		Map<String, String> phoneMap = new HashMap<String, String>();
		phoneMap.put("02", "서울");
		phoneMap.put("031", "경기도");
		phoneMap.put("032", "인천");
		phoneMap.put("051", "부산");
		phoneMap.put("052", "울산");
		phoneMap.put("053", "대구");
//		System.out.println("저장된 데이터 수 : "+phoneMap.size());
//		System.out.println("02누르면 : "+phoneMap.get("02"));
//		System.out.println("031누르면 : "+phoneMap.get("031"));
		String localNumber = "";
		do {
			System.out.print("확인하실 지역번호를 입력해주세요 : ");
			localNumber = sc.next();
			
			if(phoneMap.get(localNumber) != null) {
				System.out.println("검색하신 지역은 : "+phoneMap.get(localNumber));
			}else {
				System.out.println("없는 지역번호입니다.");
			}
			
			if(phoneMap.containsKey(localNumber)) {
				System.out.println("검색하신 지역은 : "+phoneMap.get(localNumber));
			}else {
				System.out.println("없는 지역번호입니다.");
			}
		}while(!"exit".equals(localNumber)); // exit을 입력하면 반복문 종료
		
		
//		switch(localNumber) {
//		case "02" : System.out.println("서울입니다."); break;
//		case "031" : System.out.println("경기도입니다."); break;
//		}
//		
//		if("02".equals(localNumber)) {
//			System.out.println("서울입니다.");
//		}else if("031".equals(localNumber)) {
//			System.out.println("경기도입니다.");
//		}
	}
}
