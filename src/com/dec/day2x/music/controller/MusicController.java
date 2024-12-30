package com.dec.day2x.music.controller;

import java.util.List;

import com.dec.day2x.music.model.MusicManage;
import com.dec.day2x.music.view.MusicView;
import com.dec.day2x.music.vo.Music;

public class MusicController {
	// TODO Manage와 View 연결해주는 곳
	public static void main(String[] args) {
		MusicManage manage = new MusicManage();
		MusicView view = new MusicView();
		
		finish:
		while(true) {
			int menu = view.printMenu();
			Music music;
			String title;
			switch(menu) {
			case 1: 
				// 1. 마지막 위치에 곡 추가
				music = view.addMusic();
				manage.registerMusic(music);
				break;
			case 2: 
				// 2. 첫 위치에 곡 추가
				music = view.addMusic();
				manage.registerMusicAtFirst(music);
				break;
			case 3: 
				// 3. 전체 곡 목록 출력
				List<Music> musicList = manage.getAllMusic();
				if(musicList.size() > 0) {
					view.printMusic(musicList);
				}else {
					view.printMsg("아무 곡도 없는데여 ㅡㅡ");
				}
				break;
			case 4: 
				// 4. 특정 곡 검색
				// 곡명을 입력 받고
				title = view.findMusic("검색");
				// musicList에서 찾아서
				music = manage.findMusic(title);
				// view를 이용해 출력
				if(music != null) {
					view.printMusic(music);					
				}else {
					view.printMsg("그런 곡은 없어요 ㅡㅡ");
				}
				break;
			case 5: 
				// 5. 특정 곡 정보수정
				title = view.findMusic("수정");
				Music mMusic = manage.findMusic(title);
				if(mMusic == null) {
					view.printMsg("그런 곡은 없어요 ㅡㅡ");
				}
				view.printMusic(mMusic);
				music = view.modifyMusic();
				manage.modifyMusic(mMusic, music);
				break;
			case 6:
				// 6. 특정 곡 삭제
				title = view.findMusic("삭제");
				music = manage.findMusic(title);
				if(music != null) {
					manage.removeMusic(music);
				}else {
					view.printMsg("그런 곡은 없어요 ㅡㅡ");
				}
				break;
			case 7:
				// 7. 곡명 오름차순 정렬
				manage.titleAscendingSort();
				view.printMsg("곡명 오름차순으로 정렬했어여");
				break;
			case 8:
				// 8. 곡명 내림차순 정렬
				manage.titleDescendingSort();
				view.printMsg("곡명 내림차순으로 정렬했어여");
				break;
			case 9: 
				// 9. 가수명 오름차순 정렬
				manage.singerAscendingSort();
				view.printMsg("가수명 오름차순으로 정렬했어여");
				break;
			case 10: 
				// 10. 가수명 내림차순 정렬
				manage.singerDescendingSort();
				view.printMsg("가수명 내림차순으로 정렬했어여");
				break;
			case 0:
				// 0. 종료
				view.printMsg("프로그램 종료요~");
				break finish;
			default:
				
			}
		}
	}
}
