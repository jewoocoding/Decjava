package com.dec.day2x.music.vo;

import java.util.Comparator;

public class DescTitle implements Comparator<Music>{
	// 내림차순용 클래스

	@Override
	public int compare(Music o1, Music o2) {
		// 오름차순 비교하고 -1을 곱해 반대의 결과가 나오게 함 -> 내림차순으로 됨
		return o1.getTitle().compareTo(o2.getTitle())*(-1);
	}
}
