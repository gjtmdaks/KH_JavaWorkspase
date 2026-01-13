package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) { // 기존 맵에 id가 없으면 즉, 신규회원이면
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
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
		
		for (String key : map.keySet()) { // keySet() 사용
	        Member member = map.get(key);

	        if (member.getName().equals(name)) {
	            tm.put(key, member.getName()); // id, name
	        }
	    }
		
		return tm;
	}
}
