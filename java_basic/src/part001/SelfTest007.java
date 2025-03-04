package part001;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("a b c 중 하나를 입력하세요"); ch=sc.next().charAt(0);
		switch(ch) {
		case 'a' : case 'A': System.out.println("apple"); break;
		case 'b' : case 'B': System.out.println("banana"); break;
 		case 'c' : case 'C': System.out.println("coconut"); break;

		}
	}
}
/*
a,b,c중에 입력해주세요
	a또는 A라면 apple
	b또는 B라면 banana
	c또는 C라면 coconut
	그이외 대소문자 관계없이 a,b,c만 입력가능합니다
*/