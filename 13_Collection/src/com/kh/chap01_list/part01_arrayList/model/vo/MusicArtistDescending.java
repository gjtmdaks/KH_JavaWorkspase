package com.kh.chap01_list.part01_arrayList.model.vo;

import java.util.Comparator;

public class MusicArtistDescending implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		// 1. 오름차순
		// o1 비교메서드 o2
		
		// 2. 내림차순
		// o2 비교메서드 o1
		return o2.getArtist().compareTo(o1.getArtist());
	}
}
