package com.company.java009;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 j h c 중 하나를 입력하세요"); ch=sc.next().charAt(0);
		
		if(ch=='j' || ch=='J') {System.out.println("java");}
		else if(ch=='h' || ch=='H') {System.out.println("html");}
		else if(ch=='c' || ch=='C') {System.out.println("css");}
		else {System.out.println(("j h c중 하나를 입력하세요"));}
		}
	}

// if j 면 java h면 html c면 css