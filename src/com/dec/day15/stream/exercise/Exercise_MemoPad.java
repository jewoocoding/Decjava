package com.dec.day15.stream.exercise;

import java.io.*;
import java.util.*;

public class Exercise_MemoPad {
	/*		
	 *  // 저장할 파일 입력(확장자 제외) : snow
		// 종료는 exit
		// 1 : 오늘은
		// 2 : 눈이
		// 3 : 옵니다.
		// 4 : 펑펑
		// 5 : 옵니다.
		// 6 : exit
		// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일 입력 : ");
		String input = sc.next();
		System.out.println("종료는 exit");
		
		try {
			// Writer 객체 생성
			Writer fw = new FileWriter("src/com/dec/day15/stream/exercise/"+input+".txt");
			// 라인 카운트 변수
			int line = 0;
			do {
				line++;
				System.out.print(line+" : ");
				input = sc.next();
				if(!(input.equals("exit"))) // exit를 입력하면 파일에 저장하지 않고 프로그램 종료
					fw.write(input); // 입력받은 문자 파일에 저장
			}while(!(input.equals("exit")));
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
