package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {System.out.print(i + "\t");} System.out.println();
		int i=1;	while(i<=5) {System.out.print(i + "\t");i++;} System.out.println();
		i=1; do{System.out.print(i + "\t");i++;}while(i<=5);  System.out.println();
		
		
		for(int o=5; o>=1; o--) {System.out.print(o + "\t");} System.out.println();
		int o=5;	while(o>=1) {System.out.print(o + "\t");o--;} System.out.println();
		o=5;	do{System.out.print(o + "\t");o--;}while(o>=1); System.out.println();
		
		
		for(int a=1; a<=3; a++) {System.out.print("JAVA"+ a + "\t");} System.out.println();
		int a=1;	while(a<=3) {System.out.print("JAVA"+ a + "\t");a++;} System.out.println();
		a=1;	do{System.out.print("JAVA"+ a + "\t");a++;}while(a<=3); System.out.println();
	}
}
