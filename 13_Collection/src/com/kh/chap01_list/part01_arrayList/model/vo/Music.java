package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music implements Comparable<Music> {
	private String title;
	private String artist;
	
	public Music() {
		super();
	}
	
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		/*
		 * compareTo메서드
		 *  - 현재(this)객체와 매개변수로 전달된 객체간의 비교를 수행하는 메서드
		 *  - 반환값으로 양수, 0, 음수의 값들이 반환되도록 설정해야한다.
		 *  - sort메서드에서 호출한다.
		 *  - 양수 -> 자리유지
		 *    음수 -> 자리교체
		 *    0 : 자리유지
		 */
		// 내가 구현하고자 하는 정렬조건
		// 1. 제목기준 오름차순 정렬.
		//  - 현재객체.비교메서드(다른객체)
		this.title.compareTo(o.title);
		
		// 2. 제목기준 내림차순 정렬.
		//  - 다른객체.비교메서드(현재객체)
		o.title.compareTo(this.title);
		
		// 3. 제목, 아티스트 기준 오름차순 정렬
		if(this.title.compareTo(o.title) == 0) { // 제목기준 오름차순 정렬결과가 0인 경우
			this.artist.compareTo(o.artist); // 아티스트기준 오름차순 정렬 사용.
		}
		
		return this.title.compareTo(o.title);
	}
}
