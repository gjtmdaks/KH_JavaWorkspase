package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);

	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();

		int total = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;

		while (true) {
			System.out.print("가위바위보 : ");
			String str = sc.next();

			if (str.equals("exit")) {
				break;
			}

			int human;
			switch (str) {
			case "가위":
				human = 1;
				break;
			case "바위":
				human = 2;
				break;
			case "보":
				human = 3;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

			int random = (int) (Math.random() * 3 + 1);
			String result = "";
			switch (random) {
			case 1:
				result = "가위";
				break;
			case 2:
				result = "바위";
				break;
			case 3:
				result = "보";
				break;
			}

			System.out.println("컴퓨터 : " + result);
			System.out.println(name + " : " + str);

			if (human == random) {
				System.out.println("비겼습니다.\n");
				total++;
				draw++;
				continue;
			}
			if ((human == 1 && random == 3)
				|| (human == 2 && random == 1)
				|| (human == 3 && random == 2)) {
				System.out.println("이겼습니다!\n");
				total++;
				win++;
				continue;
			}
			if ((human == 1 && random == 2)
				|| (human == 2 && random == 3)
				|| (human == 3 && random == 1)) {
				System.out.println("졌습니다ㅠㅠ\n");
				total++;
				lose++;
				continue;
			}
		}
		System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
	}

	public void rps1() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		int win = 0;
		int loss = 0;
		int draw = 0;

		while (true) {
			System.out.print("가위바위보 : ");
			String rps = sc.next();

			if (rps.equals("exit")) {
				System.out.println((win + loss + draw) + "전 " + win + "승 " + draw + "무 " + loss + "패");
				break;
			}

			if (!(rps.equals("가위") || rps.equals("바위") || rps.equals("보"))) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

			String[] computers = { "가위", "바위", "보" };
			int random = (int) (Math.random() * 3);

			System.out.println("컴퓨터 : " + computers[random]);
			System.out.println(name + " : " + rps);

			if (computers[random].equals(rps)) {
				System.out.println("비겼습니다.");
				draw++;
			} else if (computers[random].equals("가위") && rps.equals("보")
					|| computers[random].equals("보") && rps.equals("바위")
					|| computers[random].equals("바위") && rps.equals("가위")) {
				System.out.println("졌습니다 ㅠ");
				loss++;
			} else {
				System.out.println("이겼습니다.");
				win++;
			}
		}
	}
}
