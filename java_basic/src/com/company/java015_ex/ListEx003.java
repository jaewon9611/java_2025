package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserInfo {
	private  String name; 
	private  int age;
	public UserInfo() { super();  }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }

}
public class ListEx003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UserInfo> users = new ArrayList<>();
		
		String input = " ";
		System.out.println("원하는 유저 이름 입력 > "); input = sc.next();
		users.add(new UserInfo("아이언맨" , 50));
		users.add(new UserInfo("헐크" , 40));
		users.add(new UserInfo("캡틴" , 120));
		
		for(int i=0; i<users.size(); i++) {
			UserInfo temp = users.get(i); // 0, 1, 2
			System.out.println(temp.getName() + "/" + temp.getAge());
		}System.out.println(); System.out.println();
		
		for(UserInfo temp : users) {
		System.out.println(temp.getName() + "/" + temp.getAge());
		}System.out.println(); System.out.println();
	
		//if(users.get(0).getName().equals("아이언맨")) {
		//UserInfo temp = users.get(0);
		//System.out.println(temp.getName() + "/" + temp.getAge());}
		for(int i=0; i<users.size(); i++){
			if(users.get(i).getName().equals(input)) {
				UserInfo temp = users.get(i);
				System.out.println(temp.getName() + "/" + temp.getAge()); break;}
		}
	}
}

/*
1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
2. users ArrayList 만들기
3. 다음의 데이터 넣기
   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
4. for+size / 향상된 for 이용해서 데이터 출력
5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력

> 원하는 유저의 이름을 입력하세요    _예) 아이언맨
"아이언맨" , 50
*/