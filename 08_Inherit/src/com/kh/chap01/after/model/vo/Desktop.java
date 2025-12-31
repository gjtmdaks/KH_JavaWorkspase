package com.kh.chap01.after.model.vo;

public class Desktop extends Product{
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName,
				int price, boolean allInOne) {
		// 부모객체에게 상속받은 변수는 super, 자식객체(스스로)의 변수는 this
		// super : 부모의 주소값이 담긴 변수
		
		// 상속 메모리 구조 보여주기
		// 부모객체 필드의 값 초기화 하기
		// 1. 자식클래스에서 부모클래스의 필드에 접근 가능하도록 접근제한자를 수정.
		//    private -> protected
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
//		this.allInOne = allInOne;
//		
//		// 2. 부모클래스에 있는 setter메서드 사용
//		super.setBrand(brand);
//		setpCode(pCode);
//		setpName(pName);
//		setPrice(price);
//		this.allInOne = allInOne;
		
		// 3. 부모생성자 호출하기.
		// 생성자 호출은 생성자에서 가장 먼저 나와야 한다.
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	// boolean 자료형일 경우 get이 아닌 is로 생성
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 객체의 정보를 문자열로 반환하는 메서드
	// 오버라이딩 : 부모클래스와 자식클래스의 메서드명이 동일한 케이스.
	@Override
	public String information() {
		String result = getBrand()+", "+getpCode()+", "+
					getpName()+", "+getPrice()+", "+isAllInOne();
		
		return super.information()+", "+allInOne;
	}
}
