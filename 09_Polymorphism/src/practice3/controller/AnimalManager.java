package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		/*
		a[0] = new Dog("초코", "셰퍼드", 10);
		a[1] = new Cat("나비", "스핑크스", "가정", "하얀색");
		a[2] = new Dog("초코", "셰퍼드", 12);
		a[3] = new Dog("초코", "셰퍼드", 9);
		a[4] = new Cat("나비", "스핑크스", "길바닥", "하얀색");
		
		for(Animal ani : a) {
			ani.speak();
		}
		*/
		
		
		
		
		
		String[] dogNames = {"초코", "바둑이", "점박이", "코코", "보리"};
		String[] dogKinds = {"말티즈", "푸들", "포메라니안", "믹스견", "셰퍼드"};

		String[] catNames = {"레오", "뭉치", "나비", "치즈", "설탕"};
		String[] catKinds = {"코리안숏헤어", "페르시안", "러시안블루", "스핑크스", "길고양이"};
		String[] locations = {"가정", "길바닥", "풀숲", "정글", "사막"};
		String[] colors = {"노란색", "하늘색", "검은색", "하얀색", "회색"};

		for (int i = 0; i < a.length; i++) {

		    int r = (int)(Math.random() * 2); // 0 or 1

		    if (r == 0) { // Dog
		        String name = dogNames[(int)(Math.random() * dogNames.length)];
		        String kind = dogKinds[(int)(Math.random() * dogKinds.length)];
		        int weight = (int)(Math.random() * 16) + 1; // 1 ~ 15

		        a[i] = new Dog(name, kind, weight);

		    } else { // Cat
		        String name = catNames[(int)(Math.random() * catNames.length)];
		        String kind = catKinds[(int)(Math.random() * catKinds.length)];
		        String location = locations[(int)(Math.random() * locations.length)];
		        String color = colors[(int)(Math.random() * colors.length)];

		        a[i] = new Cat(name, kind, location, color);
		    }
		}

		// speak() 실행
		for (int i = 0; i < a.length; i++) {
		    a[i].speak();
		}

	}
}
