package com.dec.day15.stream.reader;

import java.io.*;

public class Exam_ReaderReadCharOff {
	// read(char[], int offset, int length)
	// length만큼 읽고 char[offset]부터 저장
	// 더 읽어들일 문자가 없으면 실제로 읽은 바이트수를 리턴
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("C:\\Windows\\system.ini");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			// 읽어들일 문자열이 없으면 read()메소드는 -1을 리턴
			while((readCount = fr.read(cBuf, 0, 3)) != -1) {
				result += new String(cBuf, 0, readCount);
				// 문자열에 있는 문자를 offset인덱스 부터 불러와서 문자열로 
				// 저장 length만큼만 불러온다.
			}
			System.out.println(result);
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
