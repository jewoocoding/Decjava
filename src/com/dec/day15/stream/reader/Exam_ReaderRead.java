package com.dec.day15.stream.reader;

import java.io.*;

public class Exam_ReaderRead {
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("C:\\Windows\\system.ini");
			int readData;
			while((readData = fr.read()) != -1) {
				System.out.print((char)readData);
			}
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
