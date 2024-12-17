package com.dec.day15.stream.inputstream;

import java.io.*;

public class Exam_InputStreamReadByte {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			byte[] readBytes = new byte[3]; // 보통 1024크기로 읽음
			String result = "";
			while((readByte = is.read(readBytes)) != -1) {
				// readByte는 읽은 값이 출력되는 것이 아니라
				// 읽은 개수를 출력함.
				// System.out.print(readByte);
				
				// System.out.println((char)readByte);
				// readBytes는 읽은 값을 가지고 있음
				// 나는 문자열로 출력을 해야함.
				// 바이트 배열 -> 스트링으로 변환되어야함.
				// "1" -> 1, Integet.parseInt("1");
				result += new String(readBytes, 0, readByte); // String 클래스를 사용 ??
			}
			System.out.println(result);
			is.close(); // 자원해제
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
