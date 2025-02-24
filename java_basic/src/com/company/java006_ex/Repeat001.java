package com.company.java006_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력"); a = sc.nextInt();
		if(a==10) {System.out.println("10이다");} 
		else if(a==20) {System.out.println("20이다");} 
		else if(a==30) {System.out.println("30이다");}
	}
}
