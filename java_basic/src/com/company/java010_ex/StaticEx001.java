package com.company.java010_ex;

class Area1 {
	static double pi = 3.14159;
	static double rect;
	static double triangle;
	public static double rect(int i, int j) {
		return i*j;
		
	}
	public static double triangle(int i, int j) {
		return i*j/2;
	}
}

public class StaticEx001 {
	public static void main(String[] args) {
		System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	}
}
/*
class Area1 작성해주세요   ※ pi값은 3.14159
public class StaticEx001{
  public static void main(String[] args) {  
   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
  }
}

출력내용 : 
원의 면적    : 314.159
사각형의 면적 : 50.0
삼각형의 면적 : 25.0
*/