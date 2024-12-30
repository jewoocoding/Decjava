package com.dec.day2x.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.dec.day2x.music.vo.DescTitle;
import com.dec.day2x.music.vo.DscSinger;
import com.dec.day2x.music.vo.Music;

public class MusicManage {
	// TODO 데이터의 최종 저장소가 존재
	List<Music> musicList;
	
	public MusicManage() {
		musicList = new ArrayList<Music>();
	}
	public void registerMusic(Music music) {
		musicList.add(music);
	}
	public void registerMusicAtFirst(Music music) {
		musicList.add(0, music);
	}
	public List<Music> getAllMusic() {
		return musicList;
	}
	
	public Music findMusic(String title) {
		Music getMusic = null;
		for(Music music : musicList) {
			if(music.equals(title)) {
				getMusic = music;
			}
		}
		return getMusic;
	}
	public void modifyMusic(Music music1, Music music2) {
		for(int i=0;i<musicList.size();i++) {
			if(musicList.get(i).equals(music1.getTitle())) {
				musicList.set(i, music2);
				break;
			}
		}
	}
	public void removeMusic(Music music) {
		for(int i=0;i<musicList.size();i++) {
			if(musicList.get(i).equals(music.getTitle())) {
				musicList.remove(i);				
			}
		}
	}
	
	public void titleAscendingSort() {
		/*
		 * 정렬하는 방법
		 * 1. 알고리즘 사용하기
		 * 2. Collections 클래스 사용하기
		 */
		
		// Collections.sort()메소드를 사용하기 위해서는 비교할 객체의 클래스가
		// Comparable 인터페이스를 상속받아 compareTo()메소드를 오버라이딩 해야한다.
		Collections.sort(musicList);
		
//		for(int i=0;i<musicList.size();i++) {
//			for(int j=i;j<musicList.size();j++) {
//				int flag = musicList.get(i).getTitle().compareTo(musicList.get(j).getTitle());
//				if(flag > 0) {
//					Music temp = musicList.get(i);
//					musicList.set(i, musicList.get(j));
//					musicList.set(j, temp);
//				}
//			}
//		}
	}
	
	public void titleDescendingSort() {
		// vo패키지의 DescTitle 클래스의 compareTo()메소드를 사용해 정렬 
		Collections.sort(musicList, new DescTitle());
		
		// 선택 정렬 사용
//		for(int i=0;i<musicList.size();i++) {
//			for(int j=i;j<musicList.size();j++) {
//				int flag = musicList.get(i).getTitle().compareTo(musicList.get(j).getTitle());
//				if(flag < 0) {
//					Music temp = musicList.get(i);
//					musicList.set(i, musicList.get(j));
//					musicList.set(j, temp);
//				}
//			}
//		}
	}
	public void singerAscendingSort() {
		// 선택 정렬 사용
		for(int i=0;i<musicList.size();i++) {
			for(int j=i;j<musicList.size();j++) {
				int flag = musicList.get(i).getSinger().compareTo(musicList.get(j).getSinger());
				if(flag > 0) {
					Music temp = musicList.get(i);
					musicList.set(i, musicList.get(j));
					musicList.set(j, temp);
				}
			}
		}
	}
	public void singerDescendingSort() {
		
		Collections.sort(musicList, new DscSinger());
//		for(int i=0;i<musicList.size();i++) {
//			for(int j=i;j<musicList.size();j++) {
//				int flag = musicList.get(i).getSinger().compareTo(musicList.get(j).getSinger());
//				if(flag < 0) {
//					Music temp = musicList.get(i);
//					musicList.set(i, musicList.get(j));
//					musicList.set(j, temp);
//				}
//			}
//		}
	}
}
