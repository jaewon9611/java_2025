package com.company.java008;

public class Method003 {
	public static String sign(	) {return"jaewon";}
	 public static int num() {return (int) (Math.random()*45);}
	//////////////////////////////////////////
	public static void main(String[] args) {
		//public static 리턴값 매서드명(파라미터) { }
		//public static jaewon sign(	) {return"jaewon"}
		//public static String sign(	) {return"jaewon"}
		System.out.println("당신의 이름은?" + sign());
		// 					당신의 이름은?	   jaewon
		
		// 4개더 기본
		// public static int yournum() {return"30"}
		int yournum = num();
		System.out.println("랜덤숫자 : " + yournum);
		
		// public static 리턴값 매서드명() { }
		// public static double pie() {return 3.141592 }
		System.out.println("파이값은 : " + pie());
		
		//public static String 매서드명(파라미터) { }
		//public static "안녕 alpha" hello("alpha") { }
		//public static   String    hello(String str) {return "안녕" + str;}
		System.out.println(hello("sally")); // 안녕 샐리
		System.out.println(hello("alpha")); // 안녕 알파
	}
	//////////////////////////////////////////
	public static double pie() {return 3.141592;}
	public static   String    hello(String str) {return "안녕" + str;}
}
