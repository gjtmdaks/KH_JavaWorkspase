package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		while (true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void triangleMenu() {
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printlnformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void squareMenu() {
		while (true) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printlnformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double h = sc.nextDouble();
			System.out.print("너비 : ");
			double w = sc.nextDouble();

			System.out.println("삼각형 면적 : "+tc.calcArea(h, w));
			return;
		}
		if (type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String c = sc.next();

			tc.paintColor(c);
			System.out.println("색이 수정되었습니다.");
			return;
		}
		if (type == 4 && menuNum == 1) {
			System.out.print("높이 : ");
			double h = sc.nextDouble();
			System.out.print("너비 : ");
			double w = sc.nextDouble();

			System.out.println("사각형 둘레 : "+scr.calcPerimeter(h, w));
			return;
		}
		if (type == 4 && menuNum == 2) {
			System.out.print("높이 : ");
			double h = sc.nextDouble();
			System.out.print("너비 : ");
			double w = sc.nextDouble();

			System.out.println("사각형 면적 : "+scr.calcArea(h, w));
			return;
		}
		if (type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String c = sc.next();

			scr.paintColor(c);
			System.out.println("색이 수정되었습니다.");
			return;
		}
	}

	public void printlnformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
			return;
		}
		if (type == 4) {
			System.out.println(scr.print());
			return;
		}
	}
}
