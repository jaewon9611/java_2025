package com.company.java017;

	interface InterTest21 { void test();      }
	interface InterTest22 { void test(int a); }
	interface InterTest23 { int  test();       }
	interface InterTest24 { int  test(int a);  }
	
public class Repeat003_Lambda {
	public static void main(String[] args) {
		InterTest21 test1 = new InterTest21(){
			@Override public void test() {System.out.println("안녕");}
		}; //test1.test();
//		InterTest21 test2 = () -> {System.out.println("안녕");}; test2.test();
		InterTest21 test3 = () -> System.out.println("안녕"); test3.test();
		System.out.println(); System.out.println();
		
		InterTest22 test4 = new InterTest22() {
			@Override public void test(int a) {System.out.println("안녕".repeat(2));}
			}; //test4.test(2);
		InterTest22 test5 = a -> System.out.println("안녕".repeat(2)); test5.test(2);
		System.out.println(); System.out.println();
			
		InterTest23 test6 = () -> 3;  //InterTest23 test6 = () -> {return 3;};
		System.out.println(test6.test()); 
		System.out.println(); System.out.println();
		
		InterTest24 test7 = a -> a*10;//InterTest24 test7 = (a) -> {return a*10;};
		System.out.println(test7.test(3));
		}
	}

//람다식으로 구현
// Q1. test1.test(); //안녕
// Q2. test2.test(2); //안녕안녕
// Q3. System.out.println(test3.test()); // 3
// Q4. System.out.println(test4.test(3)); //30