package com.dec.day2x.music.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{
	// 필드
	private String title;
	private String singer;
	
	// 생성자
	public Music() {}
	// 필드 초기화는 생성자를 이용하는 것을 권장
	// setter는 권장하지 않음
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	
	@Override
	public String toString() {
		return "곡 : " + title + "\n가수 : " + singer;
	}
	
	public boolean equals(String title) {
		if(title.equals(this.title)) {
			return true;
		}else {
			return false;
		}
	}
	// Collection sort메소드를 사용하기 위한 오버라이딩
	@Override
	public int compareTo(Music o) {
		// String 클래스의 compareTo()메소드를 사용
		return this.title.compareTo(o.getTitle()); // -1, 0, 1
	}
}
