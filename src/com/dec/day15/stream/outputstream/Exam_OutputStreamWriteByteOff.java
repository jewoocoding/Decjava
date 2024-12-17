package com.dec.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWriteByteOff {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/dec/day15/stream/outputstream/writing3.txt");
			byte[] bytes = "마지막 입출력 테스트".getBytes();
			// 한글 3바이트씩 읽음
			os.write(bytes, 0 , 15);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
