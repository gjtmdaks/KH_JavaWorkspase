package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;
	
	int total = 0;
	public int existMemberNum() {
		return total;
	}
	
	public boolean checkId(String inputId) {
		for(Member a : m) {
			if(a != null && a.getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	
	public void insertMember(String id, String name, String password,
			String email, char gender, int age) {
		m[total++] = new Member(id, name, password, email, gender, age);
	}
	
	public String searchId(String id) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) {
				return a.inform();
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) {
		Member[] b = new Member[total];
		int i = 0;
		for(Member a : m) {
			if(a != null && a.getName().equals(name)) {
				b[i] = new Member(a.getId(), a.getName(), a.getPassword(), a.getEmail(), a.getGender(), a.getAge());
				i++;
			}
		}
		return b;
	}
	
	public Member[] searchEmail(String email) {
		Member[] b = new Member[total];
		int i = 0;
		for(Member a : m) {
			if(a != null && a.getEmail().equals(email)) {
				b[i] = new Member(a.getId(), a.getName(), a.getPassword(), a.getEmail(), a.getGender(), a.getAge());
				i++;
			}
		}
		return b;
	}
	
	public boolean updatePassword(String id, String password) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) {
				a.setPassword(password);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) {
				a.setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) {
				a.setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(String id) {
		for (int i = 0; i < total; i++) {
	        if (m[i].getId().equals(id)) {
	            for (int j = i; j < total - 1; j++) {
	                m[j] = m[j + 1];
	            }

	            m[total - 1] = null;
	            total--;
	            return true;
	        }
	    }
	    return false;
	}
	
	public void delete() {
		for (int i = 0; i < total; i++) {
	        m[i] = null;
	    }
	    total = 0;
	}
	
	public Member[] printAll() {
		Member[] result = new Member[total];
	    for (int i = 0; i < total; i++) {
	        result[i] = m[i];
	    }
	    return result;
	}
}
