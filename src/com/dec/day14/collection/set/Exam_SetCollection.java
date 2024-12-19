package com.dec.day14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {
	public static void main(String[] args) {
		// Collection -> 저장소의 역할을 함.
		// 자료구조의 특성에 따라서 선택해서 사용
		// List, Set, Map, Stack, Queue,...
		// Set은 순서가 없고 중복이 되지 않음.
		// -> 중복을 제거할 수 있음.
		
		// Set인터페이스 사용, <제네릭>
		Set<String> fruitsSet = new HashSet<String>(); // 컬렉션객체는 제네릭을 사용함
		String [] fruitsArrs = {"체리", "딸기", "포도", "사과", "딸기", "체리"};
		
		// 중복 제거 가능
		for(String fruits : fruitsArrs) {
			fruitsSet.add(fruits);
		}
		
//		for(int i=0; i<fruitsArrs.length;i++) {
//			fruitsSet.add(fruitsArrs[i]);
//		}
		
//		fruitsSet.add("딸기");
//		fruitsSet.add("체리");
//		fruitsSet.add("사과");
//		fruitsSet.add("포도");
//		fruitsSet.add("딸기"); // 똑같은 리터럴을 넣을 수는 있음
//		fruitsSet.add("체리"); // but 중복되는 것은 또 저장되지 않음
		System.out.println("크기 : "+fruitsSet.size());
		
		/*
		 * 수학의 집합 : 순서가 중요하지 않음. 중복을 허용하지 않음.
		 * 중복이 있는 데이터들을 Set에 넣으면 중복이 제거됨.
		 * ---> 만약에 저장소에서 데이터를 꺼내서 쓰려면
		 * 순서가 있는 경우에는 index를 활용하지만
		 * set처럼 순서가 없으면 지시자를 사용해야함.
		 */
		// Iterator = 지시자
		Iterator<String> it = fruitsSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString()); // toString()없어도 동작
		}
		
	}
}
