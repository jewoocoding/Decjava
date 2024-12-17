package com.dec.day14.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {
	
	public static void main(String[] args) {
		/*
		 * List 인터페이스가 있음
		 * List 인터페이스를 구현하여 만든 클래스가 잇음
		 * 데이터의 순서를 유지하고 중복 저장 가능하도록 함.
		 * ArrayList 클래스를 사용하여 구현할 수 있음.
		 */
		List<String> nameList = new ArrayList<String>();
		// ArrayList에 데이터 추가
		nameList.add("챗지피티");
		nameList.add("클로드");
		nameList.add("코파일럿");
		// 출력
		for(int i=0; i<nameList.size();i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		// 인덱스값을 이용해 삭제
		nameList.remove(0);
		System.out.println();
		for(int i=0; i<nameList.size();i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		
		nameList.add(0, "챗지피티"); // 인덱스를 지정하여 데이터 저장
		nameList.add("퍼플렉시티");
		nameList.add("라마");
		System.out.println();
		for(int i=0; i<nameList.size();i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		// 여러 속성 출력
		System.out.println("크기 : "+nameList.size());
		System.out.println("비움 여부 : "+nameList.isEmpty());
		// 초기화
		nameList.clear();
		System.out.println("크기 : "+nameList.size());
		System.out.println("비움 여부 : "+nameList.isEmpty());
		
	}
	
	public void genericSample() {
		GenericList<String> strList = new GenericList<String>();
		
		strList.add("챗지피티");
		strList.add("클로드");
		strList.add("코파일럿");
		
		System.out.println("크기 : "+strList.size());
		String chatgpt = strList.get(0); // 형변환이 필요없음
		System.out.println(chatgpt);
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		
		GenericList<Object> objList = new GenericList<Object>();
		objList.add("네이버");
		objList.add("라인");
		objList.add("토스");
		String naver = (String)objList.get(0); // 형변환을 해줘야함
		System.out.println(naver);
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	
	public void objListSample() {
		ObjectList objList = new ObjectList();
		
		// Wrapper 클래스를 활용한 업캐스팅
		objList.add(5.7); // 오토박싱되어서 저장됨
		objList.add(1225);
		objList.add("크리스마스");
		
		// Object객체를 double로 강제 형변환
		// Wrapper 클래스를 활용한 다운캐스팅
		double nums = (double)objList.get(0);
		int christmas = (int)objList.get(1);
		String msg = (String)objList.get(2);
		
		System.out.println(objList.get(0));
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	
	public void intListSample() {
		IntList numList = new IntList();
//		numList[0] = 11;
		numList.add(11);
		numList.add(15);
		numList.add(52);
		numList.add(12);
		
		System.out.println("크기 : "+numList.size());
		System.out.println(numList.get(0));
		System.out.println(numList.get(1));
		System.out.println(numList.get(2));
		System.out.println(numList.get(3));
		
		numList.clear();
		System.out.println("크기 : "+numList.size());
	}
}
