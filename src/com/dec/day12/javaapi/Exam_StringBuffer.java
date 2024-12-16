package com.dec.day12.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		// 문자열들을 연결하여 Hello JAVA를 출력해보세요
		System.out.println(data1 + data2 + data3); // 메모리를 더 씀?
//		data1 = data1.concat(data2);
//		data1 = data1.concat(data3);
//		System.out.println(data1);
		System.out.println(data1.concat(data2).concat(data3));
		
		// StringBuffer를 이용해서 연결(메모리 절약)
		StringBuffer stb = new StringBuffer();
		stb.append("Hello").append(" ").append("JAVA");
		System.out.println("연결된 문자열 : "+stb.toString());
		stb.reverse();
		System.out.println("연결된 문자열 : "+stb.toString());
	}
}
