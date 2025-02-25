package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		int sum=0;
		char[] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		//		System.out.println("1꺼내기 : " + ch[0]);
		//		System.out.println("1꺼내기 : " + ch[1]);
		//		System.out.println("1꺼내기 : " + ch[2]);
		//		System.out.println("1꺼내기 : " + ch[3]);
		//		System.out.println("1꺼내기 : " + ch[4]);
		//		System.out.println("1꺼내기 : " + ch[5]);
//		for(int i=0; i<ch.length; i++) {if (i==1 ||i==3 ||i==5) {sum++;}		
//		}
//		System.out.println("a의 갯수:" +sum);
		
		//ver-0 ch 배열에서 a의 갯수 세기
		//ver-1
//		if('B'=='a') {sum++;}
//		if('a'=='a') {sum++;}
		//ver-2
//		if(ch[0]=='a') {sum++;}
//		if(ch[1]=='a') {sum++;}
		
		
		for(int i=0; i<ch.length; i++){if(ch[i]=='a') {sum++;}}
		System.out.println(sum);
	}
}
/*
연습문제4)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx004
1. 배열명 : ch
2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
3. ch 배열에서 a의 갯수 세기
*/