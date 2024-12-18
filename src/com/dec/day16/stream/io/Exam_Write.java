package com.dec.day16.stream.io;

import java.io.*;

public class Exam_Write {
	public static void main(String[] args) {
		try {
			// 바이트스트림
			OutputStream os = new FileOutputStream("src/com/dec/day16/stream11/io/writing.txt");
			// 문자스트림
			Writer fw = new FileWriter("src/com/dec/day16/stream/io/writing2.txt");
			
			byte [] byteArrs = "헬로우 입출력".getBytes();
			os.write(byteArrs);
			os.flush(); // 버퍼 비우기
			os.close(); // 자원 해제
			System.out.println("파일 쓰기 완료 F5를 눌러 확인");
			
			fw.write("문자열 그대로 매개변수로 넘겨줄 수 있음\n-> 배열 변환 필요 없음");
			fw.flush();
			fw.close();
			System.out.println("패키지 클릭 후 F5를 눌러 확인해보세요");
			
		} catch (FileNotFoundException e) {
			// 슈퍼클래스인 Exception으로도 받을 수 있음
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
