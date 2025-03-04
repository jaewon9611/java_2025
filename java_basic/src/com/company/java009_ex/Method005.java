package com.company.java009_ex;

import java.util.Arrays;

public class Method005 {
	public static void show(int a) {System.out.println(a*10);}
	public static void show(int a , int b, int c) {System.out.print(a*100+"\t"+a*200+"\t"+a*300);}
	
	
	public static void main(String[] args) {
		int []a = {1,2,3};
		// [heap]1번지 {0:1,1:2,2:3} ← [stack]a:1번지
		
		show(1);  // 값 - value → call by value
		show(a[0]);
		
		show( 1 , 2 , 3); // 값 - value → call by value
		show(a[0] , a[1] , a[2]); //100,200,300출력 //
		System.out.println();
		System.out.println("main1. 배열값 :"+ Arrays.toString(a));
		System.out.println("main2. 배열의 주소값 :"+System.identityHashCode(a));
		
		//public static void show(int []a) {}
		show(a); // 주소 = reference → call by reference
		System.out.println("main4.배열값:" + Arrays.toString(a));
		
		
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	public static void show(int []a) {System.out.println("show3. 배열의 주소값 :"    +		System.identityHashCode(a)		);
	a[0]+=10; a[1]+=10; a[2]+=10;
	}
}
