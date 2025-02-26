package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int a) {System.out.println(a);}
	public static void test2(double a) {System.out.println(a);}
	public static void hap(int a , int b) {
		int box=0; for(int i=a; i<=b; i++){box+=i;}
		System.out.println(box);
		}
	public static void disp(int a , char b) {
		for(int i=0; i<=a; i++){System.out.print(b);}
		}
	
	
	//////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		test1(10);
		test2(1.2);
		hap(3,5);
		//public static void hap(3,5) {3+4+5 한값 12출력}
		//public static void hap(int a , int b){3+4+5 한값 12출력}
		
		disp(7, '*');
		//public static void hap(7,'*') {*이 7번출력}
				//public static void hap(int a , char b){'*'을 a 만큼 출력}
	}
	//////////////////////////////////////////////////////////////////////
}
