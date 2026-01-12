package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		try {
			list.add(music);
			return 1;
			
		}catch(Exception e) {
			return 0;
		}
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) { // *
		for (Music m : list) {
			// for(Object o : list
			// Music m = (Music) o;
	        if (m.getTitle().equals(title)) {
	            return m; // 객체의 정보만 반환하면 되어서 foreach문으로 통째로 돌려도 상관없음
	        }
	    }
	    return null;
	}
	
	public Music removeMusic(String title) { // *
		for (int i = 0; i < list.size(); i++) {
			// Music m = (Music) list.get(i);
	        Music m = list.get(i);
	        if (m.getTitle().equals(title)) {
	            list.remove(i); // 리스트의 정보를 삭제하려면 인덱스의 정보가 필수 - 따라서 basic for문
	            // list.remove(title)은 객체가 아닌 String(제목만) 삭제 - 의도에 맞지 않음
	            return m;
	        }
	    }
	    return null;
	    
	    /* 방법 1.
	     * Music m = null
	     * for(int i=0; i<list.size(); i++{ // list제네럴 없을 경우
	     *    Music music = (Music) list.get(i); // 따라서 다운캐스팅 필요
	     *    if(music.getTitle().equals(title)){
	     *    m = music;
	     *    list.remove(i);
	     * }
	     * 
	     * 방법 2.
	     * Object o = searchMusic(title);
	     * m = (Music)o;
	     * list.remove(o); Object입력 시 해당 객체의 정보를 삭제
	     * 
	     * return m;
	     */
	}
	
	public Music setMusic(String title, Music music) { // *
		for (int i = 0; i < list.size(); i++) {
			// Music m = (Music) list.get(i);
	        if (list.get(i).getTitle().equals(title)) {
	            Music old = list.set(i, music); // set(인덱스, 객체)라서 basic for
	            return old;                     // 기존 객체 반환
	        }
	    }
		/*
		Music m = searchMusic(title); // title 검색하여
		if (m != null) { // 있으면
			m.setTitle(music.getTitle()); // 받아온 music객체의 정보를 기존 정보위에 덮어쓰기
			m.setSinger(music.getSinger());
			return m;
		}
		*/
		
		/*
		 * try{
		 *    Music result = null;
		 *    int index = -1;
		 * 
		 *    for(int i=0; i<list.size(); i++) {
		 *       Music m = (Music) list.get(i);
		 *       
		 *       if(m.getTilte().equals(title)){
		 *       index = i;
		 *       result = m;
		 *       break;
		 *       }
		 *    }
		 *    list.set(index, music); 
		 *    return result;
		 * } catch(Exception e){
		 *    return null;
		 * }
		 */
		return null;
	}
	
	public int ascTitle() { // *
		Collections.sort(list, new AscTitle());
		return 1;
	}
	
	public int descSinger() { // *
		Collections.sort(list);
		return 1;
	}
}
