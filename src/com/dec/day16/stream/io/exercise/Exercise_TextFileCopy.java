package com.dec.day16.stream.io.exercise;

import java.io.*;

public class Exercise_TextFileCopy {
	/*
	 * C:\\Windows\\system.ini을 복사해서
	 * C:\\Temp\\system.txt로 만들어주세요.
	 * 단, 문자 기반 스트림을 사용하세요.
	 */
	public static void main(String[] args) {
		/*
		 * 파일을 복사하려고 해
		 * C드라이브 밑 Windows폴더 밑에 system.ini파일을 복사하려고 해
		 * main() 메소드를 기준으로 생각했을 때 해당 파일을 읽어야 하기 때문에
		 * 입력 스트림을 사용해야해.
		 * 입력스트림을 사용해서 파일을 읽은 다음에 읽은 내용은 
		 * 목적지 C:\\Temp\\system.txt파일에 써야해
		 * main()메소드를 기준으로 생각했을 때 해당 내요을 내보내야 하기 
		 * 때문에 출력스트림을 사용해야해.
		 * 출력스트림을 사욯애 읽은 내용은 system.text파일에 저장돼.
		 */
		Reader fr = null;
		Writer fw = null;
		try {
			// 입력
			fr = new FileReader("C:\\Windows\\system.ini");
			char[] tempChar = new char[1024];
			int readCount = 0;
			String text = "";
			while((readCount = fr.read(tempChar)) != -1) {
				text += new String(tempChar, 0, readCount);
			}
			System.out.println("복사 완료");
			
			// 출력
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
