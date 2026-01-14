package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(! map.containsKey(id)) { // 기존 맵에 id가 없으면 즉, 신규회원이면
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String logIn(String id, String password) {
		String name = null;
		if(!map.containsKey(id)) { // 전달 받은 id가 존재하는지 확인
			return name;
		}
		if(map.get(id).getPassword().equals(password)) {
			// Member의 비밀번호와 전달값이 같은지 비교
			name = map.get(id).getName(); // Member의 이름 반환
		}
		return name;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.get(id) != null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> tm = new TreeMap<>();
		// map -> key = id, value = Member(password, name)
		// tm -> key = id, value = name
		
		// name을 기준으로 map의 모든 value값 Member m.getname().equals(name)
		// true가 나오는 Member의 id를 추출
		// tm.put(id, name)
		
		Set<String> key = map.keySet(); //key값만 모은 배열생성
		for(String id : key) { // key = id
			if(map.get(id).getName().equals(name)) {
				tm.put(id, name);
				// 키워드 포함이라면 추출해야 하지만 동명이인이면
				//map.get(key.getName() == name이라 결과는 똑같음
			}
		}
		
		return tm;
	}
}
