package com.dec.day15.stream.outputstream;

import java.io.*;

public class Exam_OutputStreamWrite {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/dec/day15/stream/outputstream/writing.txt");
			os.write(65);
			os.write(66);
			os.flush(); // 버퍼안에 있는 값을 모두 파일에 저장함
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
