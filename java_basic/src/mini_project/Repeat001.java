package mini_project;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 2 3 을 입력하세요"); num=sc.nextInt();
		if(num==1) {System.out.println("apple");}
		else if(num==2) {System.out.println("banana");}
		else if(num==3) {System.out.println("coconut");}
		else {System.out.println("숫자 1 2 3 중 하나를 입력하세요");}
		
//		 char a; 
//	        System.out.println("문자 'a', 'b', 'c' 중 하나를 입력하세요:");
//	        a = sc.next().charAt(0); // 문자열에서 첫 번째 문자만 입력받기
//
//	        if (a == 'a') {
//	            System.out.println("apple");}
//	         else if (a == 'b') {System.out.println("banana");}
//	         else if (a == 'c') {System.out.println("coconut");} 
//	         else {
//	            System.out.println("문자 'a', 'b', 'c' 중 하나를 입력하세요.");
	}
}
/*
숫자 하나를 입력받아 
if ver- a가 'a'이면 apple, 'b' banana , 'c'면 coconut
*/