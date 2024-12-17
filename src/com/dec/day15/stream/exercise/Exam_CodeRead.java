package com.dec.day15.stream.exercise;

import java.io.*;

public class Exam_CodeRead {
	/*
	 * Exam_InputStreamReadByteOff.java 파일을 읽어서 콘솔에 출력해보세요.
	 * 단, 문자기반 스트림을 이용하세요!
	 */
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("src/com/dec/day15/stream/inputstream/Exam_InputStreamReadByteOff.java");
			// 읽어온 문자를 저장할 배열 선언
			char [] cBuf = new char[1024] ;
			// 몇번 읽었는지 확인
			int readCount = 0;
			// 출력할 문자열 선언
			String result = "";
			while((readCount = fr.read(cBuf)) != -1) { // 더 읽어올 데이터가 없을 때까지 반복, 읽은 문자를 cBuf에 저장
				result += new String(cBuf, 0, readCount); //cBuf에 저장된 값을 0인덱스 부터 읽어들인 개수 만큼 result에 더함
			}
			// 출력
			System.out.println(result);
			fr.close(); //  자원해제
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
