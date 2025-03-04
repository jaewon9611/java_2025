package com.company.java009;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch= ' ';
		System.out.println("알파벳 j h c 중 하나를 입력하세요"); ch=sc.next().charAt(0);
		switch(ch) {
		case 'j': case 'J': System.out.println("java"); break;
		case 'h': case 'H': System.out.println("html"); break;
		case 'c': case 'C': System.out.println("css"); break;
		}
	}
}
//문자를 입력받아 switch j 면 java h면 html c면 css