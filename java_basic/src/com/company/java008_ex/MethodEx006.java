package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx006 {
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		
		upper(ch); // 
		System.out.println(Arrays.toString(ch));
	//	System.out.println(System.identityHashCode(ch));
		
	//	upper(ch);
		
	}
	public static void upper(char[] ch) {
		System.out.println(System.identityHashCode(ch) );
		for(int i=0; i<ch.length; i++) {ch[i]-=32;}
	}
}
/*
    char[] ch = {'a','b','c'};
    upper(ch);   
    System.out.println("main. 배열값 : "+  Arrays.toString(ch));
    대문자로 변경
}
*/