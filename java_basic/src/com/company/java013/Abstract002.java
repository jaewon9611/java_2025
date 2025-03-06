package com.company.java013;

abstract class Shape002{
	abstract void showArea(int w, int h);
	abstract void showArea(int r);
}
class Rectangle002 extends Shape002 {
	@Override void showArea(int w, int h) {System.out.println("사각형의 넓이 : " + w*h);}
	@Override void showArea(int r) {}
	
}

class Circle002 extends Shape002 {
	@Override void showArea(int w, int h) {}
	@Override void showArea(int r) {System.out.println("원의 넓이 : "+r*r*3.14159);  }
	
}
class Triangle002 extends Shape002 {
	@Override void showArea(int w, int h) {System.out.println("삼각형의 넓이 : "+ w*h*0.5);}
	@Override void showArea(int r) {}
	
}

public class Abstract002 {
	public static void main(String[] args) {
		/////// ver-1
		Shape002 shape = null; // shape = new Shape002(); error
		
		shape= new Rectangle002();
		shape.showArea(10,10);
		
		shape = new Circle002();
		shape.showArea(10);
		
		shape = new Triangle002();
		shape.showArea(10,10);
		
		
		System.out.println(); System.out.println(); System.out.println();
		// ver-2
		Shape002 shape2 = null;
		Shape002[]s = {new Rectangle002(), new Circle002(), new Triangle002()};
		//                  Circle이니? shape.showArea(10);
		if(s[0] instanceof Circle002) {s[0].showArea(10);}
		else {s[0].showArea(10,3);}
		
		if(s[1] instanceof Circle002) {s[1].showArea(10);}
		else {s[1].showArea(10,3);}
		
		if(s[2] instanceof Circle002) {s[2].showArea(10);}
		else {s[2].showArea(10,3);}
		
	
		
		
		
		
	}
}
