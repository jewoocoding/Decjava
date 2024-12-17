package com.dec.day15.stream.outputstream;

import java.io.*;

public class Exam_OutputStreamWriteByte {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/dec/day15/stream/outputstream/writing2.txt");
			// "헬로우 입출력" -> 바이트 배열, String을 바이트배열로 변환해주어야함.
			byte [] inputBytes = "헬로우우우 입출력".getBytes();
//			for(int i=0;i<inputBytes.length;i++) {
//				os.write(inputBytes[i]);				
//			}
			os.write(inputBytes);
			os.flush(); // 버퍼 비우기
			os.close(); // 자원해제
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
