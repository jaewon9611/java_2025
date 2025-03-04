package part001;

import java.util.Scanner;

public class SelfTest013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		 System.out.print("1~9사이 숫자를 입력하세요 ");
	        a = sc.nextInt(); 

	        System.out.println(a + "단");
	        for (int i = 1; i <= 9; i++) { // 1~9까지 반복
	            System.out.println(a + " * " + i + " = " + (a * i));
	        }
	}
}
