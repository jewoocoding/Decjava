package com.dec.day12.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		
		String query = "name=james&addr=seoul&age=33";
		// String 클래스의 split 메소드를 사용하여 문자열을 쪼갬
		String [] words = query.split("&");
		for(String word : words)
			System.out.println(word);
		System.out.println();
		
		// 메모리 사용랑이 더 적고, 더 빠름
		// 문자열을 토큰으로 나눠 저장함
		StringTokenizer st = new StringTokenizer(query,"&");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
