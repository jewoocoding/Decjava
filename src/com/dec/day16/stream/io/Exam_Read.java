package com.dec.day16.stream.io;

import java.io.*;

public class Exam_Read {
	// 헷갈리지 않게 main을 기준으로 생각
	public static void main(String[] args) {
		// 파일 읽어라~
		try {
			// InputStream은 최상위 클래스, 업캐스팅 적용
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			Reader fr = new FileReader("src/com/dec/day15/stream/exercise/Exercise_MemoPad.java");
			
			int readCount; 
			byte[] readBytes = new byte[1024];
			readCount = is.read(readBytes);
			// 0인덱스부터 readCount만큼 readBytes를 읽어서 문자열로 저장
			String result = new String(readBytes, 0, readCount); 
			// 배열이 크면 한번에 읽어올 수 있어서 반복하지 않아도 되나
			// 파일이 크기가 크면 반복하여 읽어와야 한다.
			System.out.println(result); // 결과 출력, system.ini파일 내용 출력
			is.close();					// 자원 해제
			
			int readChar;
			char[] readChars = new char[1024];
			while((readChar = fr.read(readChars)) != -1) {
				result += new String(readChars, 0, readChar);
			}
			System.out.println(result);
			fr.close();
			
			
		} catch (FileNotFoundException e) {
			// Checked Exception 처리(무조건 처리해야 하는 예외상황)
			e.printStackTrace();
		} catch (IOException e) {
			// Checked Exception 처리(무조건 처리해야 하는 예외상황)
			e.printStackTrace();
		}
	}
}
