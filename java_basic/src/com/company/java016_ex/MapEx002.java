package com.company.java016_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class UserInfo {
	private int no;
	private String name;
	private int age;
	public UserInfo() {}
	public UserInfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	public UserInfo(String name, int age) {this.name = name; this.age = age;}
	@Override public String toString() { return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class MapEx002 {
	public static void main(String[] args) {
		Map<Integer,UserInfo> map = new HashMap<>();
		map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
		map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
		map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
		map.put(  1,  new UserInfo("아이언맨-new", 50) ); 
//		int a = 1;
//		Integer e = 1;
//		System.out.println(a + "/" + e.byteValue());
		
		for(Integer key : map.keySet()) {System.out.println(key+ "/"+ map.get(key));}
		System.out.println();
		System.out.println();
		
		for(Entry<Integer,UserInfo> m :map.entrySet()) {
			System.out.println(m.getKey() + "/" + m.getValue());
		}
		
		
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) { //2. 처리대상확인
			Integer key = iter.next();
			System.out.println(key + "/" + map.get(key));
		}
		Iterator <Entry <Integer, UserInfo>> miter =map.entrySet().iterator();
		while(miter.hasNext()) {
			Entry <Integer, UserInfo> temp= miter.next();
			System.out.println(temp.getKey() + "/" + temp.getValue());
		}
	}
}
/*
Q1. HashMap만들기
Q2. 아래데이터 넣기
map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
map.put(  1,  new UserInfo("아이언맨-new", 50) ); 
*/