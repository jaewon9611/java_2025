package part001;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		for(;;) {System.out.println("1~100사이 숫자를 입력하세요"); a=sc.nextInt();
			if(a>=1 && a<=100) {System.out.println("무한반복 종료"); break;}
			else {System.out.println("1~100사이 숫자를 입력하세요");}
		}
	}
}
