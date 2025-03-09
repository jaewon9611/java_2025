package com.company.java014;

import java.util.Scanner;

public class Exception001 {
	public static void main(String[] args) {
		int a=-1;
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 try{
			System.out.println("숫자를 입력하세요"); a = sc.nextInt();
			if(a==1) {break;}
		}catch(Exception e ) {
			 sc.next();
			 System.out.println("숫자입력!!!!!!!!!!!!!!!!!");
		}
	}System.out.println("결과물 :" + a);
	}
}
//Exception