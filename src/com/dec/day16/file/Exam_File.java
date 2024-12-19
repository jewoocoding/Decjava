package com.dec.day16.file;

import java.io.*;

public class Exam_File {
	public static void main(String[] args) {
		File folderMake = new File("src/com/dec/day16/file/sample");
		// 폴더가 없어서 폴더가 만들어지면 폴더가 만들어졌습니다. 출력
		// 폴더가 있으면 이미 폴더가 존재합니다. 출력
		
		if(!folderMake.mkdir()) {
			System.out.println("이미 폴더가 존재합니다.");
		}else {
			System.out.println("폴더가 만들어졌습니다.");
		}
	}
	
	public void fileMaekEx() {
		File fileMake = new File("src/com/dec/day16/file/new.txt");
		// 파일이 없어서 파일이 만들어지면 파일이 만들어졌습니다 출력
		// 파일이 있으면 파일이 있어서 이미 파일이 존재합니다. 출력
		
//		if(fileMake.exists()) {
//			System.out.println("이미 파일이 존재합니다.");
//			fileMake.delete();
//			System.out.println("파일을 삭제했습니다.");
//		}else {
//			try {
//				boolean b = fileMake.createNewFile();
//				System.out.println("파일이 만들어졌습니다.");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		try {
			if(fileMake.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
			}else {
				System.out.println("이미 파일이 존재합니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileBasic() {
		File file = new File("C:\\Temp\\copyimg.jpg");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		System.out.println("파일 이름 : "+fileName);
		System.out.println("파일 경로 : "+path);
		System.out.println("부모 폴더 : "+parent);
		System.out.println("파일이 존재하는가? :" + file.exists());
		System.out.println("파일이 맞는가? :"+file.isFile());
		System.out.println("폴더가 맞는가? :"+file.isDirectory());
	}
}
