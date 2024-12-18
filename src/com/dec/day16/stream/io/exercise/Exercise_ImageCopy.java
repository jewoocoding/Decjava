package com.dec.day16.stream.io.exercise;

import java.io.*;
import java.util.*;

public class Exercise_ImageCopy {
	/*
	 * C:\Windows\Web\Wallpaper\Windows\img0.jpg를 복사해서
	 * C:\Temp\copyimg.jpg로 만들어 주세요.
	 * 단, 바이트 기반 스트림을 사용하세요.
	 */
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			byte [] tempBytes = new byte[1024];
			int readCount = 0;
			List<Byte> byteList = new ArrayList<Byte>();
			
			while((readCount = is.read(tempBytes)) != -1) {
				for(int i=0;i<readCount;i++) {
					byteList.add(tempBytes[i]);
				}
			}
			System.out.println("복사 완료");
			
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			for(int i=0;i<byteList.size();i++) {
				os.write(byteList.get(i));
			}
			os.flush();
			System.out.println("저장 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // close()는 반드시 해야하기 때문에 finally에 적어준다.
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
