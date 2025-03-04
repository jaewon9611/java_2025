package com.company.java009;

public class Method006_String_equals {
	public static void main(String[] args) {
		String str1= "apple";
		String str2= "apple";
		String str3= new String("apple");
		
		System.out.println("1 값 출력:" + str1 + ",\t" + str2 + ",\t" + str3);
		
		System.out.println("2 같은지 확인 : " + (str1==str2) + ",\t" + (str2==str3));
		//										true					false
		
		System.out.println("3 주소값 확인 : " +
		System.identityHashCode(str1)	    + ",\t" + //  1705736037
		System.identityHashCode(str2) 		+ ",\t" + //  1705736037
		System.identityHashCode(str3)		 		  //  455659002
		);
		
		System.out.println("4 문자열의 값비교 - equals : " + 
		str1.equals(str2) + ",\t"+ str1.equals(str3));
	}
}
