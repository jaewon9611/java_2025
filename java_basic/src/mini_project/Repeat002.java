package mini_project;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		int num=0; char a= ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 2 3 중 하나를 입력하세요"); num=sc.nextInt();
		switch(num) {
		case 1: System.out.println("apple"); break;
		case 2: System.out.println("banana"); break;
		case 3: System.out.println("coconut"); break;
		
//		System.out.println("문자 a b c 중 하나를 입력하세요"); a=sc.next().charAt(0);
//		switch(a) {
//		case 'a': System.out.println("apple"); break;
//		case 'b': System.out.println("banana"); break;
//		case 'c': System.out.println("coconut"); break;
			}
		}
	}
/*
숫자를 하나 입력받아
switch ver- a가 'a'면 apple, 'b'면 banana, 'c'면 coconut
*/