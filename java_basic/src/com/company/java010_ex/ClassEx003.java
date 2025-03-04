package com.company.java010_ex;

class Coffee {
	// 멤버 변수
	String name; int num, price;
	// 멤버 함수
	void show() {
		System.out.println("=====커피\r\n"
				+ "커피명 :" + name + "\r\n"
				+ "커피잔수 :" + num + "\r\n"
				+ "커피가격 :" + num*price);
	}	//커피정보출력
	// 생성자 - 사용자가 넣어준 값
	 Coffee(String name,int num, int price) { // 수동작성
		this.name=name;
		this.num=num;
		this.price=price;
	}
	Coffee() {name="아메리카노"; num=1; price=2000;} // 기본생성자 자동생성 취소
	
}

public class ClassEx003 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼",2, 4000); a1.show();
		Coffee a2 = new Coffee();				  a2.show();
	}
}
