package com.dec.day15.stream.inputstream;

import java.io.*;

public class Exam_InputStreamRead {
	public static void main(String[] args) {
		try {
			// 업캐스팅
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); // 예외처리를 강제함
			int readByte;
			
			while((readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			
			do {
				readByte = is.read(); // 변수로 받아들이면 한번만 읽을 수 있음
				System.out.print((char)readByte);
			}while(readByte != -1);
			
			
			for(;;) { // 언제까지? 다 읽을 때까지 -> is.read() == -1 -> read()메소드는 다 읽으면 -1반환

				if(is.read() == -1) // 여기서한번 더 읽어서 결과가 다르게 나옴
					break;
				System.out.print((char)is.read());
			}
			is.close(); // 스트림 종료?
//			System.out.println((char)is.read()); // 한 byte씩 읽어들임
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
//			System.out.println((char)is.read());
			
			//is.read();
		} catch (FileNotFoundException e) { // 파일 불러올때 예외 처리 (FileInputStream)
			e.printStackTrace();
		} catch (IOException e) { // 입력 예외 처리 (is.read())
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
