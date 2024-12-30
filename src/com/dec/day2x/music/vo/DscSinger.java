package com.dec.day2x.music.vo;

import java.util.Comparator;

public class DscSinger implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getSinger().compareTo(o2.getSinger())*-1;
	}

}
