package com.dec.day16.file;

import java.io.*;

public class Exam_File2 {
	public static void main(String [] args) {
		/*
		 * C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg 파일의 
		 * 파일명, 파일용량, 상위폴더, 저장절대경로, 저장상대경로를 출력하시오.
		 */
		
		File file = new File("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
		
		if(file.exists()) {
			System.out.println("파일명 : "+file.getName());
			// System.out.println("파일용량 : "+file.getTotalSpace());
			System.out.println("파일용량 : "+file.length());
			System.out.println("상위폴더 : "+file.getParent());
			System.out.println("저장절대경로 : "+file.getAbsolutePath());
			System.out.println("저장상대경로 : "+file.getPath());			
		}else {
			System.out.println("파일이 없는데여");
		}
		
	}
}
