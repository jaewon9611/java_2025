package com.company.java015_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		System.out.println("숫자를 입력하세요"); a = sc.nextInt();
		
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		/*
			 if (a==1) {System.out.println(numbers.get(0));}
		else if (a==2) {System.out.println(numbers.get(1));}
		else if (a==3) {System.out.println(numbers.get(2));}
		else {System.out.println("1,2,3중 하나를 입력하세요");}
		*/
		//ver-2
		/*
		for(int i=1; i<numbers.size(); i++)
		{if(a==1) {System.out.println(numbers.get(1-1)); break;}	}
		*/
		//ver-3
		System.out.println(numbers.get(a-1));
		
	}
}
