package com.dec.day16.stream.io.exercise;

import java.io.*;

public class Exercise_TextFileCopy {
	/*
	 * C:\\Windows\\system.ini을 복사해서
	 * C:\\Temp\\system.txt로 만들어주세요.
	 * 단, 문자 기반 스트림을 사용하세요.
	 */
	public static void main(String[] args) {
		Reader fr = null;
		Writer fw = null;
		try {
			fr = new FileReader("C:\\Windows\\system.ini");
			char[] tempChar = new char[1024];
			int readCount = 0;
			String text = "";
			while((readCount = fr.read(tempChar)) != -1) {
				text += new String(tempChar, 0, readCount);
			}
			System.out.println("복사 완료");
			
			
			fw = new FileWriter("C:\\Temp\\system.txt");
			fw.write(text);
			fw.flush();
			System.out.println("저장 완료");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // close는 반드시 해야하기 때문에 finally에 적어준다.
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
