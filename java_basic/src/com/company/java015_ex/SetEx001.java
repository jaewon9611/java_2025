package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


// set: 주머니 순서X 중복허용X / add, get(X) 향for/Iterator, size,remove, contains
public class SetEx001 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("green");
		
		//1. 향상된 for
		for(String c: colors) {System.out.println(c);} System.out.println();
		
		//2. iterator
		Iterator<String> iter = colors.iterator(); // set요소들 모으기
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(colors);
		System.out.println(colors.size()); //3개
	}
}
/*
1.  Hash이용해서 colors 만들기
2. red, green, blue ,green 데이터 추가
3. 출력
4. 갯수출력  
*/