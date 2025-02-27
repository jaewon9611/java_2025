package com.company.java009;

public class Repeat007 {
	public static void    hi()            {System.out.println("hi");}
	public static void    hi(int a)       {System.out.println("hi " +a);}
	public static String  hi(String str)  {return "hi " +str;}
	
	public static void main(String[] args) {
		

		hi(); // hi출력
		//public static void hi(int a) {syso
		hi(1); //hi 1님! 출력
		System.out.println(hi("sally")); // hi sally 출력
	}
}
/*
public static void main(String[] args){
    hi();   // hi 출력
    hi(1);   // hi 1 님! 출력
    System.out.println( hi("sally") );   // hi sally 출력
*/