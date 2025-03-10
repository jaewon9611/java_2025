package com.company.java015;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//1. 콜랙션프레임워크 - 배열의 단점을 개선한 [객체]만 저장가능 ( 동적배열 )
//2. List, Set, Map
//   List - index O , 중복허용 O , add/get(번호)/size/remove/contains
//   Set  - index X , 중복허용 X , add/향for, Iterator / size / remove / contains


public class Collection003_Set {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); 
		list.add("one"); 		
		list.add("two"); 
		list.add(new String("three")); // 객체
		System.out.println(list.size() + "/" + list);
		
		Set<String> set = new HashSet<>(); // 주머니 : index X , 중복허용 X
		set.add("one");
		list.add("one"); 		
		list.add("two"); 
		set.add(new String("three"));
		System.out.println(set.size() + "/" + set);
		
		// add , get X , size , remove , contains
		
		Set<Integer> set2 = new HashSet<>(); // int 숫자자료형, [객체만]저장
		// int → Integer , float → Float , double → Double,,,, Wrapper Class
		set2.add(1); //Integer e = 1;
		set2.add(new Integer(2)); // Iteger e = new Integer(2);
		set2.add(3);
		
		int     a = 1; // 값 기초값 (primitive type)
		Integer e = 1; // 부품객체 wrapper - boxed
		System.out.println(a+ "/" + e); // 1/1
		System.out.println(e.byteValue() + "/");
		// 1) 부품객체(클래스) = 기초값 boxed
		// 2) 클래스가 만들어놓은기능을 사용가능
		//  int → Integer , float → Float , double → Double,,,, Wrapper Class
		// 3) Integer.parseInt , Double parseDouble , String.valueOf
		
		// for + size - get
		for(Integer e1 : set2) {System.out.println(e1);} //꺼내오기
		System.out.println("1.add - 2.size" + set2.size());
		System.out.println("3. remove - " + set2.remove(2));
		System.out.println("4. contains - " + set2.contains(1));
		System.out.println(set2);
		
		for(Integer e1 : set2) {System.out.println(e1);}
		
		Iterator <Integer> iter = set2.iterator(); //1. 줄을서시오! iter→[1,3]
		while(iter.hasNext()) {//2.처리대상확인 iter→[1,3]}
		   System.out.println(iter.next()); //3. 꺼내오기
		}
	}
}
