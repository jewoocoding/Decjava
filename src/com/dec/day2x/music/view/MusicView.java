package com.dec.day2x.music.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.dec.day2x.music.vo.Music;

public class MusicView {
	// TODO 메인메뉴 출력 메소드
	// TODO 곡명, 가수명 입력 받는 메소드
	
	// 필드
	Scanner sc;
	
	// 생성자
	public MusicView() {
		sc = new Scanner(System.in);
	}
	
	// 메소드
	
	// 메인메뉴 출력
	public int printMenu() {
		while(true) {
			System.out.println("=== === 메인 메뉴 === ===");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 정보수정");
			System.out.println("6. 특정 곡 삭제");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 곡명 내림차순 정렬");
			System.out.println("9. 가수명 오름차순 정렬");
			System.out.println("10. 가수명 내림차순 정렬");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			try {
				int input = sc.nextInt();
				// enter를 제거하기 위해
				sc.nextLine(); // 개행제거
				return input;
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요 ㅡㅡ");
				sc.next();
			}	
		}
		// sc.close(); // Scanner도 스트림이기 때문에 자원을 해제해줘야 함.
		// -> 프로그램 종료될 때 해제
	}
	
	// 곡 추가
	public Music addMusic() {
		System.out.print("곡 명 : ");
		String title = sc.nextLine(); // 띄워쓰기 입력받는 메소드
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	
	public void printMusic(List<Music> musicList) {
		System.out.println("=== === 곡 목록 === ===");
		for(Music music : musicList) {
			System.out.println("=== === === ===");
			System.out.println(music.toString());
		}
	}
	
	public String findMusic(String category) {
		System.out.println("=== === 곡 "+category+" === ===");
		System.out.print(category+"할 곡 이름 : ");
		String title = sc.nextLine();
		return title;
	}
	
	public void printMusic(Music music) {
		System.out.println("=== === 곡 출력 === ===");
		System.out.println(music.toString());
	}
	
	public Music modifyMusic() {
		System.out.println("=== === 곡 수정 === ===");
		System.out.print("수정할 곡 이름 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 가수 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	
	public void printMsg(String msg) {
		System.out.println(msg);
		if(msg.equals("프로그램 종료요~")) {
			sc.close();
		}
	}
}
