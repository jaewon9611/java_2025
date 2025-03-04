package com.company.java008;

public class Method002 {
	//#1. 함수정의				   #파라미터연습
	// public static 리넡값 메서드면 (#파라미터) { } 
	public static void myint(int a) {System.out.println(a);} 
	public static void myadd(int a,int b) {System.out.println(a+b);} 
	
	public static void main(String[] args) {
		myint(1); // 1출력
		myadd(1,2);
	}
}
