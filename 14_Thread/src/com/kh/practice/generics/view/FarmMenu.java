package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("========== KH 마트 ==========");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void adminMenu() {
		while(true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void customerMenu() {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		
		while(true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void addNewKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int kind = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("수량 : ");
			int num = sc.nextInt();
			
			Farm f = new Farm();
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			if(fc.addNewKind(f, num)) {
				System.out.println("새 농산물이 추가되었습니다.");
				break;
			}else {
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int kind = sc.nextInt();
			System.out.print("이름 : ");
			String name = sc.next();
			
			Farm f = new Farm();
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			if(fc.removeKind(f)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				break;
			}else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.println("수정할 종류 번호 : ");
			int kind = sc.nextInt();
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("수정할 수량 : ");
			int num = sc.nextInt();
			
			Farm f = new Farm();
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			if(fc.changeAmount(f, num)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				break;
			}else {
				System.out.println("농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> hm = fc.printFarm();
		Set<Farm> key = hm.keySet();
		for(Farm f : key) {
			int num = hm.get(f);
			String kind=null;
			String name=null;
			
			if(f instanceof Fruit) {
				kind = ((Fruit) f).getKind();
				name = ((Fruit) f).getName();
			}
			if(f instanceof Vegetable) {
				kind = ((Vegetable) f).getKind();
				name = ((Vegetable) f).getName();
			}
			if(f instanceof Nut) {
				kind = ((Nut) f).getKind();
				name = ((Nut) f).getName();
			}
			
			System.out.println(kind+" : "+name+"("+num+"개)");
		}
	}
	
	public void buyFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.println("구매 종류 번호 : ");
			int kind = sc.nextInt();
			System.out.println("구매할 것 : ");
			String name = sc.next();
			
			Farm f = new Farm();
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			if(fc.buyFarm(f)) {
				System.out.println("구매에 성공하였습니다.");
				break;
			}else {
				System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.println("취소 종류 번호 : ");
			int kind = sc.nextInt();
			System.out.println("구매 취소할 것 : ");
			String name = sc.next();
			
			Farm f = new Farm();
			switch(kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			if(fc.removeFarm(f)) {
				System.out.println("구매 취소에 성공하였습니다.");
				break;
			}else {
				System.out.println("구매매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void printBuyFarm() {
		ArrayList<Farm> list = fc.printBuyFarm();
		
		Iterator<Farm> iter = list.iterator();
		while(iter.hasNext()) {
			Farm f = iter.next();
			if(f instanceof Fruit) {
				System.out.println((Fruit)f);
			}
			if(f instanceof Vegetable) {
				System.out.println((Vegetable)f);
			}
			if(f instanceof Nut) {
				System.out.println((Nut)f);
			}
		}
	}
}
