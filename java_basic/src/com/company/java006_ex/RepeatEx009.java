package com.company.java006_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
		//ver-1 눈에 보이는 그대로 출력
		// ABCDE
		// FGHIJ
		// KLMNO
		// PQRST
		// UVWXY
		// Z
//		System.out.println(); System.out.print('A');
//		System.out.println(); System.out.print('F');
//		System.out.print('K');
//		System.out.print('P');
//		System.out.print('U');
//		System.out.print('Z');
		
		
		//ver-2
		//System.out.println('A'); 알파벳 , System.out.println(); 줄바꿈 =5번째바꿈 A(65) F(70)
		// System.out.println('A'); 2) 알파벳 5개출력 A~Z 2)알파벳이랑 연결? A(65) F(70)
		
		//		if('A'%5==0) {System.out.println();} System.out.print('A');
		//		if('B'%5==0) {System.out.println();} System.out.print('B');
		//		if('C'%5==0) {System.out.println();} System.out.print('C');
		//		if('D'%5==0) {System.out.println();} System.out.print('D');
		//		if('E'%5==0) {System.out.println();} System.out.print('E');
		//		if('f'%5==0) {System.out.println();} System.out.print('F');
		for(char ch='A'; ch<='Z'; ch++){ if(ch%5==0) {System.out.println();} System.out.println(ch);}
		
		char ch='A'; while(ch<='Z') {if(ch%5==0) {System.out.println();} System.out.println(ch);ch++;}
		
		ch='A'; do{if(ch%5==0) {System.out.println();} System.out.println(ch);ch++;}while(ch<='Z');
	}
}
