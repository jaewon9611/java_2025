package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Collection004_map {
	public static void main(String[] args) {
		// key , value -add(X), put, get ,size , remove, contains
		Map<String,String> map = new HashMap<>();
		map.put("one", "하나");
		map.put("two", "둘");
		//map.put("one", "셋"); 키값이 같으면 덮어씀
		map.put("three", "셋");
		
		System.out.println(map);
		System.out.println(map.get("one"));
		System.out.println(map.size()); // 3
		System.out.println(map.remove("three")); // 4. 삭제 key Object(객체)
		System.out.println(map.containsKey("one"));
		System.out.println(map.keySet()); // [one, two] 키값 나열
		System.out.println(map.values()); // [하나, 둘] 밸류값 나열
		System.out.println(map.entrySet()); // [one=하나, two=둘] 키값 밸류값 나열 Set <Entry <String, String>>
		
		//출력 향상된 for
		for( Entry <String, String> e : map.entrySet() ) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		
		// iter - ver1
		// 1. key모으기 2.처리대상확인 3.값 꺼내오기 next
		Iterator <String> iter = map.keySet().iterator(); // iter →[one, two]
		while(iter.hasNext()) {
			 String key =iter.next();
			 System.out.println(key + "/" + map.get(key));
		}
		System.out.println();
		System.out.println();
		
		// iter - ver2
		// 1. Entry모으기 2.처리대상확인 3.값 꺼내오기 [one=하나 , two=둘] 
		Iterator <Entry <String, String>> eter = map.entrySet().iterator();           
		//iter→[one=하나, two=둘]
		while(eter.hasNext()) {// 2.처리대상 확인 hasNext
			 Entry <String, String> temp = eter.next();//3.값꺼내오기
			 System.out.println(temp.getKey() + "/" + temp.getValue());
		}
		
	}
}
/*
List :##5 기차 인덱스여부 [O] , 중복허용여부 [O] , [ add, get, size, remove, contains ]
Set : ##6 주머니 인덱스여부 [X] 중복허용여부 [X] , [add, get(X) 향for, Iterator, size, remove, contains]
Map : ##7 사전 [key, value] 쌍Entry   [add(X) put, get(key) 향상된 for/Iterator  size, remove, contains  ] 
*/