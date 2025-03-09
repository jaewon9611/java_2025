package com.company.java014ex;

interface Calc{public double exec(double num1, double num2);}


public class NoNameClassEx001 {
	public static void main(String[] args) {
		Calc c = new Calc(){

			@Override
			public double exec(double num1, double num2) {
				return num1+num2;}
		};
		System.out.println(c.exec(10,3));  //13  더하기기능
		//interface
		//Calc calc = new Calc(); (X)
		//Calc calc = new Calc(){ 메서드 구현 }; (O)
	}
}
