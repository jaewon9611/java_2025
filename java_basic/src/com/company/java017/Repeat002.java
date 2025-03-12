package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

class Milk {
	private int no; private String name; private int price;
	public Milk() {super();}
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	@Override public int hashCode() { return Objects.hash(name, no, price);}
	@Override public boolean equals(Object obj) { if (this == obj) return true; if (obj == null) return false; if (getClass() != obj.getClass()) return false; Milk other = (Milk) obj; return Objects.equals(name, other.name) && no == other.no && price == other.price; } 
}

public class Repeat002 {
	public static void main(String[] args) {
		ArrayList<Milk> milks = new ArrayList<>();
		//add-추가, get-가져오기, size-갯수, remove-삭제, contains-포함
		milks.add(new Milk(1 , "white" , 1000));
		milks.add(new Milk(2 , "choco" , 1200));
		milks.add(new Milk(3 , "banana" , 1300));
		System.out.println("===================="
				+"\nNo \t NAME \t PRICE");
		System.out.println("====================");
		Iterator <Milk> iter1=milks.iterator(); //1 모으기
		while(iter1.hasNext()) {// 2 처리대상 확인
			Milk temp = iter1.next(); //3 꺼내오기
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}// List end
		System.out.println(); System.out.println();
		
		HashSet<Milk> milks2 = new HashSet<>();
		// Set : index X , 중복허용x /add, get(x), size, remove, contains
		milks2.add(new Milk(1 , "white" , 1000)); // new Milk - heap area
		milks2.add(new Milk(2 , "choco" , 1200)); // add(주소값)
		milks2.add(new Milk(3 , "banana" , 1300));// 1)hashCode (Milk) 2) equals
		Iterator<Milk> iter2 = milks.iterator(); // set모으기
		System.out.println("===================="
				+"\nNo \t NAME \t PRICE");
		System.out.println("====================");
		while(iter2.hasNext()) {// 2. 처리대상확인
			Milk temp = iter2.next();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" 
			+ temp.getPrice());
		}// Hash end
		System.out.println(); System.out.println();
		
		HashMap<Integer, Milk> milks3 = new HashMap<>();
		// Map : Map<Key:Integer:객체,Value:Milk:객체> / put, get(key), size, remove,contains
		milks3.put(1, new Milk(1, "white", 1000)); 
		// Key   : Integer i =1; - Wrapper - boxing
		// Value : Milk milk = new Milk(1,"white", 1000);
		milks3.put(2, new Milk(2, "choco", 1200));
		milks3.put(3, new Milk(3, "banana", 1300));
		
		System.out.println( milks3.entrySet());
		//[1=Milk[no=1, name=white, price=1000],
		Iterator <Entry <Integer, Milk>> iter3=milks3.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry <Integer, Milk> key_value = iter3.next();
			//                  1=Milk [no=1, name=white, price=1000]
			System.out.println(key_value.getKey());
			System.out.println(key_value.getValue());
			Milk temp = key_value.getValue();
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}
			
	}
}
/*
2.dto 를 이용하여 ArrayList + Iterator 이용해서 만들기 >> ArrayList<Milk>
2.dto 를 이용하여 HashSet + Iterator 이용해서 만들기 >> HashSet<Milk>
2.dto 를 이용하여 HashMap + Iterator 이용해서 만들기 >> HashMap<Integer, Milk>

ㅁ 출력 결과 (3번 출력)
====================
No NAME   PRICE
====================
1 white   1000
2 choco   1200
3 banana  1300


*/