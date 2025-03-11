package part002;

import java.util.Scanner;

public class Repeat010 {
	public static int nextInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return sc.nextInt(); //a
	}

	public static void main(String[] args) {
		int one = 0;
		while(true) {one = nextInt(); if(one==1) {break;}
		}
	}
}
/*
throws를 이용해 코드를 수정하여 다음과 같이 출력하시오.
숫자1을 입력받을때까지 무한반복하시오.


*/