package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);
	CharacterController cc = new CharacterController();
	
	public void menu() {
		System.out.print("문자열 : ");
		String s = sc.nextLine();
		try {
			int count = cc.countAlpha(s);
			System.out.println("'"+s+"'"+"에 포함된 영문자 개수 : "+count);
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
	}
}
