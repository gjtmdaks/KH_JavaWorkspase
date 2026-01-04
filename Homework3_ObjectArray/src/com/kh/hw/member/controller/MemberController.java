package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE]; // 최대 회원 수만큼 객체배열 생성
	public static int SIZE = 10;	// 최대 회원 수
	
	// 현재 회원 수
	int total = 0;
	public int existMemberNum() {
		return total;
	}
	
	public boolean checkId(String inputId) { // 아이디 중복 검사
		for(Member a : m) { // 객체배열 m의 객체 a에서 id만 뽑아 중복 검사
			if(a != null && a.getId().equals(inputId)) {
				return true;	// 중복 O
			}
		}
		return false;			// 중복 X
	}
	
	// 회원 추가
	public void insertMember(String id, String name, String password,
			String email, char gender, int age) {
		m[total++] = new Member(id, name, password, email, gender, age);
	}
	
	// 아이디 검색
	public String searchId(String id) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) {
				return a.inform(); // 해당 아이디를 가진 객체의 모든 정보 반환
								// 아이디는 중복 검사로 단 하나만 존재해서 String 반환
			}
		}
		return null;
	}
	
	public Member[] searchName(String name) { // 이름은 동명이인이 존재하여 배열로 반환
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
	
	// 비밀번호 변경
	public boolean updatePassword(String id, String password) {
		for(Member a : m) {
			if(a != null && a.getId().equals(id)) { // 해당 아이디를 가진 객체만
				a.setPassword(password);			// 비밀번호 변경
				return true;		// 수정 성공
			}
		}
		return false;				// 수정 실패
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
	
	// 하나의 계정만 삭제
	public boolean delete(String id) {
		for (int i = 0; i < total; i++) { // 0번째 인덱스부터 현재 회원수까지
	        if (m[i].getId().equals(id)) { // 각 객체의 아이디 검색하여 일치하면
	            for (int j = i; j < total - 1; j++) { // 삭제될 인덱스부터 끝까지
	                m[j] = m[j + 1]; // 인덱스 앞당기기. 뒷 인덱스 정보를 앞 인덱스로 저장
	                // 0, 1, 2, 3
	                // 2번째 인덱스를 삭제
	                // 0, 1, 2(3)
	                // 3번째 인덱스를 2번째 인덱스로 당기기
	                // 4 -> 3, 5->4 ...
	            }

	            m[total - 1] = null; // 마지막 인덱스의 정보를 비우기
	            // 현재 회원 수가 6명이라면 인덱스는 0부터 5까지 존재. 그래서 total-1
	            total--; // 현재 회원수 하나 줄이기
	            return true;
	        }
	    }
	    return false;
	}
	
	// 모든 계정 삭제
	// 한 계정 삭제는 boolean delete(String id)
	// 모든 계정 삭제는 void delete()
	// 반환값과 매개변수가 다른 메서드(생성자의 응용지식)
	public void delete() {
		for (int i = 0; i < total; i++) {
	        m[i] = null;
	    }
	    total = 0;
	}
	
	// 모든 계정 정보 출력
	public Member[] printAll() {
		Member[] result = new Member[total];
	    for (int i = 0; i < total; i++) {
	        result[i] = m[i];
	    }
	    return result;
	}
}
