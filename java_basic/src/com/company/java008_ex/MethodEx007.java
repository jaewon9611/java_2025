package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx007 {
	public static void who_are_you(String [][] users){

	//변수
	String id = " "; String result =" ";
	Scanner sc = new Scanner(System.in);
	//입력
	System.out.println("아이디를 입력해주세요 >"); id=sc.next();
	//처리
	//출력
	// if(입력받은 id가 "aaa"라면){aaa는 한국사람입니다.}
	// if(id.equals(users[0][0]) {users[0][0]+"는"+ users[0][2]+ "사람입니다."}
	// if(id.equals(users[1][0]) {users[1][0]+"는"+ users[1][2]+ "사람입니다."}
	// if(id.equals(users[2][0]) {users[2][0]+"는"+ users[2][2]+ "사람입니다."}
	// 입력받은 id가 "bbb"라면 / bbb는 호주사람
	// 입력받은 id가 "ccc"라면 / ccc는 중국사람
	for(int ch=0; ch<users.length; ch++) {if(id.equals(users[ch][0])) {result=users[ch][0]+"는 "+ users[ch][2]+ "사람입니다.";}
	}
	System.out.println(result);
}
	
	public static void main(String[] args) {
		String [][] users = {{ "aaa" , "111"   , "한국"     } ,     // 00 01 02
							 { "bbb" , "222"   , "호주"       } ,       // 10 11 12
							 { "ccc" , "333"   , "중국"      }};      // 20 21 22
			// 입력
		   who_are_you(users);
		   // public static 리턴값 메서드명(파라미터){해야할일}
		   
		   
		   //  System.out.println(Arrays.toString(users));
		   who_pass_change(users); 
		   // public static 리턴값 메서드명(파라미터){해야할일}
	}
	public static void who_pass_change(String[][] users) {
		
		String temp_id="" , temp_pass=""; String result = "유저를 확인해주세요";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요 > "); temp_id=sc.next();
		System.out.println("비밀번호를 입력해 주세요 > "); temp_pass=sc.next();
		int find=-1;
		for(int ch=0; ch<users.length; ch++){
			if(temp_id.equals(users[ch][0]) && temp_pass.equals(users[ch][1])) {find=ch; break;}
		}
		
		if(find!= -1) {
			System.out.println("변경하실 비밀번호를 입력해주세요 > ");
			users[find][1] = sc.next(); result = Arrays.toString(users[find]);
		}
		System.out.println(result);
	}
}


/*
출력내용) who_are_you(users);
아이디를 입력해주세요>aaa
aaa는 한국사람입니다.


출력내용)
who_pass_change(users); 

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 123
유저를 확인해주세요!

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 222
변경하실 비밀번호를 입력해주세요123
정보확인 : [bbb, 123, 호주]
 */