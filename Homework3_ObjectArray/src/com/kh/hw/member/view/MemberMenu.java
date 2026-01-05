package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {	// 기본 생성자
		
	}
	
	public void mainMenu() {
		while(true) {	// 잘못된 번호 입력 시 반복 시행
			System.out.println("최대 등록 가능한 회원 수는 "+MemberController.SIZE+"명입니다."); // size = 최대 회원 수
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다."); // existMemberNum의 total = 현재 회원 수
			
			if(mc.existMemberNum() != MemberController.SIZE) { // 회원이 안 찼으면
				System.out.println("1. 새 회원 등록"); // 등록 가능
			}else { // 아니면 등록 불가
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			// 나머진 공통메뉴
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				if(mc.existMemberNum() != MemberController.SIZE) {
					insertMember();
					break;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 회원 등록
	public void insertMember() {
		String id = "";
		while(true) {
			System.out.print("아이디 : ");
			id = sc.next();
			if(!(mc.checkId(id))) { // 중복 검사 시 중복이 없다면
				break;	// 통과
			}
			// 아니면 다시
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		
		char gender = '\u0000';
		while(true) { // 성별 검사
			System.out.print("성별(M/F) : ");
			gender = sc.next().toUpperCase().charAt(0); // 대문자로 변환
			if(gender=='M' || gender=='F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 입력된 정보들로 회원 추가
		mc.insertMember(id, name, password, email, gender, age);
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 아이디로 계정 검색
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		
		if(mc.searchId(id)!=null) { // searchId의 반환값이 있으면
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(id)); // 정보 출력
		}else { // null이면
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	// 이름으로 계정 검색
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		Member[] result = mc.searchName(name);
		
		if(result!=null) { // searchName의 반환값이 있으면
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member a : result) { // 이름과 이메일의 검색은 객체배열을 반환
				System.out.println(a.inform());
			}
		}else { // null이면
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	// 이름검색과 동일
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		
		Member[] result = mc.searchEmail(email);
		
		if(result!=null) { // searchEmail의 반환값이 있으면
			System.out.println("찾으신 회원 조회 결과입니다.");
			for(Member a : result) { // 이름과 이메일의 검색은 객체배열을 반환
				System.out.println(a.inform());
			}
		}else { // null이면
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	// 정보 수정
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			updatePassword();
			break;
		case 2:
			updateName();
			break;
		case 3:
			updateEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	// 비밀번호 수정
	public void updatePassword() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateName() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	// 회원 정보 삭제
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void deleteOne() {
		System.out.print("삭제할 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하십니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch!='Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		
		boolean result = mc.delete(id);
		if(result) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteAll() {
		System.out.print("정말 삭제하십니까? (Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch!='Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
	}
	
	public void printAll() {
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		for (Member a : mc.printAll()) {
			if (a != null) {
				System.out.println(a.inform());
			}
		}
	}
}
